
public class Fish extends Animal {
String waterType;
	
	public Fish(String name, String sound, int legs, String waterType) {
		super(name, sound, legs);
		this.waterType = waterType;
	}

	public String getWaterType() {
		return waterType;
	}

	public void setWaterType(String waterType) {
		this.waterType = waterType;
	}
	
	@Override
	public void speak()
	{
		System.out.println(this.getName() + " says " + getSound() + " and blows bubbles.");
	}

	public void swim()
	{
		System.out.println(this.getName()+ " swims in " + this.getWaterType());
	}
}
