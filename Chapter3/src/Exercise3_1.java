import java.util.Scanner;

public class Exercise3_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner (System.in);
		
		System.out.print("Enter a, b, c: ");
		double a = input.nextDouble();
		double b = input.nextDouble();
		double c = input.nextDouble();
		
		double discriminant = (Math.pow(b, 2)) - (4 * a * c);
		
		double r1 = (-b + (Math.pow(discriminant, 0.5))) / (2 * a);
		double r2 = (-b - (Math.pow(discriminant, 0.5))) / (2 * a);
		
		if (discriminant > 0)
			System.out.printf("The roots are %0.5f and %0.5f", r1, r2);
		else if (discriminant == 0)
			System.out.printf("The root is %2.0f", r1);
		else if (discriminant < 0)
			System.out.print("The equation has no real roots");
		else
			System.out.print("No valid numbers entered!");
				
	}

}
