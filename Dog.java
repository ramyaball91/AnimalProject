package Assignment;

public class Dog extends Animal implements Sounds{

	@Override
	public void makeSounds() {
		System.out.println("Woof, woof");		
	}
}
