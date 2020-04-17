// name: Emima Vaipan
// student number: 1743324

public class Cello extends StringInstrument {		 // sub class
	protected boolean playedSolo;
	protected String countryOfOrigin;
	
	/**
	 * @return the countryOfOrigin
	 */
	public String getCountryOfOrigin() {
		return countryOfOrigin;
	}

	/**
	 * @param countryOfOrigin the countryOfOrigin to set
	 */
	public void setCountryOfOrigin(String countryOfOrigin) {
		this.countryOfOrigin = countryOfOrigin;
	}

	public boolean isPlayedSolo() {
		return playedSolo;
	}

	public Cello(String name) {
		super(name);
	}

}
