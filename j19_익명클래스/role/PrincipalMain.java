package j19_익명클래스.role;

public class PrincipalMain {

	public static void main(String[] args) {
		User user = User.builder()
				.username("서정근")
				.password("1234")
				.roles("USER_ROLE, ADMIN_ROLE,MANAGE_ROLE")
				.build();
		
		User user2 = User.builder()
				.username("서정근2")
				.password("1234")
				.roles("ROLE_USER")
				.build();
		
		PrincipalDetails principalDetails = new PrincipalDetails(user);
		PrincipalDetails principalDetails2 = new PrincipalDetails(user2);
		
		printPrincipalData(principalDetails);
		printPrincipalData(principalDetails2);
		
	}
	
	public static void printPrincipalData(PrincipalDetails principalDetails) {
		System.out.println("[Principal 정보출력]");
		
		System.out.println("username : " + principalDetails.getUserName());
		System.out.println("password : " + principalDetails.getPassword());
		
		for(GrantedAuthority grantedAuthority : principalDetails.getAuthorities()) {
			System.out.println("권한 : " + grantedAuthority.getAuthority());
		}
	}

}
