package poc.teams.api;

import poc.teams.api.action.Header;
import poc.teams.api.util.JsonTest;

public class HeaderTest extends JsonTest<Header> {

    public HeaderTest() {
        super(Header.class, buildMock());
    }

    private static Header buildMock() {
        return new Header("Name", "Value");
    }
}
