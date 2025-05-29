import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class TestRotateImage {
	RotateImage image = new RotateImage();
	
	@Test
	void testRotateImageFunctionExists() {
		int[][] numbers = {{3,4,5}, {4,5,6}};
		image.rotateImage(numbers);
	}
	
	@Test
	void testRotateImageFunctionReturnsRightOutput() {
		int[][] numbers = {{3,4,5}, {4,5,6}};
		int[][] actual = image.rotateImage(numbers);
		int[][] expected = {{4,3},{5,4},{6,5}};
		assertArrayEquals(actual, expected);
		
		int[][] numbers2 = {{1,2,3}, {4,5,6}, {7,8,9}};
		int[][] actual2 = image.rotateImage(numbers2);
		int[][] expected2 = {{7,4,1},{8,5,2},{9,6,3}};
		assertArrayEquals(actual2, expected2);
	}
}