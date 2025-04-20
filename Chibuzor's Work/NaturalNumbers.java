public class NaturalNumbers {
	public static void main(String[] args) {
		int sum = 0;
		int count = 0;
			
		while (count < 10) {
			count++;
			sum += count;
		}
		System.out.print("The sum of the first 10 natural numbers is " + sum);
	}
}
