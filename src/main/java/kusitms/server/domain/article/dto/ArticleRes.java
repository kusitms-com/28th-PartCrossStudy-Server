package kusitms.server.domain.article.dto;

import io.swagger.v3.oas.annotations.media.Schema;
import kusitms.server.domain.article.entity.Tag;
import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

import java.util.ArrayList;
import java.util.List;
@Getter
@Setter
@Schema(description = "Article 응답 객체")
public class ArticleRes {
    @Schema(description = "Article ID", nullable = false)
    private Long articleId;
    @Schema(description = "Article 제목", nullable = false)
    private String title;
    @Schema(description = "Article 정의", nullable = false)
    private String description;
    @Schema(description = "Article 내용", nullable = false)
    private String body;
    @Schema(description = "Article Tag 목록 (STUDY,HEALTH,DRINK,OTHER)", nullable = false)
    private List<String> tagList = new ArrayList<>();
    @Schema(description = "Article 작성 시각", nullable = false)
    private String createdAt;
    @Schema(description = "Article 수정 시각", nullable = false)
    private String updatedAt;

    @Builder
    public ArticleRes(Long articleId, String title, String description, String body, List<String> tagList, String createdAt, String updatedAt) {
        this.articleId = articleId;
        this.title = title;
        this.description = description;
        this.body = body;
        this.tagList = tagList;
        this.createdAt = createdAt;
        this.updatedAt = updatedAt;
    }

}


