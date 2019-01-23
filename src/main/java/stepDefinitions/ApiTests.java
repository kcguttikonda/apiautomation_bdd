package stepDefinitions;
import Source.GetWeather;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import io.restassured.response.Response;

import static org.testng.AssertJUnit.assertEquals;

public class ApiTests {
    static GetWeather weatherobject;
    static String responseCode, responseBody;
    static Response response;
    static String apiurl;
    static String baseURL = "http://api.openweathermap.org/data/2.5/weather?";
    @Given("^I have a valid \"([^\"]*)\" and \"([^\"]*)\"$")
    public void i_have_a_valid_and(String arg1, String arg2) throws Throwable {
        apiurl = baseURL+arg2+"&appid="+arg1;
    }

    @When("^I hit getWeather API$")
    public void i_hit_getWeather_API() throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        weatherobject = new GetWeather();
        response = weatherobject.invokeAPI(apiurl);
    }

    @Then("^I should see current tweather for the entered location$")
    public void i_should_see_current_tweather_for_the_entered_location() throws Throwable {
        assertEquals(200, response.getStatusCode());
        if(response.getStatusCode() == 200){
            System.out.println("Testcase passed");
        }
    }


}


