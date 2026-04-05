
public class Animal {

	String name;
	String sound;
	int legs;
	
	public Animal (String name, String sound, int legs)
	{
		this.legs = legs;
		this.name = name;
		this.sound = sound;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getSound() {
		return sound;
	}

	public void setSound(String sound) {
		this.sound = sound;
	}

	public int getLegs() {
		return legs;
	}

	public void setLegs(int legs) {
		this.legs = legs;
	}
	
	public void speak()
	{
		System.out.println(this.getName() + " says " + getSound() + ".");
	}
	
}
