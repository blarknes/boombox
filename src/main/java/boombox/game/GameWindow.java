package boombox.game;

import static javafx.scene.paint.Color.ALICEBLUE;

import boombox.settings.Settings;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.stage.Stage;
import lombok.val;

/**
 * Configuration class for the methods related to the game window.
 */
public class GameWindow {

    /**
     * Builds and adds the basic elements of the main menu to the game stage.
     *
     * @param stage    The Application Stage.
     * @param settings The User Settings.
     */
    public void setupMainMenu(final Stage stage, final Settings settings) {
        val group = new Group();
        val scene = new Scene(group);
        scene.setFill(ALICEBLUE);

        stage.setScene(scene);
    }

}
