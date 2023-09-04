package kusitms.server.domain.global.response;

import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor
public enum ErrorCode {

    BAD_TAG_LIST("410", "올바른 tag를 입력하세요.");


    private String errorCode;
    private String message;

}