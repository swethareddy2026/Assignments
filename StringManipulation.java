
public class StringManipulation {

	public static void main(String[] args) {
		String text1 = "I Love Java";
		countVowels(text1);
		System.out.println();
		
		String reverseName = reverseString(text1);
		System.out.println("The reverse name: " + reverseName);
		System.out.println();

		if (isPalindrome("aBba abba"))

			System.out.println("The string is Palindrome");
		else
			System.out.println("The string is not Palindrome");
		System.out.println();
		
		int count = countOccurrences("I Love Love Java", "love");
		System.out.println("The number of times Love comes in the text is: " + count);

	}

	// method to count the number of vowels
	public static int countVowels(String s) {
		int numberofvowels = 0;
		s = s.toLowerCase();
		for (int i = 0; i < s.length(); i++) {
			char letter = s.charAt(i);
			if (letter == 'a' || letter == 'e' || letter == 'i' || letter == 'o' || letter == 'u') {
				numberofvowels++;
			}
		}
		System.out.println("The number if vowels in the string are " + numberofvowels);
		return numberofvowels;

	}

	// method to reverse string
	public static String reverseString(String s) {

		String reverseName = "";

		for (int i = s.length() - 1; i >= 0; i--) {
			reverseName += s.charAt(i);
		}

		return reverseName;

	}

	// method to determine if string is Palindrome or not
	public static boolean isPalindrome(String s) {
		String reverseName = reverseString(s);
		if (reverseName.equalsIgnoreCase(s))
			return true;
		else
			return false;
	}

	// method to count how many times a word comes in a text
	public static int countOccurrences(String text, String word) {
		int count = 0;
		String[] textWords = text.split(" ");
		for (String words : textWords)
			if (word.equalsIgnoreCase(words))
				count++;

		return count;

	}
}
