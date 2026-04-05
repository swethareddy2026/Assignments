
public class Bird extends Animal {

	boolean canFly;
	public Bird(String name, String sound, int legs, boolean canFly) {
		super(name, sound, legs);
		this.canFly = canFly;
	}
	public boolean isCanFly() {
		return canFly;
	}
	public void setCanFly(boolean canFly) {
		this.canFly = canFly;
	}
	
	@Override
	public void speak()
	{
		System.out.println(this.getName() + " says " + getSound() + " and flaps wings.");
	}

	public void fly() {
		if (this.isCanFly())
			System.out.println(this.getName() + " can fly.");
		else
			System.out.println(this.getName() + " cannot fly.");
	}
}
