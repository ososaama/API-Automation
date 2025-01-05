import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.testng.Assert;
import org.testng.annotations.Test;

import io.restassured.http.ContentType;
import io.restassured.response.Response;

import static io.restassured.RestAssured.*;

public class Create_User {
	
	@Test
	public void Create_User()
	{
		JSONObject request = new JSONObject();	 
		request.put("Osama", "Lead Test");
		
		given().header("Content-Type", "application/json")
		.contentType(ContentType.JSON).accept(ContentType.JSON).body(request.toJSONString())
		.when().post("https://reqres.in/api/users").then().statusCode(201);
	}

}
