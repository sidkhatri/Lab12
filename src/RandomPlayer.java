import java.util.Random;
/**
 * 
 */

/**
 * @author Siddique Khatri
 *
 */
public class RandomPlayer extends Player {

	/* (non-Javadoc)
	 * @see Player#generateRoshambo()
	 */
	
	
	@Override
	public int generateRoshambo() {
		int choice = 0;
		Random num = new Random();
		choice = num.nextInt(3); //This will give you option between 0,1,2 (0- Rock, 1- Paper, 2-Scissors
		
		if(choice == 0) {
			System.out.println("Rock");
		} else if (choice == 1) {
			System.out.println("Paper");
		} else if (choice == 2) {
			System.out.println("Scissors");
		}
		
		
		return generateRoshambo();
	}

}
