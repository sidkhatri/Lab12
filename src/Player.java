/**
 * 
 */

/**
 * @author Siddique Khatri
 *
 */
public abstract class Player {
	private String name;
	private int roshambo;
	
	
	public abstract int generateRoshambo();
	
	//all of my getters and setters
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getRoshambo() {
		return roshambo;
	}
	public void setRoshambo(int roshambo) {
		this.roshambo = roshambo;
	} 
	
	@Override
	public String toString() {
		return 
	}
}
