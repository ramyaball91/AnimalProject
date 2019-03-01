package Assignment;

public class Duck extends Bird  implements Flyers,Swimmers,Sounds{
	
	public void fly(){
		System.out.println("I am flying");
	}
	
	public void makeSounds() {
		System.out.println("Quack, quack");
	}

	public void swim() {
		System.out.println("I am swimming");		
	}

}
