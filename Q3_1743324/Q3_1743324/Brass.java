// name: Emima Vaipan
// student number: 1743324

public class Brass extends Instruments {        // intermediate subclass
	protected String typeOfMaterial;

	/**
	 * @return the typeOfMaterial
	 */
	public String getTypeOfMaterial() {
		return typeOfMaterial;
	}

	/**
	 * @param typeOfMaterial the typeOfMaterial to set
	 */
	public void setTypeOfMaterial(String typeOfMaterial) {
		this.typeOfMaterial = typeOfMaterial;
	}

	public Brass(String name) {
		super(name);
	}

}
