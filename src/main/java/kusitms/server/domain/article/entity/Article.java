package kusitms.server.domain.article.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import kusitms.server.domain.global.BaseEntity;
import lombok.Builder;
import lombok.Getter;

import java.util.ArrayList;
import java.util.List;

@Entity
@Getter
public class Article extends BaseEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
//    private String slug;
    private String title;
    private String description;
    private String body;

    private List<Tag> tagList = new ArrayList<>();

    @Builder
    public Article(String title, String description, String body, List<String> tagList) {
        this.title = title;
        this.description = description;
        this.body = body;
        for (String s : tagList) {
            this.tagList.add(Tag.valueOf(s));
        }
    }
}
