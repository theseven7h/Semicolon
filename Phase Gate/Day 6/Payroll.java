import java.util.List;
import java.util.ArrayList;
import java.util.Scanner;

public class Payroll {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
	
		String menu = """
1. Add Employee payroll
2. View Employee Payroll
3. Update Employee Payroll
4. Exit
		""";
		ArrayList <String> names = new ArrayList<>();
		ArrayList <ArrayList<Double>> allDetails = new ArrayList<>();
		ArrayList <Double> details = new ArrayList<>();
		
		while(true) {
			System.out.print(menu);
			String menuChoice = sc.next().trim();
	
			switch(menuChoice) {
				case "1":
					while(true) {
						System.out.print("\nEnter Employee Name: ");
						String empName = sc.next().trim();
						
						String message = checkName(names, empName); 
						
						System.out.println(message);
						if(!message.equals("Added!")) {
							 continue;
						}
						addName(names, empName);
						
						details = new ArrayList<>();
						
						System.out.print("Enter number of hours worked in a week: ");
						double hours = sc.nextDouble();
						details.add(hours);
						
						System.out.print("Enter hourly pay rate: ");
						double payrate = sc.nextDouble();
						details.add(payrate);
						
						System.out.print("Enter federal tax withholding rate: ");
						double fedRate = sc.nextDouble();
						details.add(fedRate);
						
						System.out.print("Enter state tax withholding rate: ");
						double stateRate = sc.nextDouble();
						details.add(stateRate);
						
						
						allDetails.add(details); 
						
						System.out.print("Employee payroll added");
						
						String repeat = "";
						while(true) {
							System.out.print("\n\nDo you wish to continue adding (Yes/No): ");
							repeat = sc.next().trim();
							
							if(repeat.equals("yes") || repeat.equals("no")) break;
							else System.out.println("\nInvalid! Yes/No");
							System.out.println();
						}
						
						if (repeat.equals("no")) break;	
							
					} break;
						
				case "2":  for(int i = 0; i < allDetails.size(); i++) {
							double grossPay = allDetails.get(i).get(1) * allDetails.get(i).get(0);
							double fedWith = (allDetails.get(i).get(0) * allDetails.get(i).get(1) * (allDetails.get(i).get(2)/100));
							double stateWith = (allDetails.get(i).get(0) * allDetails.get(i).get(1) * (allDetails.get(i).get(3)/100));
							
							System.out.println();
							System.out.println("Employee name: " + names.get(i) + "\nHours Worked: " + allDetails.get(i).get(0) + "\nPay Rate: " + allDetails.get(i).get(1) + "\nPay Rate: " + allDetails.get(i).get(2) + "\nGross Pay: " + grossPay);
							
							System.out.print("Deductions: " + "\n\tFederal Withholding(" + allDetails.get(i).get(0) + "%): $" +  fedWith + "\n\tState Withholding(" + allDetails.get(i).get(3) + "%): $" + stateWith + "\n\tTotal Deduction: $" + (fedWith + stateWith) + "\nNet Pay: $" + (grossPay - (fedWith + stateWith)));
							
							System.out.println("\n0. Back");
							String back = sc.next().trim();
							
							while(true) {
								if (back.equals("0")) break;
								else System.out.print("Invalid input!");
								back = sc.next().trim();
							}
							
							System.out.println();
							System.out.println();
						
						} break;
				
				case "3": System.out.print("\nEnter Employee Name: ");
						String name = sc.next().trim();
						int j = 99;
						for(int i = 0; i < names.size(); i++) {
							if(name.equals(names.get(i))) {
								j = i;
							}
						}
						
						if (j != 99) {
							details = new ArrayList<>();
							
							System.out.print("Enter number of hours worked in a week: ");
							double a = sc.nextDouble();
							details.add(a);
														
							System.out.print("Enter hourly pay rate: ");
							double b = sc.nextDouble();
							details.add(b);
							
							System.out.print("Enter federal tax withholding rate: ");
							double c = sc.nextDouble();
							details.add(c);
							
							System.out.print("Enter state tax withholding rate: ");
							double d = sc.nextDouble();
							details.add(d);
							
							allDetails.set(j, details);
							
						} else {System.out.print("Name not found"); continue;} 
						System.out.println();
						
						System.out.println("\n0. Back");
						String back = sc.next().trim();
						
						while(true) {
							if (back.equals("0")) break;
							else System.out.print("Invalid input!");
							back = sc.next().trim();
						} break;
						
				case "4": System.exit(0);
						
				
						
				
				default: System.out.println("Invalid input");		
			}			
		}	
	}

	public static String checkName(List <String> names, String empName) {
		String message = "Added!";
		for(String name : names) {
			if (name.equals(empName)) message = empName + " already exists!"; 
		}
		return message;
	}
	
	public static void addName(List <String> names, String empName) {
		names.add(empName);	
	} 	
}