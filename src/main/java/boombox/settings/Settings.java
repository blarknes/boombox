package boombox.settings;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * The Data Transfer Object used to store the game settings.
 */
@JsonIgnoreProperties(ignoreUnknown = true)
public record Settings(
    @JsonProperty("window_mode") WindowMode windowMode,
    @JsonProperty("window_width") Integer windowWidth,
    @JsonProperty("window_height") Integer windowHeight,
    @JsonProperty("volume_general") Integer volumeGeneral,
    @JsonProperty("volume_music") Integer volumeMusic,
    @JsonProperty("volume_sound") Integer volumeSound
) {

}
