import java.util.ArrayList;
import java.util.Scanner;

public class MegaCasino {
	static Scanner s = new Scanner(System.in);

	static final String[] CASINO_TITLE = new String[] {
		" __  __ ______ _____          _____           _____ _____ _   _  ____  ",
		"|  \\/  |  ____/ ____|   /\\   / ____|   /\\    / ____|_   _| \\ | |/ __ \\ ",
		"| \\  / | |__ | |  __   /  \\ | |       /  \\  | (___   | | |  \\| | |  | |",
		"| |\\/| |  __|| | |_ | / /\\ \\| |      / /\\ \\  \\___ \\  | | | . ` | |  | |",
		"| |  | | |___| |__| |/ ____ \\ |____ / ____ \\ ____) |_| |_| |\\  | |__| |",
		"|_|  |_|______\\_____/_/    \\_\\_____/_/    \\_\\_____/|_____|_| \\_|\\____/ "
	};

	static final String[] CRAPS_TITLE = new String[] {
		"  ____ ____      _    ____  ____  ",
		" / ___|  _ \\    / \\  |  _ \\/ ___| ",
		"| |   | |_) |  / _ \\ | |_) \\___ \\ ",
		"| |___|  _ <  / ___ \\|  __/ ___) |",
		" \\____|_| \\_\\/_/   \\_\\_|   |____/ "
	};

	static final String[] HEADS_TAILS_TITLE = new String[] {
		" _   _ _____    _    ____  ____   _____  _    ___ _     ____  ",
		"| | | | ____|  / \\  |  _ \\/ ___| |_   _|/ \\  |_ _| |   / ___| ",
		"| |_| |  _|   / _ \\ | | | \\___ \\   | | / _ \\  | || |   \\___ \\ ",
		"|  _  | |___ / ___ \\| |_| |___) |  | |/ ___ \\ | || |___ ___) |",
		"|_| |_|_____/_/   \\_\\____/|____/   |_/_/   \\_\\___|_____|____/ "
	};

	static final String[] HIGH_LOW_TITLE = new String[] {
		" _   _ ___ ____ _   _   _     _____        __",
		"| | | |_ _/ ___| | | | | |   / _ \\ \\      / /",
		"| |_| || | |  _| |_| | | |  | | | |\\ \\ /\\ / / ",
		"|  _  || | |_| |  _  | | |__| |_| | \\ V  V /  ",
		"|_| |_|___\\____|_| |_| |_____\\___/   \\_/\\_/   "
	};

	static final String[] OVER_UNDER_EVEN_TITLE = new String[] {
		"  ___  _   _ _____ ____    _   _ _   _ ____  _____ ____  ",
		" / _ \\| | | | ____|  _ \\  | | | | \\ | |  _ \\| ____|  _ \\ ",
		"| | | | | | |  _| | |_) | | | | |  \\| | | | |  _| | |_) |",
		"| |_| | |_| | |___|  _ <  | |_| | |\\  | |_| | |___|  _ < ",
		" \\___/ \\___/|_____|_| \\_\\  \\___/|_| \\_|____/|_____|_| \\_\\",
		"  _____ _   _ _____ _   _                                  ",
		" | ____| | | | ____| \\ | |                                 ",
		" |  _| | | | |  _| |  \\| |                                 ",
		" | |___| |_| | |___| |\\  |                                 ",
		" |_____|\\___/|_____|_| \\_|                                 "
	};

	static final String[] COIN_HEADS_ART = new String[] {
		"   .---------.   ",
		"  /  HEADS   \\  ",
		" |    .-.    | ",
		" |   ( H )   | ",
		"  \\_________/  "
	};

	static final String[] COIN_TAILS_ART = new String[] {
		"   .---------.   ",
		"  /  TAILS   \\  ",
		" |    .-.    | ",
		" |   ( T )   | ",
		"  \\_________/  "
	};

	static final String[] COIN_FLIP_FRAMES = new String[] {
		"( )",
		"(/)",
		"(-)",
		"(\\)",
		"(|)"
	};

	static final String[] UP_ARROW_ART = new String[] {
		"    /\\    ",
		"   /  \\   ",
		"  / /\\ \\  ",
		"    ||    ",
		"    ||    "
	};

	static final String[] DOWN_ARROW_ART = new String[] {
		"    ||    ",
		"    ||    ",
		"  \\ \\/ /  ",
		"   \\  /   ",
		"    \\/    "
	};

	static final String[][] DICE_ART = new String[][] {
		{
			"+-------+",
			"|       |",
			"|   o   |",
			"|       |",
			"+-------+"
		},
		{
			"+-------+",
			"| o     |",
			"|       |",
			"|     o |",
			"+-------+"
		},
		{
			"+-------+",
			"| o     |",
			"|   o   |",
			"|     o |",
			"+-------+"
		},
		{
			"+-------+",
			"| o   o |",
			"|       |",
			"| o   o |",
			"+-------+"
		},
		{
			"+-------+",
			"| o   o |",
			"|   o   |",
			"| o   o |",
			"+-------+"
		},
		{
			"+-------+",
			"| o   o |",
			"| o   o |",
			"| o   o |",
			"+-------+"
		}
	};

	static final String [][] CARD_ART = new String[][] {
		
	};

	public static void sleepMs(int ms) {
		try {
			Thread.sleep(ms);
		} catch (InterruptedException e) {
			Thread.currentThread().interrupt();
		}
	}

	public static void printArt(String[] art) {
		for (String line : art) {
			System.out.println(line);
		}
	}

	public static void printArtSideBySide(String[] left, String[] right, int gap) {
		int leftWidth = 0;

		for (String line : left) {
			leftWidth = Math.max(leftWidth, line.length());
		}

		String spacer = " ".repeat(gap);
		int lines = Math.max(left.length, right.length);

		for (int i = 0; i < lines; i++) {
			String leftLine = i < left.length ? left[i] : "";
			String rightLine = i < right.length ? right[i] : "";
			System.out.printf("%-" + leftWidth + "s%s%s%n", leftLine, spacer, rightLine);
		}
	}

	public static void printDicePair(int dice1, int dice2) {
		String[] d1 = DICE_ART[dice1 - 1];
		String[] d2 = DICE_ART[dice2 - 1];

		for (int i = 0; i < d1.length; i++) {
			System.out.println(d1[i] + "  " + d2[i]);
		}
	}

	public static void animateDiceRoll(int finalDice1, int finalDice2) {
		for (int i = 0; i < 12; i++) {
			int temp1 = (int) (Math.random() * 6 + 1);
			int temp2 = (int) (Math.random() * 6 + 1);
			System.out.print("\rRolling dice " + temp1 + " + " + temp2 + "...");
			sleepMs(90);
		}

		System.out.print("\rRolling dice... done!      \n");
		printDicePair(finalDice1, finalDice2);
	}

	public static void animateCoinFlip(boolean heads) {
		for (int i = 0; i < 16; i++) {
			String frame = COIN_FLIP_FRAMES[i % COIN_FLIP_FRAMES.length];
			System.out.print("\rFlipping coin " + frame + "   ");
			sleepMs(75);
		}

		System.out.print("\rFlipping coin... done!   \n");

		if (heads) {
			printArt(COIN_HEADS_ART);
		} else {
			printArt(COIN_TAILS_ART);
		}
	}

	public static void printGameTitle(String[] titleArt) {
		System.out.println();
		printArt(titleArt);
		System.out.println();
	}
	
	public static int getBet(int high) {
		return getBet(0, high);
	}

	public static int getBet(int low, int high) {
		int num;

		while(true) {
			System.out.print("Enter bet amount (0 to exit): ");
			num = s.nextInt();

			if (num >= low && num <= high) {
				break;
			} else {
				System.out.println("Error! Invalid value!");
				System.out.printf("Enter a number between %d and %d!\n", low, high);
			}
		}

		return num;
	}

	public static String getYesNo() {
		String answer;

		while(true) {
			System.out.print("Rules? (y/n): ");
			answer = s.next().trim().toLowerCase();
			
			if (answer.equals("y") || answer.equals("n")) {
				break;
			} else {
				System.out.println("Invalid response!");
			}
		}

		return answer;
	}

	public static int gameCraps(String name, int money) {
		int bet;

		printGameTitle(CRAPS_TITLE);

		String rules = getYesNo();

		if (rules.equals("y")) {
			System.out.println("Roll two dice.");
			System.out.println("2, 3, or 12 loses immediately.");
			System.out.println("7 or 11 wins immediately.");
			System.out.println("Otherwise, roll your point again before a 7 or 11 to win.\n");
		}

		while(true) {
			System.out.printf("%s, you currently have $%s.\n", name, money);

			if (money == 0) {
				System.out.println("You have no money left!");
			}

			bet = getBet(money);

			if (bet == 0) {
				break;
			}

			int dice1 = (int) (Math.random() * 6 + 1);
			int dice2 = (int) (Math.random() * 6 + 1);
			int total1 = dice1 + dice2;

			s.nextLine();
			System.out.println("Press [Enter] to roll...");
			s.nextLine();

			animateDiceRoll(dice1, dice2);

			System.out.printf("%s, you rolled a %d and a %d.\n", name, dice1, dice2);
			
			if (total1 == 2 || total1 == 3 || total1 == 12) {
				System.out.println("You lost. Better luck next time!");
				money -= bet;
			} else if (total1 == 7 || total1 == 11) {
				System.out.println("You won. Congrats!");
				money += bet;
			}

			else {
				System.out.printf("%d is now your point.\n", total1);
				System.out.println("You need to keep rolling.");
				System.out.printf("If you roll %d again you win, but if you roll a 7 or 11 you lose.\n", total1);

				while(true) {
					dice1 = (int) (Math.random() * 6 + 1);
					dice2 = (int) (Math.random() * 6 + 1);
					int total2 = dice1 + dice2;

					System.out.print("Press [Enter] to roll...");
					s.nextLine();

					animateDiceRoll(dice1, dice2);

					System.out.printf("Your total roll is %d.\n", dice1 + dice2);

					if (total2 == total1) {
						System.out.println("That's your point! You've won your bet!");
						money += bet;
						break;
					} else if (total2 == 7 || total2 == 11) {
						System.out.println("You lost. Better luck next time!");
						money -= bet;
						break;
					}
				}
			}
		}

		return money;
	}

	public static int gameHighLow(String name, int money) {
		int num;
		int num2;
		int bet;

		printGameTitle(HIGH_LOW_TITLE);

		String rules = getYesNo();

		if (rules.equals("y")) {
			System.out.println("You see the first number, then guess if the next one is higher or lower.");
			System.out.println("Correct guess wins your bet; wrong guess loses it.\n");
		}

		while (true) {
			num = (int) (Math.random() * 10 + 1);
			num2 = (int) (Math.random() * 10 + 1);

			System.out.printf("%s, you currently have $%d.\n", name, money);

			if (money == 0) {
				System.out.println("You have no money left!");
				break;
			}

			bet = getBet(money);

			if (bet == 0) {
				break;
			}

			String choice;

			while (true) {
				s.nextLine();
				System.out.printf("The first number is %d.\n", num);
				printArtSideBySide(UP_ARROW_ART, DOWN_ARROW_ART, 6);
				System.out.println("      h = higher          l = lower");
				System.out.print("Is the next number going to be higher (h) or lower (l)?: ");
				choice = s.nextLine();

				if (choice.equals("h") || choice.equals("l")) {
					break;
				} else {
					System.out.println("Invalid response!");
				}
			}

			System.out.print("And the number is (press [Enter])...");
			s.nextLine();

			if (num2 > num) {
				printArt(UP_ARROW_ART);
				System.out.println("Higher");
			} else if (num2 < num) {
				printArt(DOWN_ARROW_ART);
				System.out.println("Lower");
			} else {
				System.out.println("Equal");
			}

			if (choice.equals("h") && num2 > num || choice.equals("l") && num2 < num) {
				System.out.println("Congratulations, you've guessed correctly!");
				money += bet;
			} else {
				System.out.println("You guessed incorrectly.");
				money -= bet;
			}
		}

		return money;
	}

	public static int gameOverUnderEven(String name, int money) {
		int bet;
		String choice;

		printGameTitle(OVER_UNDER_EVEN_TITLE);

		System.out.println("");

		String rules = getYesNo();

		if (rules.equals("y")) {
			System.out.println("Guess whether the total will be over, under, or exactly 7.");
			System.out.println("Correct over/under wins 1x; exact 7 wins 2x.\n");
		}

		while(true) {
			System.out.printf("%s, you currently have $%d.\n", name, money);

			if (money == 0) {
				System.out.println("You have no money left!");
				break;
			}

			bet = getBet(money);

			if (bet == 0) {
				break;
			}

			while(true) {
				s.nextLine();
				System.out.print("Is the next number going to be over (o), under (u), or even (e) to 7?: ");
				choice = s.nextLine();

				if (choice.equals("o") || choice.equals("u") || choice.equals("e")) {
					break;
				} else {
					System.out.println("Invalid response!");
				}
			}

			int dice1 = (int) (Math.random() * 6 + 1);
			int dice2 = (int) (Math.random() * 6 + 1);
			int total = dice1 + dice2;

			System.out.print("Press [Enter] to roll...");
			s.nextLine();

			animateDiceRoll(dice1, dice2);

			System.out.printf("%s, you rolled a %d and a %d.\n", name, dice1, dice2);
			System.out.printf("That's %d.\n", total);

			if (choice.equals("o") && total > 7 || choice.equals("u") && total < 7) {
				System.out.println("Congratulations, you've guessed correctly!");
				money += bet;
			} else if (choice.equals("e") && total == 7) {
				System.out.println("Congratulations, you've guessed correctly!");
				System.out.println("That's a double!");
				money += 2 * bet;
			} else {
				System.out.println("You guessed incorrectly.");
				money -= bet;
			}
		}

		return money;
	}

	public static int gameHeadsTails(String name, int money) {
		int bet;
		int coin;
		String choice;

		String headsTails;

		printGameTitle(HEADS_TAILS_TITLE);
		printArtSideBySide(COIN_HEADS_ART, COIN_TAILS_ART, 4);

		System.out.println("");

		String rules = getYesNo();

		if (rules.equals("y")) {
			System.out.println("Pick heads or tails and watch the flip animation.");
			System.out.println("Correct guess wins your bet; wrong guess loses it.\n");
		}

		while(true) {
			coin = (int) (Math.random() * 2 + 1);

			System.out.printf("%s, you currently have %d.\n", name, money);

			if (money == 0) {
				System.out.println("You have no money left!");
				break;
			}

			bet = getBet(money);

			if (bet == 0) {
				break;
			}

			while(true) {
				s.nextLine();

				System.out.print("Heads (h) or Tails (t)?: ");
				choice = s.nextLine();

				if (choice.equals("h") || choice.equals("t")) {
					break;
				} else {
					System.out.println("Invalid response!");
				}
			}

			System.out.print("Press [Enter] to flip...");
			s.nextLine();

			if (coin == 1) {
				animateCoinFlip(true);
				headsTails = "h";
			} else {
				animateCoinFlip(false);
				headsTails = "t";
			} 

			if (choice.equals(headsTails)) {
				System.out.println("You got it!");
				money += bet;
			} else {
				System.out.println("Wrong choice!");
				money -= bet;
			} 
		} 
		return  money;
	}

	public static int gameBlackjack(String name, int money) {
		int bet;
		int[] card_vals = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 10, 10, 10};
		String[] card_names = {"Ace", "Jack", "Queen", "King"};

		ArrayList<Integer> player_cards = new ArrayList<Integer>();
		ArrayList<Integer> dealer_cards = new ArrayList<Integer>();

		int player_point = 0;
		int dealer_point = 0;

		System.out.print("Do you want to see the rules? (y/n): ");
		String rules = s.nextLine();
		
		if (rules.equals("y")) {
			System.out.println("");
		}

		bet = getBet(money);

		if (bet == 0) {
			return money;
		}

		// ace = 1 going up till king = 13
		int first_dealer_card = (int) (Math.random() * 13 + 1);
		dealer_cards.add(first_dealer_card);

		int player_card = (int) (Math.random() * 13 + 1);
		player_cards.add(player_card);

		s.nextLine();
		System.out.print("Press [Enter] to draw a card...");
		s.nextLine();

		if (player_card == 1) {
			System.out.print("Your card is an Ace. Do you want it to be worth 1 or 11?: ");
			String num = s.nextLine();
			if (num.equals("1")) {
				player_point += 1;
			} else{
				player_point += 11;
			}

			System.out.printf("Your current total is %d.%n", player_point);
		} else{
			if (player_card == 11) {
				System.out.println("Your starting card is:" + card_names[1]);
			} else if (player_card == 12) {
				System.out.println("Your starting card is:" + card_names[2]);
			} else if (player_card == 13) {
				System.out.println("Your starting card is:" + card_names[3]);
			} else {
				System.out.printf("Your starting card is: %d%n", player_card);
			}

			player_point += card_vals[player_card - 1];
			System.out.printf("Your current total is %d.%n", player_point);
		}
		
		// print card face for specific card
		System.out.print("");

		System.out.println("The dealer will now draw a first card...");
		// maybe have delay here, have the card face down
		System.out.print("");

		// ----------------------------------------------------------

		s.nextLine();
		System.out.print("Press [Enter] to draw a second card...");
		s.nextLine();
		// ace = 1 going up till king = 13
		int dealer_card = (int) (Math.random() * 13 + 1);
		dealer_cards.add(dealer_card);
		dealer_point += card_vals[dealer_card - 1];

		player_card = (int) (Math.random() * 13 + 1);
		player_cards.add(player_card);

		if (player_card == 1) {
			System.out.print("Your card is an Ace. Do you want it to be worth 1 or 11?: ");
			String num = s.nextLine();
			if (num.equals("1")) {
				player_point += 1;
			} else{
				player_point += 11;
			}

			System.out.printf("Your current total is %d.%n", player_point);
		} else{
			if (player_card == 11) {
				System.out.println("Your starting card is:" + card_names[1]);
			} else if (player_card == 12) {
				System.out.println("Your starting card is:" + card_names[2]);
			} else if (player_card == 13) {
				System.out.println("Your starting card is:" + card_names[3]);
			} else {
				System.out.printf("Your starting card is: %d%n", player_card);
			}

			player_point += card_vals[player_card - 1];
			System.out.printf("Your current total is %d.%n", player_point);
		}

		System.out.println("The dealer will now draw a card...");
		// maybe have delay here, print actual card
		System.out.printf("The dealer's current total is: %d.%n", dealer_point);

		while (true) { 
			System.out.print("Do you want to draw another card? (y/n): ");
			String choice = s.nextLine();

			if (choice.equals("n")) {
				break;
			}

			System.out.print("Want to double down? (y/n): ");
			choice = s.nextLine();

			if (choice.equals("y")) {
				if (money > (2*bet)) {
					bet *= 2;
				} else {
					System.out.println("You don't have the funds to double down!\n");
				}
			}

			player_card = (int) (Math.random() * 13 + 1);
			player_cards.add(player_card);
			player_point += card_vals[player_card - 1];

			s.nextLine();
			System.out.print("Press [Enter] to draw a card");
			s.nextLine();

			if (player_card == 1) {
						System.out.print("Your card is an Ace. Do you want it to be worth 1 or 11?: ");
						String num = s.nextLine();
						if (num.equals("1")) {
							player_point += 1;
						} else{
							player_point += 11;
						}
			
						System.out.printf("Your current total is %d.%n", player_point);
			} else {
					if (player_card == 11) {
						System.out.println("Your starting card is:" + card_names[1]);
					} else if (player_card == 12) {
						System.out.println("Your starting card is:" + card_names[2]);
					} else if (player_card == 13) {
						System.out.println("Your starting card is:" + card_names[3]);
					} else {
						System.out.printf("Your starting card is: %d%n", player_card);
					}
		
					System.out.printf("Your current total is %d.%n", player_point);
			}

			if (player_point == 21 || player_point > 21) {
				break;
			}
		}

		System.out.print("The dealer's first card was... [Enter]");
		// reveal dealer's first card
		s.nextLine();

		dealer_point += card_vals[first_dealer_card - 1];
		System.out.printf("The dealer's total is %d.%n", dealer_point);

		while(true) {
			if (dealer_point <= 16) {
				System.out.println("The dealer will now draw another card...");
				// reveal dealer's card
				System.out.print("");

				dealer_card = (int) (Math.random() * 13 + 1);
				dealer_cards.add(dealer_card);
				dealer_point += card_vals[dealer_card - 1];

				System.out.printf("The dealer's total is %d.%n", dealer_point);
			} else {
				break;
			}
		}

		if (dealer_point == 21) {
			if (player_point == 21) {
				System.out.println("You and the dealer got the same total! You get your bet back.");
				return money;
			} else {
				System.out.println("Sorry, you lost.");
				money -= bet;
				return money;
			}
		} else if (dealer_point > 21) {
			if (player_point <= 21) {
				if (player_point == 21) {
					System.out.println("Congratulations, you won!");
					money += 1.5*bet;
					return money;
				} else {
					System.out.println("Congratulations, you won!");
					money += bet;
					return money;
				}

			}

		} else if (player_point > 21) {
			System.out.println("Sorry, you lost.");
			money -= bet;
			return money;
		} else if (player_point == dealer_point) {
				System.out.println("You and the dealer got the same total! You get your bet back.");
				return money;
		}  else if (player_point == 21) {
			System.out.println("Congratulations, you won!");
			money += 1.5*bet;
			return money;
		}

		if (player_point > dealer_point) {
			System.out.println("Congratulations, you won!");
			money += bet;
			return money;
		} else {
			System.out.println("Sorry, you lost.");
			money -= bet;
			return money;
		}
	}

	public static void printTitle() {
		printArt(CASINO_TITLE);
	}

	public static void main(String[] args) {
		String choice;
		int money = 500;

		printTitle();

		System.out.println("Welcome to the Calypso's Island Casino!");
		System.out.println("Here we say whatever happens on the island stays on the island.");
		System.out.println("Have fun and don't forget to bring your wallet!\n");

		System.out.print("Enter name: ");
		String name = s.nextLine();

		while(true) {
			if (money == 0) {
				break;
			}

			System.out.println("\n1. Craps");
			System.out.println("2. Heads or Tails");
			System.out.println("3. Higher or Lower");
			System.out.println("4. Over, Under, Even");
			System.out.println("5. Blackjack (work in progress)");
			System.out.println("6. Exit\n");

			while (true) {
				System.out.print("What game do you want to play?: ");
				choice = s.nextLine();

				if (choice.equals("1") || choice.equals("2") || choice.equals("3") || choice.equals("4") || choice.equals("5") || choice.equals("6")) {
					break;
				} else {
					System.out.println("Invalid response!");
				}
			}

			if (choice.equals("1")) {
				money = gameCraps(name, money);
			} else if (choice.equals("2")) {
				money = gameHeadsTails(name, money);
			} else if (choice.equals("3")) {
				money = gameHighLow(name, money);
			} else if (choice.equals("4")) {
				money = gameOverUnderEven(name, money);
			} else if (choice.equals("5")) {
				money = gameBlackjack(name, money);
			} else {
				break;
			}
		}

		System.out.println("Thanks for playing!");
		System.out.printf("%s, you are leaving with $%d.\n", name, money);
		System.out.println("We hope you enjoyed your experience at the Calypso's Island Casino!");
	}
}

















