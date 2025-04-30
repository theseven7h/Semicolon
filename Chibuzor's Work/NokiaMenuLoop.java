import java.util.Scanner;

public class NokiaMenuLoop {
	static Scanner input = new Scanner(System.in);
	
	public static void main(String[] args) {

		int mainMenuChoice = 0;
		do {
		System.out.println();
		String mainMenu = 
		"""
		---WELCOME---
		Press 1 for menu
		
		""";
		
		System.out.print(mainMenu);
		mainMenuChoice = input.nextInt();
		switch (mainMenuChoice) {
			case 1: nokiaMenu();
			
		}//switch mainMenu
		} while (mainMenuChoice != 1);
	}//main method


		
	public static void nokiaMenu() {
		int menuChoice;
		do {
		String menu = """

			----MENU----
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
			0. Quit
		
			""";
			System.out.print(menu);
			menuChoice = input.nextInt();
		
			switch (menuChoice) {
				case 1: phoneBook(); break;
				case 2: messages(); break;
				case 3: chat(); break;
				case 4: callRegister(); break;
				case 5: tones(); break;
				case 6: settings(); break;
				case 7: callDivert(); break;
				case 8: games(); break;
				case 9: calculator(); break;
				case 10: reminders(); break;
				case 11: clock(); break;
				case 12: profiles(); break;
				case 13: simServices(); break;
				case 0: System.exit(0);
				
			}//switch menuChoice
		} while ((menuChoice < 1 && menuChoice != 0) || menuChoice > 13);
	}//nokia menu method
		
		
	public static void phoneBook() {
		int phoneBookChoice;
		do {
		String phoneBook = """
		
		----PHONEBOOK----
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
		0. Back
		
		""";
		System.out.print(phoneBook);
		phoneBookChoice = input.nextInt();
		
		switch (phoneBookChoice) {
			case 1: while (true) {
				System.out.println("----SEARCH----\nSearch\n0. Back\n");	
				int search = input.nextInt();
				switch (search) {
					case 0 : phoneBook();
				}//switch search
				}
							
			case 2: while (true) {
				System.out.println("----SERVICE NOS.----\nService Nos\n0. Back\n");	
				int serviceNos = input.nextInt();
				switch (serviceNos) {
					case 0 : phoneBook();
				}//switch serviceNos
				}
						
			case 3:	while (true) {
				System.out.println("----ADD NAME----\nAdd name\n0. Back\n");	
				int addName = input.nextInt();
				switch (addName) {
					case 0: phoneBook();
				}//switch addName
				}
				
			case 4: while (true) {
				System.out.println("----ERASE----\nErase\n0. Back\n");	
				int erase = input.nextInt();
				switch (erase) {
					case 0: phoneBook();
				}//switch erase
				}
						
			case 5: while (true) {
				System.out.println("----EDIT----\nEdit\n0. Back\n");	
				int edit = input.nextInt();
				switch (edit) {
					case 0: phoneBook();
				}//switch edit
				}
						
			case 6: while (true) {
				System.out.println("----ASSIGN TONE----\nAssign tone\n0. Back\n");	
				int assignTone = input.nextInt();
				switch (assignTone) {
					case 0: phoneBook();
				}//switch assignTone
				}
						
			case 7: while (true) {
				System.out.println("----SEND B'CARD----\nSend b'card\n0. Back\n");	
				int sendBcard = input.nextInt();
				switch (sendBcard) {
					case 0: phoneBook();
				}//switch sendBcard
				}
						
			case 8: while (true) {
				{ System.out.println("----OPTIONS----\n1. Type of view\n2. Memory status\n0. Back\n"); 
				int options = input.nextInt();	
				switch (options) {
					case 1: boolean typeOfViewB= true;
						while (typeOfViewB) {
						System.out.println("Type of view\n0. Back\n");	
						int typeOfView = input.nextInt();
						switch (typeOfView) {
							case 0 -> typeOfViewB = false;
						}//switch typeOfView
						}break;
						
						
					case 2: boolean memoryStatusB = true;
						while (memoryStatusB) {
						System.out.println("Memory status\n0. Back\n");	
						int memoryStatus = input.nextInt();
						switch (memoryStatus) {
							case 0: memoryStatusB = false;
						}//switch memoryStatus
						}break;
						
								
					case 0: phoneBook();
				}//switch options
			}//case 8 options
			}
			
			case 9: while (true) {
				System.out.println("----SPEED DIALS----\nSpeed dials\n0. Back\n");	
				int speedDials = input.nextInt();
				switch (speedDials) {
					case 0: phoneBook();
				}//switch speedDials
				}
				
			case 10:while (true) {
			 	System.out.println("----VOICE TAGS----\nVoice tags\n0. Back\n");	
				int voiceTags = input.nextInt();
				switch (voiceTags) {
					case 0: phoneBook();
				}//switch voiceTags
				}
				
			case 0: nokiaMenu(); 
		}//switch phoneBookChoice
		} while (phoneBookChoice >= 0 || phoneBookChoice < 10);
	}//phoneBook method
			
			
	public static void messages() {
		int messagesChoice;
		do{

		String messages = """
			
		----MESSAGES----
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
		0. Back
			
		""";
		System.out.print(messages);
		messagesChoice = input.nextInt();
			
		switch (messagesChoice) {
			case 1: while (true) {
				System.out.println("----WRITE MESSAGES----\nWrite messages\n0. Back\n");	
				int writeMessage = input.nextInt();
				switch (writeMessage) {
					case 0: messages();
				}//switch voiceTags
				}

			case 2: while (true) {
				System.out.println("----INBOX----\nInbox\n0. Back\n");	
				int inbox = input.nextInt();
				switch (inbox) {
					case 0: messages();
				}//switch voiceTags
				}
			case 3: while (true) {
				System.out.println("----OUTBOX----\nOutbox\n0. Back\n");
				int outbox = input.nextInt();
				switch (outbox) {
					case 0: messages();
				}//switch voiceTags
				}	
			case 4: while (true) {
				System.out.println("----PICTURE MESSAGES----\nPicture messages\n0. Back\n");	
				int pictureMessage = input.nextInt();
				switch (pictureMessage) {
					case 0: messages();
				}//switch voiceTags
				}	
			case 5: while (true) {
				System.out.println("----TEMPLATE----\nTemplates\n0. Back\n");	
				int templates = input.nextInt();
				switch (templates) {
					case 0: messages();
				}//switch voiceTags
				}	
			case 6: while (true) {
				System.out.println("----SMILEYS----\nSmileys\n0. Back\n");	
				int smileys = input.nextInt();
				switch (smileys) {
					case 0: messages();
				}//switch voiceTags
				}
			case 7: while (true) {
				{
				System.out.println("----MESSAGE SETTINGS----\n1. Set\n2. Common\n0. Back\n");
				int messageSettings = input.nextInt();
					
				switch (messageSettings) {
					case 1: boolean messageCentreNum = true;
						while (messageCentreNum) { 
						
						System.out.println("----SET 1----\n1. Message centre number\n2. Message sent as\n3. Message validity\n0. Back\n");
						int set1 = input.nextInt();
						switch (set1) {
							case 1: boolean messageCentNumb = true;
							while (messageCentNumb) {
							System.out.println("----MESSAGE CENTRE NUMBER----\nMessage centre number\n0. Back\n");	
							int messageCentreNumber = input.nextInt();
							switch (messageCentreNumber) {
								case 0: messageCentNumb = false;
							}//switch messageCentreNumber
							}//loop
							break;	
							
							case 2: boolean messageSentB = true;
							while (messageSentB) {
							System.out.println("----MESSAGE SENT----\nMessage sent as\n0. Back\n");	
							int messageSent = input.nextInt();
							switch (messageSent) {
								case 0: messageSentB = false;
							}//switch messageSent
							}//loop
							break;	
							
							case 3: boolean messageVal = true; 
							while (messageVal) {
							System.out.println("----MESSAGE VALIDITY----\nMessage validity\n0. Back\n");	
							int messageValidity = input.nextInt();
							switch (messageValidity) {
								case 0: messageVal = false;
							}//switch messageValidity
							}//loop
							break;
	
							case 0: messageCentreNum = false;
						}// switch set1
					}//loop
					break;
						
					case 2: boolean deliveryReport = true;
						while (deliveryReport) {
						{
						System.out.println("1. Delivery reports\n2. Reply via same centre\n3. Character support\n0. Back\n");
						int common = input.nextInt();
						switch (common) {
							case 1: boolean deliveryRep = true;
							while (deliveryRep) {
							System.out.println("----DELIVERY REPORTS----\nDelivery reports\n0. Back\n");	
							int deliveryReports = input.nextInt();
							switch (deliveryReports) {
								case 0: deliveryRep = false;
							}//switch deliveryReports
							}// loop
							break;	
							
							case 2: boolean reply = true;
							while (reply) {
							System.out.println("----REPLY VIA SAME CENTRE----\nReply via same centre\n0. Back\n");	
							int replyViaSameCentre = input.nextInt();
							switch (replyViaSameCentre) {
								case 0: reply = false;
							}//switch replyViaSameCentre
							}//loop
							break;	
							
							case 3: boolean character = true;
							while (character) {
							System.out.println("----CHARACTER SUPPORT----\nCharacter support\n0. Back\n");	
							int characterSupport = input.nextInt();
							switch (characterSupport) {
								case 0: character = false;
							}//switch characterSupport
							}//loop
							break;	
							
							case 0: deliveryReport = false;
						}//switch common
					}//case 2 message settings
					}break;
					
					case 0: messages();
				}//switch messageSettings
			}//case 7 messageChoice	
			}//loop
				
			case 8: while (true) {
				System.out.println("----INFO SERVICE----\nInfo service\n0. Back\n");	
				int infoService = input.nextInt();
				switch (infoService) {
					case 0: messages();
				}//switch infoService
				}//loop	
				
			case 9: while (true) {
				System.out.println("----VOICE MAILBOX NUMBER----\nVoice mailbox number\n0. Back\n");	
				int voiceMailboxNumber = input.nextInt();
				switch (voiceMailboxNumber) {
					case 0: messages();
				}//switch voiceMailboxNumber
				}
				
			case 10: while (true) {
				System.out.println("----SERVICE COMMAND EDITOR----\nService command editor\n0. Back\n");	
				int serviceCommandEditor = input.nextInt();
				switch (serviceCommandEditor) {
					case 0: messages();
				}//switch serviceCommandEditor
				}//loop	
			
			case 0: nokiaMenu();

		}//switch messagesChoice
		} while (messagesChoice >= 0 || messagesChoice < 10);
	}// messages method
			
	public static void chat() {
		int chat;
		do {
		System.out.println("----CHAT----\nChat\n0. Back\n");	
		chat = input.nextInt();
		switch (chat) {
			case 0: nokiaMenu();
		}//switch chat
		} while (chat != 0); 
	}//chat method
				
	public static void callRegister() { 
		int callRegisterChoice;
		do {
		String callRegister = """
		
		----CALL REGISTER----
		1. Missed calls
		2. Received calls
		3. Dialled numbers
		4. Erase recent call lists
		5. Show call duration
		6. Show call costs
		7. Call cost settings
		8. Prepaid unit
		0. Back
				
		""";
		System.out.println(callRegister);
		callRegisterChoice = input.nextInt();
		
		switch (callRegisterChoice) {
			case 1: while (true) {
			System.out.println("----MISSED CALLS----\nMissed calls\n0. Back\n");	
			int missedCalls = input.nextInt();
			switch (missedCalls) {
				case 0: callRegister();
			}//switch callRegisterChoice
			}//loop
			
			case 2: while (true) {
			System.out.println("----RECEIVED CALLS----\nReceived calls\n0. Back\n");	
			int receivedCalls = input.nextInt();
			switch (receivedCalls) {
				case 0: callRegister();
			}//switch receivedCalls
			}
			
			case 3: while (true) {
			System.out.println("----DIALLED NUMBERS----\nDialled numbers\n0. Back\n");	
			int dialledNumbers = input.nextInt();
			switch (dialledNumbers) {
				case 0: callRegister();
			}//switch dialledNumbers
			}//loop
			
			case 4: while (true) {
			System.out.println("----ERASE RECENT CALL LISTS----\nErase recent call lists\n0. Back\n");	
			int eraseRecent = input.nextInt();
			switch (eraseRecent) {
				case 0: callRegister();
			}//switch eraseRecent 
			}//loop
			
			case 5:
				{
				while (true) {
				System.out.println("----SHOW CALL DURATION----\n1. Last call duration\n2. All calls' duration\n3. Received calls' duration\n4. Dialled calls' duration\n5. Clear timers\n0. Back\n");
				int showCallDuration = input.nextInt();
				
				switch (showCallDuration) {
					case 1:	boolean lastCallDurationB = true; 
						while (lastCallDurationB) {
						System.out.println("----LAST CALL DURATION----\nLast call duration\n0. Back\n");	
						int lastCall = input.nextInt();
						switch (lastCall) {
							case 0: lastCallDurationB = false;
						}//switch lastCallDuration 
						}//loop
						break;
			
					case 2: boolean allCall = true;
						while (allCall) {
						System.out.println("----ALL CALLS' DURATION----\nAll calls' duration\n0. Back\n");	
						int allCalls = input.nextInt();
						switch (allCalls) {
							case 0: allCall = false;
						}//switch allCalls
						}//loop
						break;
			
					case 3: boolean received = true;
						while (received) {
						System.out.println("----RECEIVED CALLS----\nReceived calls' duration\n0. Back\n");	
						int receivedCalls2 = input.nextInt();
						switch (receivedCalls2) {
							case 0: received = false;
						}//switch receivedCalls
						}//loop
						break;
			
					case 4: boolean dialled = true;
						while (dialled) {
						System.out.println("----DIALLED CALLS----\nDialled calls' duration\n0. Back\n");	
						int dialledCalls = input.nextInt();
						switch (dialledCalls) {
							case 0: dialled = false;
						}//switch dialledCalls 
						}//loop
						break;
			
					case 5: boolean clear = true;
						while (clear) {
						System.out.println("----CLEAR TIMERS----\nClear timers\n0. Back\n");	
						int clearTimers = input.nextInt();
						switch (clearTimers) {
							case 0: clear = false;
						}//switch clearTimers 
						}//loop
						break;
			
					case 0: callRegister();
				}//switch showCallDuration
				}//loop
			}//case 5 callRegisterChoice
			
			
			
			case 6: while (true) {
				System.out.println("----SHOW CALL COSTS----\n1. Last call cost\n2. All calls' cost\n3. Clear counters\n0. Back\n");
				int showCallCostsChoice = input.nextInt();
						
				switch (showCallCostsChoice) {
				case 1: boolean lastCall = true;
					while (lastCall) {
					System.out.println("----LAST CALL COSTS----\nLast call cost\n0. Back\n");	
					int lastCallCosts = input.nextInt();
					switch (lastCallCosts) {
						case 0: lastCall = false;
					}//switch lastCallCosts 
					}//loop
					break;
				
				case 2: boolean callsCosts = true;
					while (callsCosts) {
					System.out.println("----ALL CALLS' COSTS----\nAll calls' cost\n0. Back\n");	
					int allCallsCosts = input.nextInt();
					switch (allCallsCosts) {
						case 0: callsCosts = false;
					}//switch allCallsCosts
					}//loop
					break;
			
				case 3: boolean counters = true;
					while (counters) {
					System.out.println("----CLEAR COUNTERS----\nClear counters\n0. Back\n");	
					int clearCounters = input.nextInt();
					switch (clearCounters) {
						case 0: counters = false;
					}//switch clearCounters
					}//loop
					break;
			
				case 0: callRegister();
				}//switch showCallCostsChoice
			}//loop

			
			case 7: while (true) {
				System.out.println("----CALL COST SETTINGs----\n1. Call cost limit\n2. Show costs in\n0. Back\n");
				int callCostSettings = input.nextInt();
						
				switch (callCostSettings) {
					case 1: boolean costLimit = true;
					while (costLimit) {
					System.out.println("----CALL COST LIMIT----\nCall cost limit\n0. Back\n");	
					int callCostLimit = input.nextInt();
					switch (callCostLimit) {
						case 0: costLimit = false;
					}//switch callCostLimit
					}//loop
					break;
			
					case 2: boolean showCost = true;
					while (showCost) {
					System.out.println("----SHOW COSTS IN----\nShow costs in\n0. Back\n");	
					int showCostsIn = input.nextInt();
					switch (showCostsIn) {
						case 0: showCost = false;
					}//switch showCostsIn
					}//loop
					break;
			
					case 0: callRegister();
				}//switch callCostSettings
			}//loop
			
			case 8: while (true) {
			System.out.println("----PREPAID CREDIT----\nPrepaid credit\n0. Back\n");	
			int prepaidCredit = input.nextInt();
			switch (prepaidCredit) {
				case 0: callRegister();
			}//switch prepaidCredit
			}//loop
			
			case 0: nokiaMenu();

		}//switch callRegisterChoice
		} while (callRegisterChoice >= 0 || callRegisterChoice < 8);	
	}//callRegister method
			
	public static void tones() {
		int tonesChoice;
		do {
		String tones = """
		
		----TONES----
		1. Ringing tone
		2. Ringing volume
		3. Incoming call alert
		4. Composer
		5. Message alert tone
		6. Keypad tones
		7. Warning and game tones
		8. Vibrating alert
		9. Screen saver
		0. Back
		
		""";
		System.out.println(tones);
		tonesChoice = input.nextInt();
				
		switch(tonesChoice) {
			case 1: while (true) {
			System.out.println("----RINGING TONE----\nRinging tone\n0. Back\n");	
			int ringingTone = input.nextInt();
			switch (ringingTone) {
				case 0: tones();
			}//switch ringingTone
			}//loop
			
			case 2: while (true) {
			System.out.println("----RINGING VOLUME----\nRinging volume\n0. Back\n");	
			int ringingVolume = input.nextInt();
			switch (ringingVolume) {
				case 0: tones();
			}//switch ringingVolume
			}//loop
			
			case 3: while (true) {
			System.out.println("----INCOMING CALL ALERT----\nIncoming call alert\n0. Back\n");	
			int incomingCallAlert = input.nextInt();
			switch (incomingCallAlert) {
				case 0: tones();
			}//switch incomingCallAlert
			}//loop
			
			case 4: while (true) {
			System.out.println("----COMPOSER----\nComposer\n0. Back\n");	
			int composer = input.nextInt();
			switch (composer) {
				case 0: tones();
			}//switch composer
			}//loop
			
			case 5: while (true) {
			System.out.println("----MESSAGE ALERT TONE\nMessage alert tone\n0. Back\n");	
			int messageAlertTone = input.nextInt();
			switch (messageAlertTone) {
				case 0: tones();
			}//switch messageAlertTone
			}//loop
			
			case 6: while (true) {
			System.out.println("----KEYPAD TONES----\nKeypad tones\n0. Back\n");	
			int keypadTones = input.nextInt();
				switch (keypadTones) {
					case 0: tones();
				}//switch keypadTones
				}//loop
			
			case 7: while (true) {
			System.out.println("----WARNING AND GAME TONES----\nWarning snd game tones\n0. Back\n");	
			int warningAndGameTones = input.nextInt();
				switch (warningAndGameTones) {
					case 0: tones();
				}//switch warningAndGameTones
				}//loop
			
			case 8: while (true) {
			System.out.println("----VIBRATING ALERT----\nVibrating alert\n0. Back\n");	
			int vibratingAlert = input.nextInt();
				switch (vibratingAlert) {
					case 0: tones();
				}//switch vibratingAlert
				}//loop
			
			case 9: System.out.println("----SCREEN SAVER----\nScreen saver\n0. Back\n");	
			int screenSaver = input.nextInt();
				switch (screenSaver) {
					case 0: tones();
					default: break;
				}//switch screenSaver
				break;
			
			case 0: nokiaMenu();
			
		}// switch tonesChoice
		} while (tonesChoice >= 0 || tonesChoice < 9);
	}// Tones method
	
	public static void settings() {
		int settingsChoice;
		do {

		String settings = """
		
		----SETTINGS----
		1. Call settings
		2. Phone settings
		3. Security settings
		4. Restore factory settings
		0. Back
		
		""";
		System.out.println(settings);
		settingsChoice = input.nextInt();
				
		switch (settingsChoice) {
			case 1: {
				System.out.println("----CALL SETTINGS----\n1. Automatic redial\n2. Speed dialing\n3. Call waiting options\n4. Own number sending\n5. Phone line in use\n6. Automatic answer\n0. Back\n");
				int callSettingsChoice = input.nextInt();
						
				switch (callSettingsChoice) {
					case 1: System.out.println("----AUTOMATIC REDIAL----\nAutomatic redial\n0. Back\n");	
					int automaticRedial = input.nextInt();
					switch (automaticRedial) {
						case 0: settings();
						default: break;
					}//switch automaticRedial
					break;
					
					case 2: System.out.println("----SPEED DIALLING----\nSpeed dialling\n0. Back\n");	
					int speedDialling = input.nextInt();
					switch (speedDialling) {
						case 0: settings();
						default: break;
					}//switch speedDialing
					break;
					
					case 3: System.out.println("----CALL WAITING OPTIONS----\nCall waiting options\n0. Back\n");	
					int callWaitingOptions = input.nextInt();
					switch (callWaitingOptions) {
						case 0: settings();
						default: break;
					}//switch callWaitingOptions
					break;
					
					case 4: System.out.println("----OWN NUMBER SENDING----\nOwn number sending\n0. Back\n");	
					int ownNumberSetting = input.nextInt();
					switch (ownNumberSetting) {
						case 0: settings();
						default: break;
					}//switch ownNumberSetting
					break;
					
					case 5: System.out.println("----PHONE LINE IN USE----\nPhone line in use\n0. Back\n");	
					int phoneLineInUse = input.nextInt();
					switch (phoneLineInUse) {
						case 0: settings();
						default: break;
					}//switch phoneLineInUse
					break;
					
					case 6: System.out.println("----AUTOMATIC ANSWER----\nAutomatic answer\n0. Back\n");	
					int automaticAnswer = input.nextInt();
					switch (automaticAnswer) {
						case 0: settings();
						default: break;
					}//switch automaticAnswer
					break;
					
					case 0: nokiaMenu();
					default: break;
				}//switch callSettingsChoice
				break;
			}//case 1 settingsChoice
			
			case 2: {
				System.out.println("----PHONE SETTINGS----\n1. Language\n2. Cell info display\n3. Welcome note\n4. Network selection\n5. Lights\n6. Confirm SIM service actions\n0. Back\n");
				int phoneSettingsChoice = input.nextInt();
						
				switch (phoneSettingsChoice) {
					case 1: System.out.println("----LANGUAGE----\nLanguage\n0. Back\n");	
					int language = input.nextInt();
					switch (language) {
						case 0: settings();
						default: break;
					}//switch language
					break;
					
					case 2: System.out.println("----CELL INFO DISPLAY----\nCell info display\n0. Back\n");	
					int cellInfoDisplay = input.nextInt();
					switch (cellInfoDisplay) {
						case 0: settings();
						default: break;
					}//switch cellInfoDisplay
					break;
					
					case 3: System.out.println("----WELCOME NOTE----\nWelcome note\n0. Back\n");	
					int welcomeNote = input.nextInt();
					switch (welcomeNote) {
						case 0: settings();
						default: break;
					}//switch welcomeNote
					break;
					
					case 4: System.out.println("----NETWORK SELECTION----\nNetwork selection\n0. Back\n");	
					int networkSelection = input.nextInt();
					switch (networkSelection) {
						case 0: settings();
						default: break;
					}//switch networkSelection
					break;
					
					case 5: System.out.println("----LIGHTS----\nLights\n0. Back\n");	
					int lights = input.nextInt();
					switch (lights) {
						case 0: settings();
						default: break;
					}//switch lights
					break;
					
					case 6: System.out.println("----CONFIRM SIM SERVICE ACTIONS----\nConfirm SIM service actions\n0. Back\n");	
					int confirmSimServiceActions = input.nextInt();
					switch (confirmSimServiceActions) {
						case 0: settings();
						default: break;
					}//switch confirmSimServiceActions
					break;
					
					case 0: nokiaMenu();
					default: break;
				}//switch phoneSettingsChoice
				break;
			}//case 2 settingsChoice
		
			case 3: {
				System.out.println("----SECURITY SETTINGS----1. PIN code request\n2. Call barring service\n3. Fixed dialling\n4. Closed user group\n5. Phone security\n6. Change access codes\n0. Back\n");
				int securitySettingsChoice = input.nextInt();
				
				switch (securitySettingsChoice) {
					case 1: System.out.println("----PIN CODE REQUEST----\nPIN code request\n0. Back\n");	
					int pinCodeRequest = input.nextInt();
					switch (pinCodeRequest) {
						case 0: settings();
						default: break;
					}//switch pinCodeRequest
					break;
					
					case 2: System.out.println("----CALL BARRING SERVICE----\nCall barring service\n0. Back\n");	
					int callBarringService = input.nextInt();
					switch (callBarringService) {
						case 0: settings();
						default: break;
					}//switch callBarringService
					break;
					
					case 3: System.out.println("----FIXED DIALLING----\nFixed dialling\n0. Back\n");	
					int fixedDialling = input.nextInt();
					switch (fixedDialling) {
						case 0: settings();
						default: break;
					}//switch fixedDialling
					break;
					
					case 4: System.out.println("----CLOSED USER GROUP----\nClosed user group\n0. Back\n");	
					int closedUserGroup = input.nextInt();
					switch (closedUserGroup) {
						case 0: settings();
						default: break;
					}//switch closedUserGroup
					break;
					
					case 5: System.out.println("----PHONE SECURITY----\nPhone security\n0. Back\n");	
					int phoneSecurity = input.nextInt();
					switch (phoneSecurity) {
						case 0: settings();
						default: break;
					}//switch phoneSecurity
					break;
					
					case 6: System.out.println("----CHANGE ACCESS CODES----\nChange access codes\n0. Back\n");	
					int changeAccessCodes = input.nextInt();
					switch (changeAccessCodes) {
						case 0: settings();
						default: break;
					}//switch changeAccessCodes
					break;
					default: break;
				}// switch securitySettingsChoice
				break;
			}//case 3 settingsChoice
			case 4: System.out.println("----RESTORE FACTORY SETTINGS----\nRestore factory settings\n0. Back\n");	
				int restoreFactorySettings = input.nextInt();
				switch (restoreFactorySettings) {
					case 0: settings();
					default: break;
				}//switch restoreFactorySettings
				break;
				
			case 0: nokiaMenu();
		}//switch settingsChoice
		} while (settingsChoice < 0 || settingsChoice > 4);
	}//Tones method
	
	public static void callDivert() {
		int callDivert;

		do{
		System.out.println("----CALL DIVERT----\nCall divert\n0. Back\n");	
		callDivert = input.nextInt();
		switch (callDivert) {
			case 0: nokiaMenu();
			
		}//switch callDivert
		} while (callDivert != 0);
	}//Call divert	method
	
	public static void games() {
		int games;
		do {
		System.out.println("----GAMES----\nGames\n0. Back\n");	
		games = input.nextInt();
		switch (games) {
			case 0: nokiaMenu();
			default: break;
		}//switch games
		} while (games != 0); 
	}//games method
	
	public static void calculator() {
		int calculator;
		do {
		System.out.println("----CALCULATOR----\nCalculator\n0. Back\n");	
		calculator = input.nextInt();
		switch (calculator) {
			case 0: nokiaMenu();
		
		}//switch calculator
		} while (calculator != 0);
	}//calculator method
	
	public static void reminders() {
		int reminders;
		do {
		System.out.println("----REMINDERS----\nReminders\n0. Back\n");	
		reminders = input.nextInt();
		switch (reminders) {
			case 0: nokiaMenu();
		}//switch reminders
		} while (reminders != 0);
	}//reminders method
	
	public static void clock() {

		int clockChoice;
		do {
		System.out.println("----CLOCK----\n1. Alarm clock\n2. Clock settings\n3. Date setting\n4. Stopwatch\n5. Countdown timer\n6. Auto update of date and time\n0. Back");
		clockChoice = input.nextInt();		
		switch (clockChoice) {
			case 1: System.out.println("----ALARM CLOCK----\nAlarm clock\n0. Back\n");	
				int alarmClock = input.nextInt();
				switch (alarmClock) {
					case 0: clock();
					default: break;
				}//switch alarmClock
				break;

			case 2: System.out.println("----CLOCK SETTINGS----\nClock settings\n0. Back\n");
				int clockSettings = input.nextInt();		
				switch (clockSettings) {
					case 0: clock();
					default: break;
				}//switch reminders
				break;
			
			case 3: System.out.println("----DATE SETTING----\nDate setting\n0. Back\n");
				int dateSetting = input.nextInt();		
				switch (dateSetting) {
					case 0: clock();
					default: break;
				}//switch dateSetting
				break;
			
			case 4: System.out.println("----STOPWATCH----\nStopwatch\n0. Back\n");
				int stopwatch = input.nextInt();		
				switch (stopwatch) {
					case 0: clock();
					default: break;
				}//switch stopwatch
				break;
			
			case 5: System.out.println("----COUNTDOWN TIMER----\nCountdown timer\n0. Back\n");
				int countdownTimer = input.nextInt();		
				switch (countdownTimer) {
					case 0: clock();
					default: break;
				}//switch countdownTimer
				break;
			
			case 6: System.out.println("----AUTO UPDATE OF DATE AND TIME----\nAuto update of date and time\n0. Back\n");
				int autoupdate = input.nextInt();		
				switch (autoupdate) {
					case 0: clock();
					default: break;
				}//switch autoupdate
				break;
			case 0: nokiaMenu();
		}//switch clockChoice
		} while (clockChoice < 0 || clockChoice > 6);
	}//clock method
	
	public static void profiles() {
		int profiles;
		do {
		System.out.println("----PROFILES----\nProfiles\n0. Back\n");	
		profiles = input.nextInt();
		switch (profiles) {
			case 0: nokiaMenu();
		}//switch profiles
		} while (profiles != 0);
	}//profiles method
	
	public static void simServices() {
		int simServices;
		do {
		System.out.println("----SIM SERVICES----\nSIM services\n0. Back\n");	
		simServices = input.nextInt();
		switch (simServices) {
			case 0: nokiaMenu();
		}//switch reminders
		} while (simServices != 0);
	}//simServices method

}//class