import java.util.Scanner;

public class Exercise3_21 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner (System.in);
		
		System.out.print("Enter year: (e.g., 2008): ");
		int year = input.nextInt();
		
		System.out.print("Enter month: 1-12: ");
		int month = input.nextInt();
		
		if (month == 1) {
			month = 13;
			year--;
		}
		else if (month == 2) {
			month = 14;
			year--;
		}
					
		System.out.print("Enter the day of the month: 1-31: ");
		int dayOfMonth = input.nextInt();
		
		int q = dayOfMonth;
		
		int m = month;
		
		int j = year / 100;
		
		int k = year % 100;
		
		int h = (q + ((26 * (m + 1)) / 10) + k + (k / 4) + (j / 4) + (5 * j)) % 7;
		
		String currentDay = "";
		
		switch (h) {
		case 0: 
			currentDay = "Saturday";
			break;
		case 1:
			currentDay = "Sunday";
			break;
		case 2:
			currentDay = "Monday";
			break;
		case 3:
			currentDay = "Tuesday";
			break;
		case 4:
			currentDay = "Wednesday";
			break;
		case 5:
			currentDay = "Thursday";
			break;
		case 6: 
			currentDay = "Friday";
		}
			
		
		System.out.println("Day of the week is " + currentDay);
	}

}
