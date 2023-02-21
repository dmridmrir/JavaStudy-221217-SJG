package j18_JSON;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

public class Gson_practice {
	public static void main(String[] args) {
		User2 user2 = Userservice2.createUser();
		
		System.out.println(user2);
		Gson gson = new GsonBuilder().serializeNulls().setPrettyPrinting().create();
		String json = gson.toJson(user2);
		System.out.println(json);
		
		User2 gson2 = gson.fromJson(json, User2.class);
		System.out.println(gson2);
	}
}
