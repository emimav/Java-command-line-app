// name: Emima Vaipan
// student number: 1743324

public class Violin extends StringInstrument {		 // sub class
	protected boolean skelatal;
	
	public Violin(String name, boolean skelatal) {
		super(name);
		this.skelatal = skelatal;
	}

	/**
	 * @return the skelatal
	 */
	public boolean isSkelatal() {
		return skelatal;
	}

	/**
	 * @param skelatal the skelatal to set
	 */
	public void setSkelatal(boolean skelatal) {
		this.skelatal = skelatal;
	}

}
