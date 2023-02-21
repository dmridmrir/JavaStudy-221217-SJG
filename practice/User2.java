package j18_JSON;

import java.util.List;

import lombok.Builder;
import lombok.Data;

@Data
@Builder

public class User2 {
	private int userCode;
	private String Id;
	private String passWord;
	private String name;
	private String phoneNumb;
	private String address;
	private List<String> hobby;
}
