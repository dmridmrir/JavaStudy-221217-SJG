package j18_JSON;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class UserService {

	public static User createUser() {
		
		List<String> hobby = new ArrayList<String>();
		
		hobby.addAll(Arrays.asList(new String[] {"축구", "농구", "야구", "골프"}));
		
		
		
		
		User user = User.builder()
				.usercode(1)
				.username("서정근")
				.password("1234")
				.name(null)
				.address("부산 남구")
				.phone("010-8921-0300")
				.hobby(hobby)
				.build();
		
		return user;
			}

}
