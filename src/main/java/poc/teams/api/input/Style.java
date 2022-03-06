package poc.teams.api.input;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * From https://docs.microsoft.com/en-us/outlook/actionable-messages/card-reference#openuri-action
 * <p>
 * When isMultiSelect is false, setting the style property to expanded will
 * instruct the host application to try and display all choices on the screen,
 * typically using a set of radio buttons.
 */
public enum Style {

    @JsonProperty("normal")
    NORMAL,
    @JsonProperty("expanded")
    EXPANDED;
}
