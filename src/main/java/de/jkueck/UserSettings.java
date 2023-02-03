package de.jkueck;

import lombok.Getter;

public enum UserSettings {

    LAYOUT_COLOR("amber"),
    COMPONENT_COLOR("blue");

    @Getter
    private String value;

    UserSettings(String value) {
        this.value = value;
    }

}
