import POJO.CompletionsPojo;
import io.restassured.http.ContentType;
import io.restassured.response.Response;
import utils.GetPropertyValues;

import static io.restassured.RestAssured.given;


public class ServiceHelper {
    GetPropertyValues getPropertyValues = new GetPropertyValues();
    private final SampleRest SAMPLE_REST = new SampleRest();
    private final String BEARER_TOKEN = getPropertyValues.getPropertyValues("token");
    private final String BASE_URI = getPropertyValues.getPropertyValues("URI");

    public Response sendPostRequest(CompletionsPojo body, String endpoint){
        SAMPLE_REST.response = given()
                .headers(
                        "Authorization",
                        "Bearer " + BEARER_TOKEN,
                        "Content-Type",
                        ContentType.JSON,
                        "Accept",
                        ContentType.JSON)
                .contentType(ContentType.JSON)
                .body(body)
                .baseUri(BASE_URI)
                .post(endpoint);
        return SAMPLE_REST.response;
    }


}

class SampleRest{
    public Response response;
}
