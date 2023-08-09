package kusitms.server.domain.article.entity;

import kusitms.server.domain.article.dto.ArticleReq;
import kusitms.server.domain.article.dto.ArticleRes;
import org.hibernate.annotations.Comment;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
public class ArticleMapper {
    public ArticleRes toRes(Article article) {
        List<String> tags = new ArrayList<>();
        for (Tag s : article.getTags()) {
            tags.add(s.getName());
        }
        return  ArticleRes.builder()
                .articleId(article.getId())
                .title(article.getTitle())
                .description(article.getDescription())
                .body(article.getBody())
                .tagList(tags)
                .createdAt(article.getCreatedDate().toString())
                .updatedAt(article.getUpdatedDate().toString())
                .build();
    }

    public Article toEntity(ArticleReq articleReq) {

        List<Tag> tags = new ArrayList<>();
        for (String s : articleReq.getTagList()) {
            tags.add(Tag.valueOf(s));
        }

        return Article.builder()
                .title(articleReq.getTitle())
                .description(articleReq.getDescription())
                .body(articleReq.getBody())
                .tagList(tags)
                .build();
    }
}
