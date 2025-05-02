public class Kata {
	static boolean isEven(int number) {			
		return (number % 2 == 0);
	}

	static boolean isPrimeNumber(int number) {
		int prime = 0;
		for (int count = number; count >= 1; count--) {
			if (number % count == 0) prime++;			
		}
		return (prime == 2);
	}

	static int subtract(int firstNumber, int secondNumber) {
		int difference = firstNumber - secondNumber;
		if (difference < 0) difference = -difference; 
		return difference;
	}

	static float divide(int firstNumber, int secondNumber) {
		float quotient;
		if (secondNumber == 0) quotient = 0;
		else quotient = (float)firstNumber / secondNumber;
		return quotient;
	}

	static int factorOf(int number) {
		int factor = 0;
		for (int count = number; count >= 1; count--) {
			if (number % count == 0) factor++;
		}
		return factor;
	}

	
	static boolean isSquare(int number) {
		return (Math.sqrt(number) % 1 == 0);
	}

	static boolean isPalindrome(int number) {
		int rem = 0;
		int reversed = 0;
		int palindrome = number;
		for (int a = 1; a <= 5; a++) {
			rem = number % 10;
			reversed = (reversed * 10) + rem;
			number /= 10;
		}
		return (palindrome == reversed);
	}

	static long factorialOf(int number) {
		int count = number;
		long factorial = number;
		for (--count; count >= 1; count--) {
			factorial *= count;
		}
		return factorial;
	}

	static long squareOf(int number) {
		return number * number;
	}	
}