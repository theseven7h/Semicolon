import java.util.Scanner;

public class FiveNumbers {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		System.out.print("Enter first number: ");
		int num1 = input.nextInt();
		System.out.print("Enter second number: ");
		int num2 = input.nextInt();
		System.out.print("Enter third number: ");
		int num3 = input.nextInt();
		System.out.print("Enter fourth number: ");
		int num4 = input.nextInt();
		System.out.print("Enter fifth number: ");
		int num5 = input.nextInt();

		int highest = Math.max(num1, num2);

		int even = 0;
		int countEven = 0;

		if (num1 % 2 == 0) {
			even = even + num1;
			countEven = countEven + 1;
		}
		if (num2 % 2 == 0) {
			even = even + num2;
			countEven = countEven + 1;
		}
		if (num3 % 2 == 0) {
			even = even + num3;
			countEven = countEven + 1;
		}
		if (num4 % 2 == 0) {
			even = even + num4;
			countEven = countEven + 1;
		}
		if (num5 % 2 == 0) {
			even = even + num5;
			countEven = countEven + 1;
		}

		double average = (double)even / countEven;
	
		int largest = num1;
		int smallest = num2;		

		if (num2 > largest) {
			largest = num2;
		}
		if (num3 > largest) {
			largest = num3;
		}
		if (num4 > largest) {
			largest = num4;
		}
		if (num5 > largest) {
			largest = num5;
		}

		if (num2 < smallest) {
			smallest = num2;
		}
		if (num3 < smallest) {
			smallest = num3;
		}
		if (num4 < smallest) {
			smallest = num4;
		}
		if (num5 < smallest) {
			smallest = num5;
		}

		System.out.printf("Largest number is: %d", largest);
		System.out.printf("%nSmallest number is: %d", smallest);
		System.out.printf("%nAverage of even numbers is: %.2f", average);
	}
}
		

		

		
		
		