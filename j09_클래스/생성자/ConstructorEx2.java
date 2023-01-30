package j09_클래스.생성자;

public class ConstructorEx2 {
	String name;
	int birth;
	
	public ConstructorEx2() {
		
	}

	
	
//	alt + shift + s generate constructor using fields 
	
	public ConstructorEx2(String name, int birth) {
		this.name = name;
		this.birth = birth;
	}

	public ConstructorEx2(int birth) {
		this.birth = birth;
	}

	public ConstructorEx2(String name) {
		this.name = name;
	}
	
	
	
}
