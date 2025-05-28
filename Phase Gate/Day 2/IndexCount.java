public class IndexCount {
	static boolean indexIsRight(String number) {
		int check = 0;
		
		int n = number.length();
		String num = "";
		
		for(int i = 0; i < n; i++) {
			num = num + i;
		}
	
		String mainCheck = "";		
		for(int count = 0; count < n; count++) {
			check = 0;
			char a = num.charAt(count);
			for(int count2 = 0; count2 < n; count2++) {
				char b = number.charAt(count2);
				if(a == b) check++;
			}
			mainCheck += check;
		}
		
		return number == mainCheck;
	}
}