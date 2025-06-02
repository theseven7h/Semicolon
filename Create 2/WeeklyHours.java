public class WeeklyHours {
	public static int sum(int[] numbers) {
		int sum = 0;
		for(int num : numbers) {
			sum += num;
		}
		return sum;
	}
	
	public static int[][] sort2D(int[][] numbers) {
		for(int i = 0; i < numbers.length; i++) {
			int largest = sum(numbers[i]);
			for(int j = i; j < numbers.length; j++) {
				if(sum(numbers[j]) > largest) {
					largest = sum(numbers[j]);
					int[] temp = numbers[j];
					numbers[j] = numbers[i];
					numbers[i] = temp;  
				}
			}
		}
		return numbers;
	}

	public static void main(String[] args) {
		int[][] employees = {
					{2,4,3,4,5,8,8},
					{7,3,4,3,3,4,4},
					{3,3,4,3,3,2,2},
					{9,3,4,7,3,4,1},
					{3,5,4,3,6,3,8},
					{3,4,4,6,3,4,4},
					{3,7,4,8,3,8,4},
					{6,3,5,9,2,7,9}
					};
		
		employees = sort2D(employees);
		
		System.out.printf("%18s%5s%5s%5s%5s%5s%5s%n","Su", "M", "T", "W", "Th", "F", "Sa");
		for (int k = 0; k < employees.length; k++) {
			System.out.printf("Employee %d   ",k);
			for (int l = 0; l < employees[k].length; l++) {
				System.out.printf("%5d", employees[k][l]);
			}
			System.out.println();	
		}		 
	}
}