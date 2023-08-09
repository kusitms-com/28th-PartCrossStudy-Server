package kusitms.server.domain.article.dto;

import io.swagger.v3.oas.annotations.media.Schema;
import lombok.*;

import java.util.ArrayList;
import java.util.List;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Schema(description = "Article 작성,수정 객체")
public class ArticleReq {
    @Schema(description = "Article 제목", nullable = false)
    private String title;
    @Schema(description = "Article 정의", nullable = false)
    private String description;
    @Schema(description = "Article 내용", nullable = false)
    private String body;
        @Schema(description = "Article Tag 목록", nullable = false)
    private List<String> tagList = new ArrayList<>();


}