public class EvenNumbersOneToHundred {
	public static void main(String[] args) {
		System.out.print("The even numbers from 1 to 100 are ");
		for(int numbers = 2;numbers < 101; numbers += 2) {
			System.out.printf("%d ",numbers);
		}
	}
} 