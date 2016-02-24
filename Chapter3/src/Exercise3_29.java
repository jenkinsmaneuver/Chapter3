import java.util.Scanner;

public class Exercise3_29 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		
		System.out.print("Enter circle1's center x-, y-coordinates, and radius: ");
		
		double circleOneX = input.nextDouble();
		double circleOneY = input.nextDouble();
		double circleOneRadius = input.nextDouble();
		
		double x1 = circleOneX;
		double y1 = circleOneY;
		double r1 = circleOneRadius;
		
		System.out.print("Enter circle2's center x-, y-coordinates, and radius: ");
		
		double circleTwoX = input.nextDouble();
		double circleTwoY = input.nextDouble();
		double circleTwoRadius = input.nextDouble();
		
		double x2 = circleTwoX;
		double y2 = circleTwoY;
		double r2 = circleTwoRadius;
		
		
		double distance = Math.pow(Math.pow((x2 - x1), 2) + Math.pow((y2 - y1), 2), 0.5);
		
		if (distance <= Math.abs(r1 - r2)) {
			System.out.print("circle2 is inside circle1");
		}
		else if (distance <= (r1 + r2)) {
			System.out.print("circle2 overlaps circle1");
		}
		else 
			System.out.print("circle2 does not overlap circle1");
			
		
	}

}
