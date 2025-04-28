import java.util.Scanner;

public class Calculation {
	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		while (true) {
			System.out.println();
			System.out.print("Addition(1), Subtraction(2), Multiplication(3), Division(4), Quit(0): ");
			int userChoice = input.nextInt();
	
			switch (userChoice) {
				case 1-> {
					int sum = 0;
					boolean addition = true;
					while (;addition;) {
						
						System.out.print("Enter the two numbers spaced: "); 
						int num1 = input.nextInt();
						int num2 = input.nextInt();
						sum = num1 + num2;
						System.out.printf("Sum is %d%n%n", sum);
						for (;true;) {
							System.out.print("Another Addition(1) or Go Back(2): \n");
							int check1 = input.nextInt();
							if (check1 == 1) {addition = true; break;}
							else if (check1 == 2) {addition = false; break;}	
							else {System.out.println("Invalid input\n");} 
						}
					}
				}//case 1

				case 2-> {
					int difference = 0;
					boolean sub = true;
					while (sub) {
						
						System.out.print("Enter the two numbers spaced: "); 
						int num1 = input.nextInt();
						int num2 = input.nextInt();
						difference = num1 - num2;
						System.out.printf("Difference is %d%n%n", difference);
						for (;true;) {
							System.out.print("Another Subtraction(1) or Go Back(2): \n");
							int check2 = input.nextInt();
							if (check2 == 1) {sub = true; break;}
							else if (check2 == 2) {sub = false; break;}	
							else {System.out.println("Invalid input\n");} 
						}
					}
				}//case 2

				case 3-> {
					int product = 0;
					boolean multiply = true;
					while (multiply) {
						
						System.out.print("Enter the two numbers spaced: "); 
						int num1 = input.nextInt();
						int num2 = input.nextInt();
						product = num1 * num2;
						System.out.printf("Product is %d%n%n", product);
						for (;true;) {
							System.out.print("Another Multiplication(1) or Go Back(2): \n");
							int check3 = input.nextInt();
							if (check3 == 1) {multiply = true; break;}
							else if (check3 == 2) {multiply = false; break;}	
							else {System.out.println("Invalid input\n");} 
						}
					}
				}//case 3

				case 4-> {
					double division = 0;
					boolean divide = true;
					while (divide) {
						
						System.out.print("Enter the two numbers spaced: "); 
						int num1 = input.nextInt();
						int num2 = input.nextInt();
							if (num2 == 0) {
								System.out.print("Invalid denominator\n\n");
								divide = true;
								continue;
							}
						division = (double)num1 / num2;
						System.out.printf("Division is %.2f%n%n", division);
						for (;true;) {
							System.out.print("Another Division(1) or Go Back(2): \n");
							int check4 = input.nextInt();
							if (check4 == 1) {divide = true; break;}
							else if (check4 == 2) {divide = false; break;}	
							else {System.out.println("Invalid input\n\n");} 
						}
					}
				}//case 4
					
				default-> System.out.print("Invalid entry\n");
				
				case 0-> System.exit(0);

				
			}
		}
	}
}
	
	
