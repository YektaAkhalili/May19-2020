import java.util.Scanner;

class Decision{
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Is is raining? (Y or N)");
		String answer = scan.nextLine();

		if (answer.equals("Y"))
			System.out.println("Turn Wipers On.");
		else
			System.out.println("Move on, nothing to see here!");
	}
}