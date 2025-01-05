import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.testng.Assert;
import org.testng.annotations.Test;

import io.restassured.http.ContentType;
import io.restassured.response.Response;

import static io.restassured.RestAssured.*;

public class Update_User {
	
	@Test
	public void Update_User()
	{
		JSONObject request = new JSONObject();
		request.put("ahmed", "senior QA");
		
		given().header("Content-Type", "application/json")
		.contentType(ContentType.JSON).accept(ContentType.JSON).body(request.toJSONString())
		.when().put("https://reqres.in/api/users/2").then().statusCode(200);
	}

}
