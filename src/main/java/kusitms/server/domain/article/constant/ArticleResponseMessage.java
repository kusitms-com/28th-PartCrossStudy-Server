package kusitms.server.domain.article.constant;

import lombok.Getter;
import lombok.RequiredArgsConstructor;

@Getter
@RequiredArgsConstructor
public enum ArticleResponseMessage {
    CREATE_ARTICLE_SUCCESS("아티클 생성에 성공하였습니다."),
    UPDATE_ARTICLE_SUCCESS("아티클 수정에 성공하였습니다."),
    DELETE_ARTICLE_SUCCESS("아티클 삭제에 성공하였습니다."),
    GET_ARTICLE_SUCCESS("아티클 조회에 성공하였습니다.");

    private final String message;
}
