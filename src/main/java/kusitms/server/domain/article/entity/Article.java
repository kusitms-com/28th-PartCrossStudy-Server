package kusitms.server.domain.article.entity;

import jakarta.persistence.*;
import kusitms.server.domain.global.BaseEntity;
import lombok.Builder;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.EnumSet;
import java.util.List;

@Entity
@Getter
@Setter
@ToString
public class Article extends BaseEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
//    private String slug;
    private String title;
    private String description;
    private String body;

    @Convert(converter = SetTagConverter.class)
    private EnumSet<Tag> tags;

    public Article() {

    }

    @Builder
    public Article(String title, String description, String body, EnumSet<Tag> tagList) {
        this.title = title;
        this.description = description;
        this.body = body;
        this.tags = tagList;

    }

    public void setArticle(Article article) {
        title = article.getTitle();
        description = article.getDescription();
        body = article.getBody();
        tags = article.getTags();
    }



}
