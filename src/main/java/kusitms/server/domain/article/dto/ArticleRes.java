package kusitms.server.domain.article.dto;

import kusitms.server.domain.article.entity.Tag;
import lombok.Builder;

import java.util.List;

public class ArticleRes {

    private String slug;
    private String title;
    private String description;
    private String body;
    private List<String> tagList;
    private String createdAt;
    private String updatedAt;

    @Builder

    public ArticleRes(String slug, String title, String description, String body, List<Tag> tagList, String createdAt, String updatedAt) {
        this.slug = slug;
        this.title = title;
        this.description = description;
        this.body = body;
        for (Tag s : tagList) {
            this.tagList.add(s.getName());
        }
        this.createdAt = createdAt;
        this.updatedAt = updatedAt;
    }
}


