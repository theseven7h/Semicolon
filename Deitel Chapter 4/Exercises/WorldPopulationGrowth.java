public class WorldPopulationGrowth {
	public static void main(String[] args) {

		final long currentWorldPopulation = 8220836679L;
		final double growthRate = 0.84 / 100;
		long subWorldPopulation = currentWorldPopulation;
		int year = 2026;
		int row = 1;
		
		

		System.out.printf("%-10s %-10s %-10s%n","Year", "World Population", "Numerical Increase");
		while (row <= 75) {
			subWorldPopulation += (currentWorldPopulation * growthRate);
			System.out.printf("%-10d %,-10d% %,-10d%n", year, subWorldPopulation, currentWorldPopulation * growthRate);	year++;
			row++;
		}		
	}
}