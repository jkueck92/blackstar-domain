package de.jkueck;

import lombok.Getter;

@Getter
public enum WordpressPostImage {

    ASSISTANCE("https://feuerwehr-ritterhude.de/wp-content/uploads/2021/08/fw-hilfeleistung.png", "Hilfeleistung"),

    FIRE("https://feuerwehr-ritterhude.de/wp-content/uploads/2021/07/fw-feuer.png", "Feuer"),

    SUPPORT("https://feuerwehr-ritterhude.de/wp-content/uploads/2021/12/fw-unterstuetzung.png", "Unterstuetzung");

    private String src;

    private String alt;

    private String wpClass = "wp-image-3924";

    WordpressPostImage(String src, String alt) {
        this.src = src;
        this.alt = alt;
    }

}
