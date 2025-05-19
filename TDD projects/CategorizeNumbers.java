public class CategorizeNumbers {
	static void categorizeNumbers(int[] numbers, int myDivisor) {
		int divisorCount = 0;
		if (myDivisor == 0) {
			System.out.print("Divisor cannot be 0");
		}
		
		else {
			for (int count = 0; count < numbers.length; count++) {
				if (numbers[count] % myDivisor == 0) {
					divisorCount++;
					System.out.printf("%d ", numbers[count]);
				} 
			}
 			
 			if (divisorCount == 0) {
 				System.out.print("No divisible number found");
 			}
		}
	}
}