package j18_JSON;

import java.util.HashMap;
import java.util.Map;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

public class Gson1 {

	public static void main(String[] args) {
		
//		GSON 객체생성 방법
//		Gson() 생성자를 통해 생성
		Gson gson1 = new Gson();
		
//		GsonBuilder()생성자통해 생성
		Gson gson2 = new GsonBuilder().create();
		
		
//		System.out.println(gson1.toString());
//		JSON 정리해서 출력
		
		Gson gson3 = new GsonBuilder().setPrettyPrinting().create();
		Map<String, String> map =new HashMap<String, String>();
		map.put("userName", "서정근");
		map.put("password", "1234");
		map.put("name", "서정근");
		map.put("email", "wjdrms7169@gmail.com");
		
		String json1 = gson3.toJson(map);
		System.out.println(json1);
		
		String json2 = gson2.toJson(map);
		System.out.println(json2);
		
	}

}
//gson은 객체 json은 문자열
