// name: Emima Vaipan
// student number: 1743324

public class Instruments {           //  parent class
	
	protected String name;
	
	public Instruments(String name) {
		this.name = name;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	public void play() {
		System.out.println("Playing the " + name);
	}
	
	@Override
	public String toString() {
		return "Instrument of the type " + getClass().getName() + " named " + name;
	}
}
