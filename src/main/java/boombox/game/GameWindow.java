package boombox.game;

import static javafx.scene.paint.Color.ALICEBLUE;

import boombox.game.menu.MenuButton;
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

        setupButtons(stage, group);

        stage.setScene(scene);
    }

    private void setupButtons(final Stage stage, final Group group) {
        val centerPosX = stage.getWidth() / 2;

        val play = new MenuButton("PLAY", centerPosX, 100).render();
        val stats = new MenuButton("STATS", centerPosX, 150).render();
        val quit = new MenuButton("QUIT", centerPosX, 200).render();
        val settings = new MenuButton("COG", centerPosX, 250).render();

        group.getChildren().addAll(
            play, stats, quit, settings
        );
    }

}
