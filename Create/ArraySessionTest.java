import java.util.Scanner;
import java.util.Arrays;

public class ArraySessionTest {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
	
		/*System.out.print("Enter number of inputs: ");
		int number = sc.nextInt();*/

		int[] numbers = {-7,1,2,3,2,8,0};
		//System.out.print(ArraySession.noOfUniqueValuesIn(numbers));	
		System.out.print(Arrays.toString(ArraySession.uniqueValuesIn(numbers)));
	}
}	