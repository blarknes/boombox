package boombox.exception;

/**
 * {@code SettingsParsingException} Is the exception thrown when a problem was
 * encountered when parsing the Settings file.
 */
public class SettingsParsingException extends RuntimeException {

    public SettingsParsingException() {
        super("There was a problem parsing the Settings file");
    }

}
