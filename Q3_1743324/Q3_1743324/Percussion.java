// name: Emima Vaipan
// student number: 1743324

public class Percussion extends Instruments {	// intermediate subclass
	protected boolean portable;
	protected int numberOfSticks;
	
	public Percussion(String name) {
		super(name);
	}

	/**
	 * @return the portable
	 */
	public boolean isPortable() {
		return portable;
	}

	/**
	 * @param portable the portable to set
	 */
	public void setPortable(boolean portable) {
		this.portable = portable;
	}

	/**
	 * @return the numberOfSticks
	 */
	public int getNumberOfSticks() {
		return numberOfSticks;
	}

	/**
	 * @param numberOfSticks the numberOfSticks to set
	 */
	public void setNumberOfSticks(int numberOfSticks) {
		this.numberOfSticks = numberOfSticks;
	}

}
