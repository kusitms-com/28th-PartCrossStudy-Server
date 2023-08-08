package kusitms.server.domain.article.entity;

import kusitms.server.domain.article.dto.ArticleReq;
import kusitms.server.domain.article.dto.ArticleRes;

public class ArticleMapper {
    public ArticleRes toRes(Article article) {
        return ArticleRes.builder()
                .title(article.getTitle())
                .description(article.getDescription())
                .body(article.getBody())
                .tagList(article.getTagList())
                .createdAt(article.getCreatedDate().toString())
                .updatedAt(article.getUpdatedDate().toString())
                .build();
    }

    public Article toEntity(ArticleReq articleReq) {
        return Article.builder()
                .title(articleReq.getTitle())
                .description(articleReq.getDescription())
                .body(articleReq.getBody())
                .tagList(articleReq.getTagList())
                .build();
    }
}
