public class CurrentDateAndTime {
	public static void main(String [] args) {
		long initialSeconds = System.currentTimeMillis() / 1000;
		long year = 1970 + (seconds / 31536000);
		long months = (seconds % 31536000) / 1036000;
		long days = ((seconds % 31536000) % 1036000) / 86400;
		long hours = (((seconds % 31536000) % 1036000) % 86400) / 3600;
		long minutes = ((((seconds % 31536000) % 1036000) % 86400) % 3600) / 60;
		long remSeconds = ((((seconds % 31536000) % 1036000) % 86400) % 3600) % 60;
		
		String monthInWords = "";
		if (months == 1) monthInWords = "June";
		else if (months == 2) monthInWords = "July";  
		else if (months == 3) monthInWords = "August";  
		else if (months == 4) monthInWords = "September";  
		else if (months == 5) monthInWords = "October";  
		else if (months == 6) monthInWords = "November";  
		else if (months == 7) monthInWords = "December";  
		else if (months == 8) monthInWords = "January";  
		else if (months == 9) monthInWords = "February";  
		else if (months == 10) monthInWords = "March";  
		else if (months == 11) monthInWords = "April";  
		else monthInWords = "May";  
		









		/*String strMonths = Integer.toString(months);
		String monthInWords = "";
		switch (strMonths) {
			case "1": monthInWords = "June"; break;
			case "2": monthInWords = "July"; break;
			case "3": monthInWords = "August"; break;
			case "4": monthInWords = "September"; break;
			case "5": monthInWords = "October"; break;
			case "6": monthInWords = "November"; break;
			case "7": monthInWords = "Dec"; break;
			case "8": monthInWords = "January"; break;
			case "9": monthInWords = "February"; break;
			case "10": monthInWords = "March"; break;
			case "11": monthInWords = "April"; break;
			case "0": monthInWords = "May"; break;
		}*/

		System.out.printf("Current date and time is %s %d, %d %02d:%02d:%02d", monthInWords, days , year, hours, minutes, remSeconds);
	}
}