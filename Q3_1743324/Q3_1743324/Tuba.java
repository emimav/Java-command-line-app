// name: Emima Vaipan
// student number: 1743324

public class Tuba extends Brass {		 // sub class

	protected String typeOfPitch;

	/**
	 * @return the typeOfPitch
	 */
	public String getTypeOfPitch() {
		return typeOfPitch;
	}

	/**
	 * @param typeOfPitch the typeOfPitch to set
	 */
	public void setTypeOfPitch(String typeOfPitch) {
		this.typeOfPitch = typeOfPitch;
	}

	public Tuba(String name) {
		super(name);
		
	}

}
