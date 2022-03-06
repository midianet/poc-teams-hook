package poc.teams.api;

import poc.teams.api.input.Choice;
import poc.teams.api.input.MultichoiceInput;
import poc.teams.api.input.Style;
import poc.teams.api.util.JsonTest;

public class MultichoiceInputExpandedTest extends JsonTest<MultichoiceInput> {

    public MultichoiceInputExpandedTest() {
        super(MultichoiceInput.class, "multichoice-input-expanded", buildMock());
    }

    private static MultichoiceInput buildMock() {
        MultichoiceInput mock = new MultichoiceInput("list", "Pick an option");
        mock.setStyle(Style.EXPANDED);
        mock.addChoice(
                new Choice("Choice 1", "1"),
                new Choice("Choice 2", "2"),
                new Choice("Choice 3", "3"));

        return mock;
    }
}