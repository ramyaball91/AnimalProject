package Assignment;

public class Parrot extends Bird implements Sounds{

	private Animal livingPartner;
	
	Parrot ( Animal animal) {
		livingPartner = animal;
	}
	
	@Override
	public void makeSounds() {
		if ( livingPartner instanceof Cat) 
			((Cat) livingPartner).makeSounds();
		else if ( livingPartner instanceof Dog) 
			((Dog) livingPartner).makeSounds();
		else if ( livingPartner instanceof Rooster) 
			((Rooster) livingPartner).makeSounds();
			
		
	}

}
