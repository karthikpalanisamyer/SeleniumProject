import io.restassured.RestAssured;
import io.restassured.path.json.JsonPath;

import static io.restassured.RestAssured.*;
import net.bytebuddy.NamingStrategy.Suffixing.BaseNameResolver.ForGivenType;
import static org.hamcrest.Matchers.*;

import java.awt.print.Printable;

import files.Payload;

public class Basics {

	public static void main(String[] args) {
		String payload=Payload.Addplace();
	//	System.out.println(payload);
		
		//given - all input parameters 
		//when	- submit all api - resources, http method
		//then	- validate the response
		
	//	Addplace
		RestAssured.baseURI = "https://rahulshettyacademy.com";
		String response =given().log().all().queryParam("key", "qaclick123").header("Content-Type", "application/json")
		.body(payload).when().post("maps/api/place/add/json")
		.then().assertThat().statusCode(200).body("scope", equalTo("APP"))
		.headers("Server", "Apache/2.4.41 (Ubuntu)").extract().response().asString();
		
		System.out.println("\n \n \n "+ "response value");
		System.out.println(response);
		
		JsonPath js = new JsonPath(response);  	//parsing Json
		String placeId=js.getString("place_id");
		
		System.out.println(placeId);
		
		
	//	UpdatePlace
		String newAddress = "Summer Walk, Africa";
		
		given().log().all().queryParam("key", "qaclick123").header("Content-Type","application/json")
		.body("{\r\n"
				+ "\"place_id\":\""+placeId+"\",\r\n"
				+ "\"address\":\""+newAddress+"\",\r\n"
				+ "\"key\":\"qaclick123\"\r\n"
				+ "}")
		.when().put("maps/api/place/update/json")
		.then().assertThat().log().all().statusCode(200).body("msg", equalTo("Address successfully updated"));

	}

}
