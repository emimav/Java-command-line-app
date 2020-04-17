// name: Emima Vaipan
// student number: 1743324

public class Flute extends Woodwind {		 // sub class
	protected int numberOfHoles;
	
	/**
	 * @return the numberOfHoles
	 */
	public int getNumberOfHoles() {
		return numberOfHoles;
	}

	/**
	 * @param numberOfHoles the numberOfHoles to set
	 */
	public void setNumberOfHoles(int numberOfHoles) {
		this.numberOfHoles = numberOfHoles;
	}

	public Flute(String name) {
		super(name);
	}

}
