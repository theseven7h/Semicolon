import java.util.Scanner;

public class Nokia {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		String menu = """
		1. Phone book
		2. Messages
		3. Chat
		4. Call register
		5. Tones
		6. Settings
		7. Call divert
		8. Games
		9. Calculator
		10. Reminders
		11. Clock
		12. Profiles
		13. SIM services
		""";
		System.out.print(menu);
		int menuChoice = input.nextInt();
		switch (menuChoice) {
			case 1: {
			String phoneBook = """ 
			1. Search
			2. Service Nos.
			3. Add name
			4. Erase
			5. Edit 
			6. Assign tone
			7. Send b'card
			8. Options
			9. Speed dials
			10. Voice tags
			""";
			System.out.print(phoneBook);
			int phoneBookChoice = input.nextInt();
		
			switch (phoneBookChoice) {
				case 1: System.out.println("Search");	break;
				case 2: System.out.println("Service Nos."); break;
				case 3: System.out.println("Add name"); break;
				case 4: System.out.println("Erase"); break;
				case 5: System.out.println("Edit"); break;
				case 6: System.out.println("Assign tone"); break;
				case 7: System.out.println("Send b'card"); break;
				case 8: { System.out.println("1. Type of view\n2. Memory status"); 
					int options = input.nextInt();
					
					switch (options) {
						case 1: System.out.println("Type of view"); break;
						case 2: System.out.println("Memory status"); break;
						default: break;
					}
					break;
				}
				case 9: System.out.println("Speed dials"); break;
				case 10: System.out.println("Voice tags"); break;	
				//default: break;
			}//switch phoneBook
			}//case 1 menuChoice
		
			case 2: {
			String messages = """
			1. Write messages
			2. Inbox
			3. Outbox
			4. Picture Messages
			5. Templates
			6. Smileys
			7. Message settings
			8. Info services
			9. Voice mailbox number
			10. Service command editor
			""";
			System.out.print(messages);
			int messagesChoice = input.nextInt();
			
			switch (messagesChoice) {
				case 1: System.out.println("Write messages"); break;
				case 2: System.out.println("Inbox"); break;
				case 3: System.out.println("Outbox"); break;
				case 4: System.out.println("Picture messages"); break;
				case 5: System.out.println("Templates"); break;
				case 6: System.out.println("Smileys"); break;
				case 7: {
					System.out.println("1. Set 1\n2. Common");
					int messageSettings = input.nextInt();
					
					switch (messageSettings) {
						case 1: { 
							System.out.print("1. Message centre number\n2. Message sent as\n3. Message validity");
							int set1 = input.nextInt();
							switch (set1) {
								case 1: System.out.println("Message centre number"); break;
								case 2: System.out.println("Message sent as"); break;
								case 3: System.out.println("Message validity"); break;
								default:  break;
							}// switch set1
						break;
						}//case 1 message settings
						
						case 2: {
							System.out.println("1. Delivery reports\n2. Reply via same centre\n3. Character support");
							int common = input.nextInt();
							switch (common) {
								case 1: System.out.println("Delivery reports"); break;
								case 2: System.out.println("Reply via same centre"); break;
								case 3: System.out.println("Character support"); break;
							}//switch common
						break;
						}//case 2 message settings
					}//switch messageSettings
					 break;
				}//case 7 messageChoice
				
				case 8: System.out.println("Info service"); break;
				case 9: System.out.println("Voice mailbox number"); break;
				case 10: System.out.println("Service command editor"); break;
				default: break;
			}//switch messagesChoice
			break;
			}//case 2 menuChoice
			
			case 3: System.out.println("Chat"); break; // case 3 menuChoice
			case 4: { 
				String callRegister = """
				1. Missed calls
				2. Received calls
				3. Dialled numbers
				4. Erase recent call lists
				5. Show call duration
				6. Show call costs
				7. Call cost settings
				8. Prepaid unit
				""";
				System.out.println(callRegister);
				int callRegisterChoice = input.nextInt();
				
				switch (callRegisterChoice) {
					case 1: System.out.println("Missed calls"); break;
					case 2: System.out.println("Received calls"); break;
					case 3: System.out.println("Dialled numbers"); break;
					case 4: System.out.println("Erase recent call lists"); break;
					case 5: {
						System.out.println("1. Last call duration\n2. All calls' duration\n3. Received calls' duration\n4. Dialled calls' duration\n5. Clear timers");
						int showCallDuration = input.nextInt();
					
						switch (showCallDuration) {
							case 1: System.out.println("Last call duration"); break;
							case 2: System.out.println("All calls' duration"); break;
							case 3: System.out.println("Received calls' duration"); break;
							case 4: System.out.println("Dialled calls' duration"); break;
							case 5: System.out.println("Clear timers"); break;
							default: break;
						}//switch showCallDuration
						break;
					}//case 5 callRegisterChoice
					case 6: {
						System.out.println("1. Last call cost\n2. All calls' cost\n3. Clear counters");
						int showCallCostsChoice = input.nextInt();
						
						switch (showCallCostsChoice) {
							case 1: System.out.println("Last call cost"); break;
							case 2: System.out.println("All calls' cost"); break;
							case 3: System.out.println("Clear counters"); break;
							default: break;
						}//switch showCallCostsChoice
						break;
					}//case 6 callRegisterChoice
					case 7: {
						System.out.println("1. Call cost limit\n2. Show costs in");
						int callCostSettings = input.nextInt();
						
						switch (callCostSettings) {
							case 1: System.out.println("Call cost limit"); break;
							case 2: System.out.println("Show costs in"); break;
							default: break;
						}//switch callCostSettings
						break;
					}//case 7 callRegisterChoice
					case 8: System.out.println("Prepaid credit"); break; // case 8 callRegisterChoice
					default: break;
				}//switch callRegisterChoice
				break;	
			}//case 4 call register
			case 5: {
				String tones = """
				1. Ringing tone
				2. Ringing volume
				3. Incoming call alert
				4. Composer
				5. Message alert tone
				6. Keypad tones
				7. Warning and game tones
				8. Vibrating alert
				9. Screen saver
				""";
				System.out.println(tones);
				int tonesChoice = input.nextInt();
				
				switch(tonesChoice) {
					case 1: System.out.println("Ringing tone"); break;
					case 2: System.out.println("Ringing volume"); break;
					case 3: System.out.println("Incoming call alert"); break;
					case 4: System.out.println("Composer"); break;
					case 5: System.out.println("Message alert tone"); break;
					case 6: System.out.println("Keypad tones"); break;
					case 7: System.out.println("Warning snd game tones"); break;
					case 8: System.out.println("Vibrating alert"); break;
					case 9: System.out.println("Screen saver"); break;
					default: break;
				}// switch tonesChoice
				break;
			}// case 5 Tones
			case 6: {
				String settings = """
				1. Call settings
				2. Phone settings
				3. Security settings
				4. Restore factory settings
				""";
				System.out.println(settings);
				int settingsChoice = input.nextInt();
				
				switch (settingsChoice) {
					case 1: {
						System.out.println("1. Automatic redial\n2. Speed dialing\n3. Call waiting options\n4. Own number sending\n5. Phone linr in use\n6. Automatic answer");
						int callSettingsChoice = input.nextInt();
						
						switch (callSettingsChoice) {
							case 1: System.out.println("Automatic redial"); break;
							case 2: System.out.println("Speed dialing"); break;
							case 3: System.out.println("Call waiting options"); break;
							case 4: System.out.println("Own number sending"); break;
							case 5: System.out.println("Phone line in use"); break;
							case 6: System.out.println("Automatic answer"); break;
							default: break;
						}//switch callSettingsChoice
						break;
					}//case 1 settingsChoice
					case 2: {
						System.out.println("1. Language\n2. Cell info display\n3. Welcome note\n4. Network selection\n5. Lights\n6. Confirm SIM service actions");
						int phoneSettingsChoice = input.nextInt();
						
						switch (phoneSettingsChoice) {
							case 1: System.out.println("Language"); break;
							case 2: System.out.println("Cell info display"); break;
							case 3: System.out.println("Welcome note"); break;
							case 4: System.out.println("Network selection"); break;
							case 5: System.out.println("Lights"); break;
							case 6: System.out.println("Confirm SIM service actions"); break;
							default: break;
						}//switch phoneSettingsChoice
						break;
					}//case 2 settingsChoice
					case 3: {
						System.out.println("1. PIN code request\n2. Call barring service\n3. Fixed dialling\n4. Closed user group\n5. Phone security\n6. Change access codes");
						int securitySettingsChoice = input.nextInt();
						switch (securitySettingsChoice) {
							case 1: System.out.println("PIN code request"); break;
							case 2: System.out.println("Call barring service"); break;
							case 3: System.out.println("Fixed dialling"); break;
							case 4: System.out.println("Closed user group"); break;
							case 5: System.out.println("Phone security"); break;
							case 6: System.out.println("Change access codes"); break;
							default: break;
						}// switch securitySettingsChoice
						break;
					}//case 3 settingsChoice
					case 4: System.out.println("Restore factory settings"); break;
					default: break;
				}//switch settingsChoice
				break;
			}// case 6 Tones
			case 7: {
				System.out.println("Call divert"); break;
			}//case 7 Call divert	
			case 8: {
				System.out.println("Games"); break;
			}//case 8 Games 
			case 9: {
				System.out.println("Calculator"); break;
			}//case 9 Calculator
			case 10: {
				System.out.println("Reminders"); break;
			}//case 10 Reminders
			case 11: {
				System.out.println("1. Alarm clock\n2. Clock settings\n3. Date setting\n4. Stopwatch\n5. Countdown timer\n6. Auto update of date and time");
				int clockChoice = input.nextInt();
				
				switch (clockChoice) {
					case 1: System.out.println("Alarm clock"); break;
					case 2: System.out.println("Clock settings"); break;
					case 3: System.out.println("Date setting"); break;
					case 4: System.out.println("Stopwatch"); break;
					case 5: System.out.println("Countdown timer"); break;
					case 6: System.out.println("Auto update of date and time"); break;
					default: break;
				}//switch clockChoice
				break;
			}//case 11 clock
			case 12: {
				System.out.println("Profiles"); break;
			}// case 12 Profiles
			case 13: {
				System.out.println("SIM services"); break;
			}// case 12 Profiles
			default: break;
		}//switch menu choice
	}
}