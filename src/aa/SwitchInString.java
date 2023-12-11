package aa;

public class SwitchInString {
	public static void main(String[] args) {

		String sub = "Test";
		switch (sub) {
		case "English":
			System.out.println("Subject is English");
			break;
		case "Science":
			System.out.println("Subject is Science");
			break;
		case "Math":
			System.out.println("Subject is Math");
			break;
		default:
			System.out.println("No Subject Mached");
		}
	}

}
