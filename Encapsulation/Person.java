public class Person {

	private String name;
	private int age;
	private String email;
	private double salary;
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		if (age < 0 || age > 120)
			System.out.println("Age should be between 0 and 120\n");
		else
			this.age = age;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		if (email.contains("@"))
			this.email = email;
		else
			System.out.println("Email format is wrong\n");
	}

	public double getSalary() {
		return salary;
	}

	public void setSalary(double salary) {
		if (salary < 0)
			System.out.println("Salary cannot be less than zero\n");
		else
			this.salary = salary;
	}

	public void displayInfo() {
		System.out.println("The Name of the person is: " + this.getName());
		System.out.println("The age of " +  this.getName() + " is: " + this.getAge());
		System.out.println("The salary of " +  this.getName() + " is: " + this.getSalary());
		System.out.println("The email address of " +  this.getName() + " is: " + this.getEmail());
	}

}
