package restAssured;

import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;
import static io.restassured.RestAssured.given;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;

public class firsttest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Response response=given().when().
				get("http://dummy.restapiexample.com/api/v1/employees");
			//	System.out.println(response.asString());
				List<HashMap<String,String>> l = null;
				JsonPath jsonpath =new JsonPath(response.asString());
			   l= jsonpath.get("data");
			   System.out.println(l.get(0));
			   List<HashMap<String,String>> test=new ArrayList<HashMap<String,String>>();
			   System.out.println(test.size());
			   test= jsonpath.get("data.employee_name");
			   System.out.println(test.get(1));
			   //check if list contains a name
			System.out.println(test.contains("test"));
			   Iterator iterator=test.iterator();	
			   //iterate over the list
			   while(iterator.hasNext())
			   {
				   System.out.println(iterator.next());
				   //iterator=iterator.next();
				   
			   }
			   
	}

}
