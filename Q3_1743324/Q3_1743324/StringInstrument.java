// name: Emima Vaipan
// student number: 1743324

/**
 * String Instrument
 * 
 * 
 * This class is named StringInstrument and not String to avoid confusion and
 * more importantly conflicts with the java.lang.String class.
 * 
 * The java.lang.String class being a part of the java.lang package does not need
 * to be imported. However another class named String in the  package 
 * would not need to be imported by other classes in the same package. So the result
 * would be that the question3.String class (if it existed ) would be used by default
 * instead of the more usual java.lang.String.
 * @author emvai
 *
 */
public class  StringInstrument extends Instruments {     // intermediate subclass
	
	public StringInstrument(String name) {
		super(name);
	}

	protected int numberOfStrings;
	protected boolean needsBow = false;
	protected int pitch;
	/**
	 * @return the needsBow
	 */
	public boolean getNeedsBow() {
		return needsBow;
	}

	/**
	 * @return the pitch
	 */
	public int getPitch() {
		return pitch;
	}

	/**
	 * @param pitch the pitch to set
	 */
	public void setPitch(int pitch) {
		this.pitch = pitch;
	}

	/**
	 * @param needsBow the needsBow to set
	 */
	public void setNeedsBow(boolean needsBow) {
		this.needsBow = needsBow;
	}

	/**
	 * @return the numberOfStrings
	 */
	public int getNumberOfStrings() {
		return numberOfStrings;
	}

	/**
	 * @param numberOfStrings the numberOfStrings to set
	 */
	public void setNumberOfStrings(int numberOfStrings) {
		this.numberOfStrings = numberOfStrings;
	}
	
}
