public class Test {
	 public static void main(String[] args) {


for (int row = 1; row <= 5; row++) {
    for (int col = 1; col <= 5; col++) {
        System.out.print(row * col + "     ");
    }
    System.out.println(); // jump to new row
}
}}