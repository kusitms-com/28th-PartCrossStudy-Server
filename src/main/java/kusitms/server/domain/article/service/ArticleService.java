package kusitms.server.domain.article.service;

import kusitms.server.domain.article.dto.ArticleReq;
import kusitms.server.domain.article.dto.ArticleRes;
import kusitms.server.domain.article.entity.Article;
import kusitms.server.domain.article.mapper.ArticleMapper;
import kusitms.server.domain.article.repository.ArticleRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@RequiredArgsConstructor
@Service
public class ArticleService {

    private final ArticleRepository articleRepository;
    private final ArticleMapper articleMapper;

    public ArticleRes createArticle(ArticleReq articleReq) {

        Article article = articleMapper.toEntity(articleReq);

        articleRepository.save(article);

        return articleMapper.toRes(article);
    }

    public List<ArticleRes> getArticles() {
        List<Article> findAll = articleRepository.findAll();
        List<ArticleRes> returnAll = new ArrayList<>();
        for (Article article : findAll) {
            returnAll.add(articleMapper.toRes(article));
        }
        return returnAll;
    }

    public ArticleRes getArticle(Long articleId) {
        Article article = articleRepository.findById(articleId).orElseThrow();
        return articleMapper.toRes(article);
    }

    public ArticleRes updateArticle(Long articleId, ArticleReq articleReq) {

        Article article = articleRepository.findById(articleId).orElseThrow();

        articleRepository.save(article);

        return articleMapper.toRes(article);
    }

    public void deleteArticle(Long articleId) {
        Article article = articleRepository.findById(articleId).orElseThrow();
        articleRepository.delete(article);
    }
}
