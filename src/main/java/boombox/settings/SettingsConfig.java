package boombox.settings;

import static boombox.environment.Constants.SETTINGS_FILE_PATH;
import static com.fasterxml.jackson.databind.MapperFeature.ACCEPT_CASE_INSENSITIVE_ENUMS;

import java.io.File;
import java.io.IOException;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.json.JsonMapper;

import boombox.exception.SettingsParsingException;
import lombok.Getter;

/**
 * Settings helper class to get the game settings.
 */
public class SettingsConfig {

    private final ObjectMapper objectMapper = JsonMapper.builder().enable(ACCEPT_CASE_INSENSITIVE_ENUMS).build();

    @Getter
    private Settings settings;

    /**
     * Constructor to fetch the game settings from the settings file.
     */
    public SettingsConfig() {
        this.settings = deserializeSettings();
    }

    private Settings deserializeSettings() {
        try {
            return objectMapper.readValue(new File(SETTINGS_FILE_PATH), Settings.class);
        } catch (IOException e) {
            throw new SettingsParsingException();
        }
    }

}
