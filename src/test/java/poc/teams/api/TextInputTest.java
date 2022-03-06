package poc.teams.api;

import poc.teams.api.input.TextInput;
import poc.teams.api.util.JsonTest;

public class TextInputTest extends JsonTest<TextInput> {

    public TextInputTest() {
        super(TextInput.class, buildMock());
    }

    private static TextInput buildMock() {
        return new TextInput("comment", true, "Input's title property");
    }
}