package j19_익명클래스.role;

import java.util.Collection;
import java.util.List;

public interface GrantedAuthority {
//	public Collection<String> getRoles(List<String> roles);
	
	public String getAuthority();
}
