package Assignment;

public class Shark extends Fish {
	
	Shark() {
		super("Grey", "large");
	}
	
	public String eat(Fish fish) {
		return "I am eating another fish:" + fish.toString();
	}

	@Override
	public String toString() {
		return "Shark{" +
		"color='" + color + '\'' +
		", size='" + size + '\'' +
		'}';
	}
}
