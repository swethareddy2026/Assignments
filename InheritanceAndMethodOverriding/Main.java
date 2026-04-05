
public class Main {

	public static void main(String[] args) {
		Animal [] animals = new Animal[4];
		animals[0] = new Dog("Lola", "Woof Woof", 4, "German Shepard");
		animals[1] = new Bird("Tweety", "Tweet Tweet", 2, false);
		animals[2] = new Fish("Nemo", "Bloop Bloop", 0, "Fresh Water");
		animals[3] = new Animal("Animal", "Loud Sound", 4);
		
		for(Animal a: animals)
		{
			a.speak();
		}
		
		Bird bird1 = new Bird("Chirpy", "Chirp Chirp", 2, true);
		bird1.fly();
		
		Fish fish1 = new Fish("Dory", "Bloop Bloop", 0, "Salty");
		fish1.swim();
	
	}

}
