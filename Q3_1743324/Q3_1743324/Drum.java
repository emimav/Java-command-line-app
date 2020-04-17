// name: Emima Vaipan
// student number: 1743324

public class Drum extends Percussion {		 // sub class
	protected int numberOfToms;

	
	/**
	 * @return the numberOfToms
	 */
	public int getNumberOfToms() {
		return numberOfToms;
	}


	/**
	 * @param numberOfToms the numberOfToms to set
	 */
	public void setNumberOfToms(int numberOfToms) {
		this.numberOfToms = numberOfToms;
	}


	public Drum(String name) {
		super(name);
	}

}
