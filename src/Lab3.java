import java.util.Scanner;

public class Lab3 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String name;
		char userChar;
		userChar = 'y';
		int num;
		
		System.out.println("Please enter your name:");
		name = scan.next();
		
		
		while (userChar == 'y') {
			System.out.print("Please enter a number between 1 and 100: ");
			num = scan.nextInt();
			if( num >= 1 && num <= 100) {
				
				if (num %2 != 0 && num < 60) {
					System.out.println(num + " Odd.");
				}
				else if (num %2 == 0 && num >=2 && num <=25){
					System.out.println("Even and less than 25.");
				}
				else if (num %2 == 0 && num >= 26 && num <=60) {
					System.out.println("Even");
				}
				else if (num %2 == 0 && num >=60) {
					System.out.println(num + " Even.");
				}
				else if (num %2 != 0 && num >=60) {
					System.out.println(num + " Odd and over 60.");
			}
				}else {
			System.out.println("Invalid number, please enter a number between 1 and 100: ");
		}
			System.out.println("Continue? (y/n)");
			scan.nextLine();
			userChar = scan.next().charAt(0);
		
		}
		System.out.println("Bye!" + name);
		scan.close();
}
}