package j19_익명클래스.role;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;

import lombok.Data;
import lombok.NonNull;
import lombok.RequiredArgsConstructor;


@Data
@RequiredArgsConstructor
public class PrincipalDetails {
//	public static void main(String[] args) {
//	
//		String strRoles = "USER_ROLE, ADMIN_ROLE,MANAGE_ROLE";
//		
//		String[] roleArray = strRoles.replaceAll(" ", "").split(",");
//		
//		for(String role : roleArray) {
//			System.out.println(role);
//		}
//		
//		List<String> roles = new ArrayList<String>();
//		
//		roles.addAll(Arrays.asList(roleArray));
//		System.out.println(roles);
//		
//		Collection<String> roleDatas = new GrantedAuthority() {
//			
//			@Override
//			public Collection<String> getRoles(List<String> roles) {
//
//				List<String> roleList = new ArrayList<String>();
//				roleList.addAll(roles);
//				return roleList;
//			}
//		}.getRoles(roles);
//		System.out.println(roleDatas);
//	}
	@NonNull
	
	private User user;
	
	public Collection<? extends GrantedAuthority> getAuthorities(){
		Collection<GrantedAuthority> authorities = new ArrayList<GrantedAuthority>();
		user.getRoleList().forEach(r -> {
			authorities.add(() -> r);
		});
		return authorities;
	}
	
	public String getUserName() {
		return user.getUsername();
	}
	public String getPassword() {
		return user.getPassword();
	}
	
}
