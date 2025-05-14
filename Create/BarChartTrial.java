import java.util.Scanner;

public class BarChartTrial {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("How many scores are you checking: ");
		int amount = sc.nextInt();
		//int count0 = 0, count1 = 0, count2 = 0, count3 = 0, count4 = 0, 
		//count5 = 0, count6 = 0, count7 = 0, count8 = 0, count9 = 0; 
		int[] scores = new int[amount];
		int[] scoresCount = new int[amount];
		
		for (int index = 0; index < scores.length; index++) {
			System.out.print("Enter score: ");
			scores[index] = sc.nextInt();
			switch (scores[index] / 10) {
				case 0: scoresCount[0]++; break;
				case 1: scoresCount[1]++; break;
				case 2: scoresCount[2]++; break;
				case 3: scoresCount[3]++; break;
				case 4: scoresCount[4]++; break;
				case 5: scoresCount[5]++; break;
				case 6: scoresCount[6]++; break;
				case 7: scoresCount[7]++; break;
				case 8: scoresCount[8]++; break;
				case 9: scoresCount[9]++; break;
				case 10: scoresCount[10]++; break;
			}
		}
		System.out.println();
		for (int counter = 0; counter < scores.length; counter++) {
			if (counter == 10) {
				System.out.printf("%5d: ", 100);
			}
			else {
				System.out.printf("%02d-%02d: ", counter * 10, counter * 10 + 9);
			}
			for (int stars = 0; stars < scoresCount[counter]; stars++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}
}