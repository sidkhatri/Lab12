import java.util.Scanner; 

/**
 * 
 * @author Siddique Khatri
 * Lab 12 -- Rock Paper Scissors game
 *
 */
public class RoshamboApp {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String userName = "";
		int playerChoice;
		int randomChoice;  
		
		//1.  prompt player for name
		System.out.println("Welcome to Rock, Paper, Scissors!");
		System.out.println();
		userName = Validator.getString(scan, "Please enter your name: ");
		//2.  Get user input
		userName = scan.nextLine();
		//4. Prompt user to select opponent
		System.out.println("Please select an opponent (Rock or Random):");
		//5. Get user opponent input
		String opponent = scan.nextLine();
		//6. Prompt player to select Rock, Paper Scissors
		String choice = Validator.getString(scan, userName +"Please select Rock Paper or Scissors");
		//System.out.println(userName + "{Please select Rock Paper or Scissors}");
		//7. Get user choice
		//TODO Replace with enums later!
		
		int iChoice = 0;
		switch (choice) {
		case "Rock":
			iChoice = 0;
			break;
		case "Paper":
			iChoice = 1;
			break;
		case "Scissors":
			iChoice = 2;
			break;
			
		default:
			break;
		}	
		//8.  Display user choice 
		System.out.println("Your choice was: " + choice);
		
		Player hPlayer = new humanPlayer(userName, iChoice);
	//	humanPlayer.setName(userName);
	//	humanPlayer.setRoshambo(iChoice);
	//	hPlayer.generateRoshambo();

		//9.  Display opponent choice
		Player opponentPlayer = null;
		if(opponent.equalsIgnoreCase("Rock")) {
			opponentPlayer = new RockPlayer();
			 playerChoice = opponentPlayer.generateRoshambo();
			 System.out.println("Your opponent chose:" + playerChoice);
		} else if (opponent.equalsIgnoreCase("Random")) {
			opponentPlayer = new RandomPlayer();
			 randomChoice = opponentPlayer.generateRoshambo();
			 System.out.println("Your opponent chose: " + randomChoice);
		}
		opponentPlayer.getRoshambo();
		//10.  Display match results
		System.out.println(getResults(hPlayer, opponentPlayer, userName));
		
		scan.close();
	}
	
	public static String getResults(Player humanPlayer, Player opponentPlayer, String humanName) {
		
		String result = "";
		if(humanPlayer.getRoshambo() == 0 && opponentPlayer.getRoshambo() == 1) {
			result = "Opponent wins!";
		} else if (humanPlayer.getRoshambo() == 0 && opponentPlayer.getRoshambo() == 2) {
			result = "Player wins!";
		} else if(humanPlayer.getRoshambo() == 2 && opponentPlayer.getRoshambo() == 0) {
			result = "Opponent wins!";
		} else if(humanPlayer.getRoshambo() == 1 && opponentPlayer.getRoshambo() == 0) {
			result = "Player wins!";
		} else if(humanPlayer.getRoshambo() == 2 && opponentPlayer.getRoshambo() == 1) {
			result = "Player wins!";
		} else if(humanPlayer.getRoshambo() == 1 && opponentPlayer.getRoshambo() == 2) {
			result = "Opponent wins!";
		} else {
			result = "Draw!";
		}
		
		return result;
	}
}
