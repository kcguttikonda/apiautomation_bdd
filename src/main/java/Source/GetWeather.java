package Source;

import io.restassured.RestAssured;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;
import org.testng.annotations.Test;

public class GetWeather {

    @Test
    public Response invokeAPI(String apiurl) {
        String responseBody;
        System.out.println(apiurl);
        RestAssured.baseURI = apiurl;
        // Get the RequestSpecification of the request that you want to sent
        // to the server. The server is specified by the BaseURI that we have
        // specified in the above step.
        RequestSpecification httpRequest = RestAssured.given();

        // Make a request to the server by specifying the method Type and the method URL.
        // This will return the Response from the server. Store the response in a variable.
        Response response = httpRequest.get(apiurl);
        System.out.println(response);
        // Now let us print the body of the message to see what response
        // we have recieved from the server
        responseBody = response.getBody().asString();

        //System.out.println(responseBody);
        return response;
    }

}
