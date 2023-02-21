package j18_JSON;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Userservice2 {
	public static User2 createUser() {
		
		List<String> hobby = new ArrayList<String>();
		hobby.addAll(Arrays.asList(new String[] {"게임", "음악감상", "운동"}));
		
		int autocode = 0000;
		
		User2 user = User2.builder()
				.userCode(autocode++)
				.Id("cans21")
				.name(null)
				.passWord("5464")
				.phoneNumb("010-8921-0300")
				.address("부산광역시 남구")
				.hobby(hobby)
				.build();
		return user;
	}
}
