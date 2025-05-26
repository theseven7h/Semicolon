import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class TestStudentsScoreboard {
	
	StudentsScoreboard score = new StudentsScoreboard();
	
	@Test
	public void testGetTotalFunctionExists() {
		int[][] scores = {{3,3,4}, {9,1,3}};
		score.getTotalOf(scores);
	}
	
	@Test
	public void testGetTotalFunctionReturnsCorrectTotal() {
		int[][] scores = {{3,3,4}, {9,1,3}};
		int[] actual = score.getTotalOf(scores);
		int[] expected = {10, 13};
		assertArrayEquals(actual, expected);
	}
	
	@Test
	public void testGetAverageFunctionExists() {
		int[][] scores = {{3,3,4}, {9,1,3}};
		int[] total = score.getTotalOf(scores);
		int length = 3;
		score.getAverageOf(total, length);
	}
	
	@Test
	public void testGetAverageFunctionReturnsCorrectAverage() {
		int[][] scores = {{3,3,4}, {9,1,3}};
		int[] total = score.getTotalOf(scores);
		int length = 3;
		double[] actual = score.getAverageOf(total, length);
		double[] expected = {3.3333333333333333333333333333333, 4.3333333333333333333333333333333};
		assertArrayEquals(actual, expected);
	}

	@Test
	public void testGetPositionFunctionExists() {
		int[][] scores = {{3,3,4}, {9,1,3}};
		int[] total = score.getTotalOf(scores);
		int length = 3;
		double[] average = score.getAverageOf(total, length);
		score.getPositionOf(average);
	}
	
	@Test
	public void testGetPositionFunctionReturnsCorrectAverage() {
		int[][] scores = {{3,3,4}, {9,1,3}};
		int[] total = score.getTotalOf(scores);
		int length = 3;
		double[] average = score.getAverageOf(total, length);
		int[] actual = score.getPositionOf(average);
		int[] expected = {2, 1};
		assertArrayEquals(expected, actual);
	}
	
}