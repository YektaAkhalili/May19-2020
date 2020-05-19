import java.util.Scanner;

class NumberCheck{
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter a number: ");
		int number = scan.nextInt();

		if (number < 0 )
			System.out.println("It's negative");
		else
			System.out.println("It's positive or zero");
	}
}