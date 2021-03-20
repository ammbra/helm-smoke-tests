package org.acme.example.endpoint.v2;

import io.quarkus.test.common.QuarkusTestResource;
import io.quarkus.test.h2.H2DatabaseTestResource;
import io.quarkus.test.junit.QuarkusTest;
import org.junit.jupiter.api.Test;

import static io.restassured.RestAssured.given;
import static org.hamcrest.CoreMatchers.notNullValue;

@QuarkusTest
@QuarkusTestResource(H2DatabaseTestResource.class)
public class LocationEndpointTest {

    @Test
    public void getByAdress() {
        given()
                .when().get("/v2/location/address/Museumstraat")
                .then()
                .statusCode(200)
                .body(notNullValue());
    }

    @Test
    public void getByAdressWithEmptyString() {
        given()
                .when().get("/v2/location/address/")
                .then()
                .statusCode(404);

    }
}