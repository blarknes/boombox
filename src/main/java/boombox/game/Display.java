package boombox.game;

import static boombox.settings.WindowMode.FULLSCREEN;
import static javafx.stage.StageStyle.UNDECORATED;

import boombox.settings.Settings;
import javafx.stage.Stage;
import lombok.val;

/**
 * Configuration class for the display options of the game window.
 */
public class Display {

    /**
     * Sets up the window size and options based on the user settings.
     *
     * @param stage    The Application Stage.
     * @param settings The User Settings.
     */
    public void setup(final Stage stage, final Settings settings) {
        val windowMode = settings.windowMode();
        stage.centerOnScreen();

        stage.setWidth(settings.windowWidth());
        stage.setHeight(settings.windowHeight());

        if (windowMode == FULLSCREEN) {
            stage.initStyle(UNDECORATED);
            // stage.setFullScreenExitHint("");
            stage.setMaximized(true);
        }
    }

}
