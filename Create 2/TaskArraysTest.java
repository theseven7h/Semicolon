import java.util.Scanner;

public class TaskArraysTest {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
	
		double[][] numbers = {
		{1.5, 2, 3, 4},
		{5.5, 6, 7, 8},
		{9.5, 1, 3, 1}
		};
		
		System.out.print("Enter the column index to sum: ");
		int columnIndex = input.nextInt();
		System.out.printf("Sum of the elements at column %d is %.1f", columnIndex, TaskArrays.sumColumn(numbers, columnIndex));
	}
}