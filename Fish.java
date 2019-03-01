package Assignment;

public class Fish extends Animal implements Swimmers{
	
	public String color;
	public String size;

	Fish ( ) {		
		this.color = null;
		this.size = null;
	}
	
	Fish ( String color , String size) {		
		this.color = color;
		this.size = size;
	}
	
	@Override
	public void swim() {
		System.out.println("I am swimming");	
	}

}
