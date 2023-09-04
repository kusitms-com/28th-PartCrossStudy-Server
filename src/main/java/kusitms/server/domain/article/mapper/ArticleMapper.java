package kusitms.server.domain.article.mapper;

import kusitms.server.domain.article.dto.ArticleReq;
import kusitms.server.domain.article.dto.ArticleRes;
import kusitms.server.domain.article.entity.Article;
import kusitms.server.domain.article.entity.Tag;
import org.hibernate.annotations.Comment;
import org.springframework.boot.json.JsonParseException;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.EnumSet;
import java.util.List;

@Component
public class ArticleMapper {
    public ArticleRes toRes(Article article) {
        List<Tag> tags = new ArrayList<>();
        tags.addAll(article.getTags());

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

            // List<String> to List<Tag>
            List<Tag> tagList = new ArrayList<>();
            tagList.addAll(articleReq.getTagList());

            // List<Tag> to EnumSet<Tag>
            EnumSet<Tag> tags = EnumSet.copyOf(tagList);

            return Article.builder()
                    .title(articleReq.getTitle())
                    .description(articleReq.getDescription())
                    .body(articleReq.getBody())
                    .tagList(tags)
                    .build();

    }
}
