package kusitms.server.domain.article.entity;

import lombok.Getter;
import lombok.RequiredArgsConstructor;
import lombok.ToString;

@RequiredArgsConstructor
@Getter
@ToString
public enum Tag {

    STUDY("study"),
    HEALTH("health"),
    DRINK("drink"),
    OTHER("other");

    private final String name;
}
