package j18_JSON;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

import lombok.Data;


public class Gson2 {

	public static void main(String[] args) {
		User user = UserService.createUser();
//		return값이 있어서 변수에 저장 가능
		
		Gson gson = new GsonBuilder().serializeNulls().setPrettyPrinting().create();
//		serializenulls -> null값 표시
//		객체(GSON)를 JSON으로 변환 - toJson
		String userJson = gson.toJson(user);
		
		System.out.println(userJson);
//		Json을 객체로 변환 -> fromJson(json문자열, 변환할 객체 클래스)
		
		User userObj = gson.fromJson(userJson, User.class);
		System.out.println(userObj);
		
		String address = userObj.getAddress();
		System.out.println(address); 
		
		
	}

}
