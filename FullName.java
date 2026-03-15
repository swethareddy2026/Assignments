
public class FullName {

	// 5th question in the assignment

	public static void main(String[] args) {
		String fullName = "  alice marie johnson  ";
		String firstName = "";
		String middleName = "";
		String lastName = "";
		int i;
		int numberOfVowels = 0;

		fullName = fullName.trim(); // to remove spaces at the start and end
		
		//Splitting the names and changing first letter to uppercase

		int spaceNumber = fullName.indexOf(" ");
		firstName = fullName.substring(0, 1).toUpperCase() + fullName.substring(1, spaceNumber);
		fullName = fullName.substring(spaceNumber + 1);
		middleName = fullName.substring(0, 1).toUpperCase() + fullName.substring(1, spaceNumber);
		lastName = fullName.substring(spaceNumber + 1);
		lastName = lastName.substring(0, 1).toUpperCase() + lastName.substring(1);
		fullName = firstName.concat(" ").concat(middleName).concat(" ").concat(lastName);

		//System.out.println("Full Name: " + firstName +" "+ middleName +" "+ lastName);
		System.out.println("Full Name: " + fullName);
		System.out.println("First Name: " + firstName);
		System.out.println("Middle Name: " + middleName);
		System.out.println("Last Name: " + lastName);

		
		//calculating number of vowels and printing
		
		for ( i = 0; i < fullName.length(); i++) {
			char letter = fullName.charAt(i);
			if (letter == 'a' || letter == 'e' || letter == 'i' || letter == 'o' || letter == 'u') {
				numberOfVowels++;
			}
		}
		
		System.out.println("Number of vowels in the name: "+ numberOfVowels);
		
		
		//reversing the full name
	
		String reverseName = "";

		for ( i = fullName.length() - 1; i >= 0; i--) {
			reverseName += fullName.charAt(i);
		}

		System.out.println("Reversed: " + reverseName); 
	}

	}


