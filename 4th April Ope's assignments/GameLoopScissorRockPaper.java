import java.util.Scanner;


public class GameLoopScissorRockPaper {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		
		int win = 0;
				
		while(win != -3 && win != 3) {
			int compInput = (int)(Math.random() * 3);
			System.out.print("scissor (0), rock (1), paper (2): ");
			int userInput = input.nextInt();

			if (userInput == 0 && compInput == 1) {
				System.out.println("The computer is rock. You are scissor. You lose this round");
				win += -1;
			}
			else if (userInput == 0 && compInput == 2) {
				System.out.println("The computer is paper. You are scissor. You win this round");
				win += 1;
			}
			else if (userInput == 0 && compInput == 0) {
				System.out.println("The computer is scissor. You are scissor. This round is a draw");
			}
		
			else if (userInput == 1 && compInput == 0) {
				System.out.println("The computer is scissor. You are rock. You win this round");
				win += 1;
			}
			else if (userInput == 1 && compInput == 2) {
				System.out.println("The computer is paper. You are rock. You lose this round");
				win += -1;
			}
			else if (userInput == 1 && compInput == 1) {
				System.out.println("The computer is rock. You are rock. This round is a draw");
			}

			else if (userInput == 2 && compInput == 0) {
				System.out.println("The computer is scissor. You are paper. You lose this round");
				win += -1;
			}
			else if (userInput == 2 && compInput == 1) {
				System.out.println("The computer is rock. You are paper. You win this round");
				win += 1;	
			}
			else if (userInput == 2 && compInput == 2) {
				System.out.println("The computer is paper. You are paper. This round is a draw");
			}
		}
		if (win == -3) System.out.print("\nGame Over. The computer has won by a margin of three");	
		else if (win == 3) System.out.print("\nCongratulations. You have won by a margin of three");	
	}
}
		



