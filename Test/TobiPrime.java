public class TobiPrime{
	public static void main(String[] args) {
		System.out.print("Prime numbers between 1 and 10 are: ");
		for(int num = 1; num <= 10; num++) {
			int check = num;
			int prime = 0;
			for(;check >= 1; check--) {
				if(num % check == 0) {
					prime++;
			 	}
			}
			if (prime == 2) System.out.printf("%d ", num);
		}
	}
}