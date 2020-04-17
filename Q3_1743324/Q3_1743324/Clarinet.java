// name: Emima Vaipan
// student number: 1743324

public class Clarinet extends Woodwind {		 // sub class
	protected boolean isCylindrical = true; 
	
	/**
	 * @return the isCylindrical
	 */
	public boolean isCylindrical() {
		return isCylindrical;
	}

	/**
	 * @param isCylindrical the isCylindrical to set
	 */
	public void setCylindrical(boolean isCylindrical) {
		this.isCylindrical = isCylindrical;
	}

	public Clarinet(String name) {
		super(name);
	}

}
