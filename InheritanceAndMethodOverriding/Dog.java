
public class Dog extends Animal {
	String breed;

	public Dog(String name, String sound, int legs, String breed) {
		super(name, sound, legs);
		this.breed = breed;
	}

	public String getBreed() {
		return breed;
	}

	public void setBreed(String breed) {
		this.breed = breed;
	}

	@Override
	public void speak()
	{
		System.out.println(this.getName() + " says " + getSound() + " and wags tail.");
	}
	
}
