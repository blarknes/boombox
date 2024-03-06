package boombox;

import boombox.game.Display;
import boombox.game.GameWindow;
import boombox.settings.Settings;
import boombox.settings.SettingsConfig;
import javafx.application.Application;
import javafx.stage.Stage;

public class Boombox extends Application {

    public static void main(String[] args) {
        launch(args);
    }

    private final SettingsConfig settingsConfig = new SettingsConfig();
    private final Settings settings = settingsConfig.getSettings();
    private final Display display = new Display();
    private final GameWindow gameWindow = new GameWindow();

    @Override
    public void start(final Stage stage) throws Exception {
        display.setup(stage, settings);
        gameWindow.setupMainMenu(stage, settings);

        render(stage);
    }

    private void render(final Stage stage) {
        stage.show();
    }

}
