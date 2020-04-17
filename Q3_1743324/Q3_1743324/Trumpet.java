// name: Emima Vaipan
// student number: 1743324

public class Trumpet extends Brass {    // sub class
	protected int numberOfValves;

	/**
	 * @param numberOfValves the numberOfValves to set
	 */
	public void setNumberOfValves(int numberOfValves) {
		this.numberOfValves = numberOfValves;
	}

	public Trumpet(String name) {
		super(name);
	}
	
	public void play() {
		//super.play();
		System.out.println("Trumpet players are really cool");
	}
	
	public int getNumberOfValves() {
		return numberOfValves;
	}

}
