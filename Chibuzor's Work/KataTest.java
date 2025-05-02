import java.util.Scanner;

public class KataTest {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.print("Enter number: ");
		int number1 = input.nextInt();
		//int number2 = input.nextInt();
		//Uncomment number2 input if needed

		System.out.println(Kata.isSquare(number1));

		System.out.println(Kata.squareOf(number1));	

		System.out.println(Kata.factorialOf(number1));		

		System.out.println(Kata.divide(number1, number2));

		System.out.println(Kata.isPalindrome(number1));	

		System.out.println(Kata.subtract(number1, number2));

		System.out.println(Kata.isEven(number1));
		
		System.out.println(Kata.factorOf(number1));

		System.out.print(Kata.isPrimeNumber(number1));*/
	}
}