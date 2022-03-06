package poc.teams.api;

import poc.teams.api.action.OperatingSystem;
import poc.teams.api.action.Target;
import poc.teams.api.util.JsonTest;

import java.net.URISyntaxException;

public class TargetTest extends JsonTest<Target> {

    public TargetTest() throws URISyntaxException {
        super(Target.class, buildMock());
    }

    private static Target buildMock() throws URISyntaxException {
        return new Target(OperatingSystem.WINDOWS, "yammer://u/123");
    }
}
