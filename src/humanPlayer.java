

public class humanPlayer extends Player {
	
	
	public humanPlayer(String userName, int iChoice) {
		setName(userName);
		setRoshambo(iChoice);
	
	}

	@Override
	public int generateRoshambo() {
	
		return getRoshambo();
	}
	
}
