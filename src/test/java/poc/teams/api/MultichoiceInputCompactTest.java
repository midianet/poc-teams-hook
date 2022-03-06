package poc.teams.api;

import poc.teams.api.input.Choice;
import poc.teams.api.input.MultichoiceInput;
import poc.teams.api.util.JsonTest;

public class MultichoiceInputCompactTest extends JsonTest<MultichoiceInput> {

    public MultichoiceInputCompactTest() {
        super(MultichoiceInput.class, "multichoice-input-compact", buildMock());
    }

    private static MultichoiceInput buildMock() {
        MultichoiceInput mock = new MultichoiceInput("list", "Pick an option");
        mock.addChoice(new Choice("Choice 1", "1"));
        mock.addChoice(new Choice("Choice 2", "2"));
        mock.addChoice(new Choice("Choice 3", "3"));
        return mock;
    }
}