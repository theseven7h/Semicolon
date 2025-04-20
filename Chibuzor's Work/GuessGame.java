import java.util.Scanner;

public class GuessGame {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		int compInput = (int)((Math.random() * 10) + 1);
		
		System.out.print("Guess the selected number between 1 and 10: ");
		double userInput = input.nextDouble();

 		
			 	if (userInput > compInput) {
					System.out.print("Answer is wrong and higher. Try again");
					System.out.print("\nGuess the selected number between 1 and 10: ");
					userInput = input.nextDouble();
				 		if (userInput > compInput) {
							System.out.print("Answer is wrong and higher. Try again");
							System.out.print("\nGuess the selected number between 1 and 10: ");
							userInput = input.nextDouble();
						 		if (userInput > compInput) {
									System.out.print("Answer is wrong and higher. You have failed all guesses");
								}
								else if (userInput < compInput) {
									System.out.print("Answer is wrong and lower. You have failed all guesses");
								}
								else if (userInput == compInput) {
									System.out.print("You are correct");
								}
						}
					 	else if (userInput < compInput) {
							System.out.print("Answer is wrong and lower. Try again");
							System.out.print("\nGuess the selected number between 1 and 10: ");
							userInput = input.nextDouble();
						 		if (userInput > compInput) {
									System.out.print("\nAnswer is wrong and lower. You have failed all guesses");
								}
								else if (userInput < compInput) {
									System.out.print("\nAnswer is wrong and lower. You have failed all guesses");
								}
								else if (userInput == compInput) {
									System.out.print("\nYou are correct");
								}
						}
						else if (userInput == compInput) {
							System.out.print("\nYou are correct");
						}
				}
			 	else if (userInput < compInput) {
					System.out.print("Answer is wrong and higher. Try again");
					System.out.print("\nGuess the selected number between 1 and 10: ");
					userInput = input.nextDouble();
				 		if (userInput > compInput) {
							System.out.print("Answer is wrong and higher. Try again");
							System.out.print("\nGuess the selected number between 1 and 10: ");
							userInput = input.nextDouble();
					 			if (userInput > compInput) {
									System.out.print("\nAnswer is wrong and higher. You have failed all guesses");
								}
								else if (userInput < compInput) {
									System.out.print("\nAnswer is wrong and lower. You have failed all guesses");
								}
								else if (userInput == compInput) {
									System.out.print("\nYou are correct");
								}
						}
					 	else if (userInput < compInput) {
							System.out.print("Answer is wrong and lower. Try again");
							System.out.print("\nGuess the selected number between 1 and 10: ");
							userInput = input.nextDouble();
						 		if (userInput > compInput) {
									System.out.print("\nAnswer is wrong and lower. You have failed all guesses");
								}
								else if (userInput < compInput) {
									System.out.print("\nAnswer is wrong and lower. You have failed all guesses");
								}
								else if (userInput == compInput) {
									System.out.print("\nYou are correct");
								}
						}
						else if (userInput == compInput) {
							System.out.print("You are correct");
						}
				}
				else if (userInput == compInput) {
					System.out.print("You are correct");
				}

		
 	
			 	if (userInput < compInput) {
					System.out.print("Answer is wrong and higher. Try again");
					System.out.print("\nGuess the selected number between 1 and 10: ");
					userInput = input.nextDouble();
				 		if (userInput > compInput) {
							System.out.print("Answer is wrong and higher. Try again");
							System.out.print("\nGuess the selected number between 1 and 10: ");
							userInput = input.nextDouble();
						 		if (userInput > compInput) {
									System.out.print("Answer is wrong and higher. You have failed all guesses");
								}
								else if (userInput < compInput) {
									System.out.print("Answer is wrong and lower. You have failed all guesses");
								}
								else if (userInput == compInput) {
									System.out.print("You are correct");
								}
						}
					 	else if (userInput < compInput) {
							System.out.print("Answer is wrong and lower. Try again");
							System.out.print("\nGuess the selected number between 1 and 10: ");
							userInput = input.nextDouble();
						 		if (userInput > compInput) {
									System.out.print("Answer is wrong and lower. You have failed all guesses");
								}
								else if (userInput < compInput) {
									System.out.print("Answer is wrong and lower. You have failed all guesses");
								}
								else if (userInput == compInput) {
									System.out.print("You are correct");
								}
						}
						else if (userInput == compInput) {
							System.out.print("You are correct");
						}
				}
			 	else if (userInput < compInput) {
					System.out.print("Answer is wrong and higher. Try again");
					System.out.print("\nGuess the selected number between 1 and 10: ");
					userInput = input.nextDouble();
				 		if (userInput > compInput) {
							System.out.print("Answer is wrong and higher. Try again");
							System.out.print("\nGuess the selected number between 1 and 10: ");
							userInput = input.nextDouble();
					 			if (userInput > compInput) {
									System.out.print("Answer is wrong and higher. You have failed all guesses");
								}
								else if (userInput < compInput) {
									System.out.print("Answer is wrong and lower. You have failed all guesses");
								}
								else if (userInput == compInput) {
									System.out.print("You are correct");
								}
						}
					 	else if (userInput < compInput) {
							System.out.print("Answer is wrong and lower. Try again");
							System.out.print("\nGuess the selected number between 1 and 10: ");
							userInput = input.nextDouble();
						 		if (userInput > compInput) {
									System.out.print("Answer is wrong and lower. You have failed all guesses");
								}
								else if (userInput < compInput) {
									System.out.print("Answer is wrong and lower. You have failed all guesses");
								}
								else if (userInput == compInput) {
									System.out.print("You are correct");
								}
						}
						else if (userInput == compInput) {
							System.out.print("You are correct");
						}
				}
				else if (userInput == compInput) {
					System.out.print("You are correct");
				}
	}
}