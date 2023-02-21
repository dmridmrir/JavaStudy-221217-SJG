package j18_JSON;

import java.util.Map;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.JsonObject;

public class Gson4 {

	public static void main(String[] args) {
		Gson gson = new GsonBuilder().serializeNulls().setPrettyPrinting().create();
		
		JsonObject jsonObject = new JsonObject();
		jsonObject.addProperty("name", "서정근");
		jsonObject.addProperty("address", "부산광역시 남부");
		jsonObject.addProperty("phone", "010-8921-0300");
		jsonObject.addProperty("code", 2);
		
		System.out.println(jsonObject);
		
		String a = gson.toJson(jsonObject);
		System.out.println(a);
		
		JsonObject jsonObj = gson.fromJson(jsonObject, JsonObject.class);
		System.out.println(jsonObj);
		
	}

}
