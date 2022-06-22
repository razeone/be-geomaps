package mx.raze.geomaps;

import io.quarkus.test.junit.QuarkusTest;
import org.junit.jupiter.api.Test;

import static io.restassured.RestAssured.given;
import static org.hamcrest.CoreMatchers.notNullValue;

@QuarkusTest
public class AssetResourceTest {

    @Test
    public void testAssetsRootNotNullEndpoint() {
        given()
          .when().get("/assets")
          .then()
             .statusCode(200)
             .body(notNullValue());
    }

}