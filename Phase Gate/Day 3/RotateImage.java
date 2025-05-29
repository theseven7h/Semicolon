public class RotateImage {
	static int[][] rotateImage(int[][] numbers) {
		int[][] rotated = new int[numbers[0].length][numbers.length];
		for(int row = 0; row < numbers[0].length; row++) {
			for(int col = 0; col < numbers.length; col++) {
				rotated[row][col] = numbers[numbers[0].length - 2 - col][row]; 
			}
		}
		return rotated;
	}
}