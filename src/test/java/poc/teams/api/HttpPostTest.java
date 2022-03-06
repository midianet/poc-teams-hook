package poc.teams.api;

import poc.teams.api.action.HttpPost;
import poc.teams.api.util.JsonTest;

public class HttpPostTest extends JsonTest<HttpPost> {

    public HttpPostTest() {
        super(HttpPost.class, buildMock());
    }

    private static HttpPost buildMock() {
        HttpPost mock = new HttpPost();
        mock.setName("Action's name prop.");
        mock.setTarget("https://yammer.com/comment?postId=123");
        mock.setBody("comment={{comment.value}}");
        return mock;
    }
}
