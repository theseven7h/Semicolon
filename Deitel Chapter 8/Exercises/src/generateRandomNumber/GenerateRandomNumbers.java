package generateRandomNumber;

import java.security.SecureRandom;
import java.util.Scanner;

public class GenerateRandomNumbers {
    private int quantity;

    public GenerateRandomNumbers(int quantity) {
        this.quantity = quantity;
    }

    public int getRandomNumber() {
        int START_RANGE = 10;
        int END_RANGE = 100;
        return new SecureRandom().nextInt(START_RANGE, END_RANGE);
    }

    public int[] getRandomNumbers(int quantity) {
        int[] randomNumbers = new int[quantity];
        for(int number = 0; number < quantity; number++)
            randomNumbers[number] = getRandomNumber();
        return randomNumbers;
    }
}

class RandomNumbers {
    public static void main(String[] args) {
        int quantity = input("How many numbers do you want to generate?: ");
        GenerateRandomNumbers random = new GenerateRandomNumbers(quantity);
        int[] randomNumbers = random.getRandomNumbers(quantity);
        for(int i = 0; i < quantity; i++) {
            System.out.println(randomNumbers[i]);
        }
    }

    public static void print(String message) {
        System.out.print(message);
    }

    public static int input(String message) {
        print(message);
        Scanner scan = new Scanner(System.in);
        return scan.nextInt();
    }
}
