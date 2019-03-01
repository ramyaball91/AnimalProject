package Assignment;

public class Solution{

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
	  rooster.makeSounds(); */
	  
	  
	  // Soultion 4
	  Cat cat = new Cat();
	  Dog dog = new Dog();
	  Rooster rooster = new Rooster();
	  
	  Parrot parrot = new Parrot( cat);
	  parrot.makeSounds();
	  
	  Parrot parrotwithDog = new Parrot( dog);
	  parrotwithDog.makeSounds();
	  
	  Parrot parrotwithRooster = new Parrot( rooster);
	  parrotwithRooster.makeSounds();
	   	      
   }
}