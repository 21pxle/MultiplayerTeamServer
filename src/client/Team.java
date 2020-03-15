package client;

import javafx.scene.paint.Color;

public enum Team {
    RED(Color.RED, "Red"),
    BLUE(Color.BLUE, "Blue"),
    NONE(Color.BLACK, "None");

    private final Color code;
    private final String colorString;

    Team(Color code, String colorString) {
        this.code = code;
        this.colorString = colorString;
    }

    public Color getColor() {
        return code;
    }

    public String getColorString() {
        return colorString;
    }
}
