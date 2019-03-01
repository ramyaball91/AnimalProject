package Assignment;

public class Solution{
	
	public static int fly;
	public static int swim;
	public static int sing;
	public static int walk;

   public static void main(String args[]){
	   
	   
	 /*  
	 // Solution 1
	 Bird bird = new Bird();
	 bird.walk();
     bird.fly();
	 bird.sing();


     // Soultion 2
     Duck duck = new Duck();
     duck.swim();
     duck.makeSounds();
     
     Chicken chick = new Chicken();
     chick.walk();
     chick.makeSounds();
	   
	   
	  // Soultion 3
	  Rooster rooster = new Rooster();
	  rooster.makeSounds(); 
	  
	  
	  // Soultion 4
	  Cat cat = new Cat();
	  Dog dog = new Dog();
	  Rooster rooster = new Rooster();
	  
	  Parrot parrot = new Parrot( cat);
	  parrot.makeSounds();
	  
	  Parrot parrotwithDog = new Parrot( dog);
	  parrotwithDog.makeSounds();
	  
	  Parrot parrotwithRooster = new Parrot( rooster);
	  parrotwithRooster.makeSounds(); */
	   
	   
	   
	   Animal[] animals = new Animal[]{
               new Bird(), // Walk 
               new Duck(), // Fly, Walk
               new Chicken(), // Walk
               new Rooster(), // Walk
               new Parrot( new Cat()), // Fly, Walk
               new Fish(), // Swim
               new Shark(), // Swim
               new ClownFish(), // Swim
               new Dolphin(), // Swim
               new Dog(), // Walk
               new Butterfly(), // Fly
               new Cat() // Walk
       };
	   
	   for ( int i = 0; i <= animals.length ; i ++ ) {
		   if( animals[i] instanceof WalkingAnimals) {
			   walk++ ;
		   } else if ( animals[i] instanceof Flyers ) {
			   fly++;
		   } else if ( animals[i] instanceof Swimmers ) {
			   swim++;
		   } else if ( animals[i] instanceof Sounds ) {
			   sing++;
		   }		   
	   }
	   
	   System.out.println("Animals walk" + walk );
	   System.out.println("Animals fly" + fly);
	   System.out.println("Animals swim" + swim ); 
	   System.out.println("Animals sing" + sing );
	   	      
   }
}