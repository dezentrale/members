package space.dezentrale.members.controller;

import space.dezentrale.members.model.Error;
import space.dezentrale.members.model.Member;
import io.micronaut.test.extensions.junit5.annotation.MicronautTest;
import io.micronaut.http.client.HttpClient;
import io.micronaut.http.client.annotation.Client;
import io.micronaut.runtime.server.EmbeddedServer;
import io.micronaut.http.HttpStatus;
import io.micronaut.http.MutableHttpRequest;
import io.micronaut.http.HttpRequest;
import io.micronaut.http.HttpResponse;
import io.micronaut.http.MediaType;
import io.micronaut.http.uri.UriTemplate;
import io.micronaut.http.cookie.Cookie;
import io.micronaut.http.client.multipart.MultipartBody;
import io.micronaut.core.type.Argument;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Assertions;
import jakarta.inject.Inject;
import reactor.core.publisher.Mono;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.Arrays;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.HashSet;


/**
 * API tests for CreateController
 */
@MicronautTest
public class CreateControllerTest {

    @Inject
    EmbeddedServer server;

    @Inject
    @Client
    HttpClient client;

    @Inject
    CreateController controller;

    /**
     * This test is used to validate the implementation of membersPost() method
     *
     * The method should: 
     *
     * An endpoint to create a new member after it has been approved by the association&#39;s board.
     *
     * TODO fill in the parameters and test return value.
     */
    @Test
    @Disabled("Not Implemented")
    void membersPostMethodTest() {
        // given
        Member member = new Member("wau", "wau.holland@ccc.de");

        // when
        Member result = controller.membersPost(member).block();

        // then
        Assertions.assertTrue(true);
    }

    /**
     * This test is used to check that the api available to client through
     * '/members' to the features of membersPost() works as desired.
     *
     * TODO fill in the request parameters and test response.
     */
    @Test
    @Disabled("Not Implemented")
    void membersPostClientApiTest() throws IOException {
        // given
        Member body = new Member("wau", "wau.holland@ccc.de");
        String uri = UriTemplate.of("/members").expand(new HashMap<>());
        MutableHttpRequest<?> request = HttpRequest.POST(uri, body)
            .accept("application/json");

        // when
        HttpResponse<?> response = client.toBlocking().exchange(request, Member.class);

        // then
        Assertions.assertEquals(HttpStatus.OK, response.status());
    }

}
