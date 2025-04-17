import java.util.Random;


public class Hello{
	public static void main(String[] args){
		System.out.println("Hello World");

		Random input = new Random();

		int compInp = input.nextInt(14, 20);
		System.out.printf("%d", compInp);
	}
}
