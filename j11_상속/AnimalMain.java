package j11_상속;

public class AnimalMain {

	public static void main(String[] args) {
		Human human = new Human();
		
		Tiger tiger = new Tiger();
		
		human.move();
		tiger.move();
		
		human.readBooks();
	}

}
