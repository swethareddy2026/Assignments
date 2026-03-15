
public class LightColor {

	//6th question in the assignment
	public static void main(String[] args) {
		String light = "Red";
		
		System.out.println("Light:\t" + light);
		
		switch (light) {
		case "Red":
			System.out.println("Action:\tSTOP — Do Not Proceed");
			break;
		case "Yellow":
			System.out.println("Action:\tCAUTION — Prepare to stop.");
			break;
		case "Green":
			System.out.println("Action:\tGO — Proceed safely.");
			break;
		default:
			System.out.println("Action:\tUNKNOWN signal — treat as Red.");

		}
		System.out.println((light == "Green")? "Safe to go: true": "Safe to go: false");

	}

}
