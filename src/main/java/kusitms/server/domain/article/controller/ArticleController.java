package kusitms.server.domain.article.controller;


import kusitms.server.domain.article.dto.ArticleReq;
import kusitms.server.domain.article.dto.ArticleRes;
import kusitms.server.domain.article.service.ArticleService;
import lombok.AllArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@AllArgsConstructor
@RequestMapping("/articles")
//@Api(tags = "Team API")
public class ArticleController {

    private final ArticleService articleService;

    @GetMapping()
    public ResponseEntity<List<ArticleRes>> getArticles() {
        return new ResponseEntity<>(articleService.getArticles(), HttpStatus.OK);
    }

    @PostMapping()
    public ResponseEntity<ArticleRes> createArticle(ArticleReq articleReq) {
        return new ResponseEntity<>(articleService.createArticle(articleReq), HttpStatus.OK);
    }

    @GetMapping("/{articleId}")
    public ResponseEntity<ArticleRes> getArticle(@PathVariable(name = "articleId") Long articleId, ArticleReq articleReq) {
        return new ResponseEntity<>(articleService.getArticle(articleId), HttpStatus.OK);
    }

    @PutMapping("/{articleId}")
    public ResponseEntity<ArticleRes> updateArticle(@PathVariable(name = "articleId") Long articleId, ArticleReq articleReq) {
        return new ResponseEntity<>(articleService.updateArticle(articleId,articleReq), HttpStatus.OK);
    }

    @DeleteMapping("/{articleId}")
    public ResponseEntity<?> deleteArticle(@PathVariable(name = "articleId") Long articleId, ArticleReq articleReq) {
        articleService.deleteArticle(articleId);
        return new ResponseEntity<>(HttpStatus.OK);

    }

}
