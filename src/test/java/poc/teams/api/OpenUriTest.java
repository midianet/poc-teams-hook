package poc.teams.api;

import poc.teams.api.action.OpenUri;
import poc.teams.api.action.OperatingSystem;
import poc.teams.api.action.Target;
import poc.teams.api.util.JsonTest;

import java.net.URISyntaxException;

public class OpenUriTest extends JsonTest<OpenUri> {

    public OpenUriTest() throws URISyntaxException {
        super(OpenUri.class, buildMock());
    }

    private static OpenUri buildMock() throws URISyntaxException {
        OpenUri mock = new OpenUri();
        mock.setName("View in Trello");
        mock.addTarget(
                new Target("https://yammer.com/something/123"),
                new Target(OperatingSystem.IOS, "yammer://u/123"),
                new Target(OperatingSystem.ANDROID, "yammer://u/123"),
                new Target(OperatingSystem.WINDOWS, "yammer://u/123"));
        return mock;
    }
}