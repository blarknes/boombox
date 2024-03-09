package boombox.game.menu;

import javafx.scene.control.Button;
import lombok.AllArgsConstructor;
import lombok.val;

/**
 * Custom class for the main menu buttons.
 */
@AllArgsConstructor
public class MenuButton {

    private String text;
    private double posX;
    private double posY;

    /**
     * Builds and renders a {@code Button} and set his position on the screen.
     *
     * @see Button
     *
     * @return The built JavaFX button.
     */
    public Button render() {
        val button = new Button(this.text);
        button.setTranslateX(this.posX);
        button.setTranslateY(this.posY);

        return button;
    }

}
