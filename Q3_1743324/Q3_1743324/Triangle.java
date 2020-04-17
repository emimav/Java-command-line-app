// name: Emima Vaipan
// student number: 1743324

public class Triangle extends Percussion {		 // sub class
	protected String typeOfTriangleShape;

	/**
	 * @return the typeOfTriangleShape
	 */
	public String getTypeOfTriangleShape() {
		return typeOfTriangleShape;
	}

	/**
	 * @param typeOfTriangleShape the typeOfTriangleShape to set
	 */
	public void setTypeOfTriangleShape(String typeOfTriangleShape) {
		this.typeOfTriangleShape = typeOfTriangleShape;
	}

	public Triangle(String name) {
		super(name);
	}


}
