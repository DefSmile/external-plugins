package java.com.shibe.herblore;

import lombok.AllArgsConstructor;
import lombok.Getter;

@AllArgsConstructor
public enum HerbloreState {
    WALKKING("Walking"),
    MAKING_POTION("Making Potion"),
    DOING_QUEST("Doing Quest");

    @Getter
    private final String name;

}
