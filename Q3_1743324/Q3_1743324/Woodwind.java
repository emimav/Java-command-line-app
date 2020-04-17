// name: Emima Vaipan
// student number: 1743324

public class Woodwind extends Instruments {  	// intermediate subclass
	protected String styleOfMusic;

	
	/**
	 * @return the styleOfMusic
	 */
	public String getStyleOfMusic() {
		return styleOfMusic;
	}

	/**
	 * @param styleOfMusic the styleOfMusic to set
	 */
	public void setStyleOfMusic(String styleOfMusic) {
		this.styleOfMusic = styleOfMusic;
	}

	public void play() {
		super.play();
		System.out.println("that's really really loud isn't?");
	}

	public Woodwind(String name) {
		super(name);
	}

}
