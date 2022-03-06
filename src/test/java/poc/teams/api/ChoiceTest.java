package poc.teams.api;

import poc.teams.api.input.Choice;
import poc.teams.api.util.JsonTest;

public class ChoiceTest extends JsonTest<Choice> {

    public ChoiceTest() {
        super(Choice.class, buildMock());
    }

    private static Choice buildMock() {
        return new Choice("List 1", "l1");
    }
}
