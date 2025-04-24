public class StringLengthTest {
	public static void main(String[] args) {
		String fullName = " Gloria Glynnis Bitrus ";
		String gender = "is a female";
		int length = fullName.length();
		System.out.println(fullName.length());

		String details = fullName.concat(gender);
		System.out.println(details);

		System.out.print(gender.charAt(1));

	}
}