import java.util.Scanner;

public class QB_RATING {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		double TD;
		System.out.println("Enter the number of touchdown passes: ");
		TD = input.nextDouble();

		double ATT;
		System.out.println("Enter the number of passing attempts: ");
		ATT = input.nextDouble();

		double COMP;
		System.out.println("Enter the number of completions: ");
		COMP = input.nextDouble();

		double YDS;
		System.out.println("Enter the number of passing yards: ");
		YDS = input.nextDouble();

		double INT;
		System.out.println("Enter the number of interceptions: ");
		INT = input.nextDouble();

		double a = (((COMP/ATT) - .3) * 5);
		double b = (((YDS / ATT) - 3) * .25);
		double c = ((TD / ATT) * 20);
		double d = ((2.375) - ((INT / ATT) * 25));
		double Passer_Rating = (((a + b + c + d) / 6) * 100);

		System.out.printf("%.1f%n", Passer_Rating);
	}

}
