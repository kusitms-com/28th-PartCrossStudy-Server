package kusitms.server.domain.article.dto;

import lombok.Getter;

import java.util.List;

@Getter
public class ArticleReq {

    private String title;
    private String description;
    private String body;
    private List<String> tagList;


}