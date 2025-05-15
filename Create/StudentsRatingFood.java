public class StudentsRatingFood {
	public static void main(String[] args) {
		int[] ratings = {2,4,2,5,1,1,3,4,4,4,5,2,3,3,1,1,1,2,4,4};
		int[] rateCount = new int[5];
		
		for (int count = 0; count < ratings.length; count++) {
			++rateCount[ratings[count] - 1];
		}
		System.out.printf("%s%10s%n", "Rating", "Frequency");
		for (int print = 0; print < rateCount.length; print++) {
			System.out.printf("%6d%10d%n", print + 1, rateCount[print]);
		}
	}
}