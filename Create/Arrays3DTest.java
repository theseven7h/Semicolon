public class Arrays3DTest {
	public static void main(String[] args) {
		String[][] phones = new String[3][3];
		phones[0][0] = "iPhone"; phones[0][1] = "16 pro max"; phones[0][2] = "XR";
		phones[1][0] = "Samsung"; phones[1][1] = "Galaxy S25"; phones[1][2] = "Galaxy Z Flip6";
		phones[2][0] = "Redmi"; phones[2][1] = "Turbo 4"; phones[2][2] = "Note 14 Pro+ %G";

		for (String[] brand : phones) {
			System.out.println("Brand: " + brand[0]);
			System.out.println("First Model: " + brand[1]);
			System.out.println("Second Model: " + brand[2]);
			System.out.println();
		}
	}
}