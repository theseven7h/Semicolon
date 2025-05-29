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
		int[][] expexted = {{4,3},{5,4},{6,5}};
	}
}