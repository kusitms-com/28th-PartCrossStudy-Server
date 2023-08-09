package kusitms.server.domain.article.controller;


import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.Parameter;
import io.swagger.v3.oas.annotations.tags.Tag;
import kusitms.server.domain.article.dto.ArticleReq;
import kusitms.server.domain.article.dto.ArticleRes;
import kusitms.server.domain.article.service.ArticleService;
import lombok.AllArgsConstructor;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
@Tag(name = "Article API", description = "Article CRUD API")

@CrossOrigin(origins = "*")
@RestController
@RequiredArgsConstructor
@RequestMapping("api/v1/articles")
public class ArticleController {

    private final ArticleService articleService;

    @Operation(summary = "모든 Article 조회", description = "모든 Article을 조회합니다.")
    @GetMapping()
    public ResponseEntity<List<ArticleRes>> getArticles() {
        return new ResponseEntity<>(articleService.getArticles(), HttpStatus.OK);
    }
    @Operation(summary = "Article 작성", description = "Article을 작성합니다.")
    @PostMapping()
    public ResponseEntity<ArticleRes> createArticle(@RequestBody ArticleReq articleReq) {
        return new ResponseEntity<>(articleService.createArticle(articleReq), HttpStatus.OK);
    }
    @Operation(summary = "Article 조회", description = "Article을 조회합니다.")
    @GetMapping("/{articleId}")
    public ResponseEntity<ArticleRes> getArticle(@PathVariable Long articleId) {
        return new ResponseEntity<>(articleService.getArticle(articleId), HttpStatus.OK);
    }
    @Operation(summary = "Article 수정", description = "Article을 수정합니다.")
    @PutMapping("/{articleId}")
    public ResponseEntity<ArticleRes> updateArticle(@PathVariable Long articleId, @RequestBody ArticleReq articleReq) {
        return new ResponseEntity<>(articleService.updateArticle(articleId,articleReq), HttpStatus.OK);
    }
    @Operation(summary = "Article 삭제", description = "Article을 삭제합니다.")
    @DeleteMapping("/{articleId}")
    public ResponseEntity<?> deleteArticle(@PathVariable Long articleId) {
        articleService.deleteArticle(articleId);
        return new ResponseEntity<>(HttpStatus.OK);
    }

}
