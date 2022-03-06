package poc.teams.api;

import poc.teams.api.util.JsonTest;

public class FactTest extends JsonTest<Fact> {

    public FactTest() {
        super(Fact.class, buildMock());
    }

    private static Fact buildMock() {
        return new Fact("Fact 1", "f1");
    }
}
