
public class Main {

	public static void main(String[] args) {

		Person person1 = new Person();
		person1.setName("John");
		person1.setAge(30);
		person1.setSalary(100000);
		person1.setEmail("abc@abc.com");
		person1.displayInfo();
		System.out.println();
		
		person1.setAge(-5);
		person1.setSalary(-1000);
		person1.setEmail("abcabc.com");
		person1.displayInfo();

		
		}

}
