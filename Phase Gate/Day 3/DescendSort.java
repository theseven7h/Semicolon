public class DescendSort {
	static int[] sort(int[] num1, int[] num2) {
		int[] sorted = new int[num1.length + num2.length];
		
		for(int count = 0; count < num1.length; count++) {
			sorted[count] = num1[count];
		}
		
		for(int count = 0; count < num2.length; count++) {
			sorted[count+num1.length] = num2[count];
		}
		
		int presentLargest = Integer.MIN_VALUE;
		int presentIndex = 0;
		
		for (int count = 0; count < sorted.length; count++) {
			presentLargest = Integer.MIN_VALUE;
			for (int count2 = count; count2 < sorted.length; count2++) {
				if (sorted[count2] >= presentLargest) {
					presentLargest = sorted[count2];
					presentIndex = count2;
				}	
			}
			sorted[presentIndex] = sorted[count];
			sorted[count] = presentLargest;
		}
		return sorted;
	}
}