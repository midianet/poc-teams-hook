package poc.teams.api;

import poc.teams.api.input.DateInput;
import poc.teams.api.util.JsonTest;

public class DateInputTest extends JsonTest<DateInput> {

    public DateInputTest() {
        super(DateInput.class, buildMock());
    }

    private static DateInput buildMock() {
        return new DateInput("dueDate", "Input's title property");
    }
}