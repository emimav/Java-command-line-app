// name : Emima Vaipan
// student id: 1743324


public class Player {
	// Private member variables
	private String name;
	private String playerId;
	private String score;
	private String teamName;
	private String teamId;
	private String homeStadiumName;
	private String homeStadiumStreet;
	private String homeStadiumTown;
	private String homeStadiumPostcode;
	// private String position;

	// Constructors
	public Player() {

	}

	// Public getter and setter for private variables
	public void setName(String name) {
		boolean space = false;
		name = name.trim();
		for (int i = 0; i < name.length(); i++) {
			char c = name.charAt(i);
			if (!Character.isAlphabetic(c)) {
				if (c == ' ') {
					space = true;
				} else {
					throw new IllegalArgumentException("the name must contain only letters and spaces");
				}
			}
		}

		if (!space) {
			throw new IllegalArgumentException("Name must contain both a first name and a last name");
		}
		this.name = name;
	}

	public void setPlayerId(String playerId) {
		// check length is 8
		// check that starts with RFU
		// check that ends with 5 digit number
		playerId = playerId.trim();

		if (playerId.length() != 8) {
			throw new IllegalArgumentException("Id should contain 8 characters");
		}

		if (!playerId.startsWith("RFU")) {
			throw new IllegalArgumentException("Id must start with RFU");
		}

		try {
			int i = Integer.parseInt(playerId.substring(3));
		} catch (NumberFormatException ex) {
			throw new IllegalArgumentException("Id should end with 5 digits");
		}
		this.playerId = playerId;
	}

	public String getName() {
		return name;
	}

	public String getPlayerId() {
		return playerId;
	}

	/**
	 * @return the score
	 */
	public String getScore() {
		return score;
	}

	/**
	 * @param score the score to set
	 */
	public void setScore(String score) {
		score = score.trim();
		if (score.isEmpty()) {
			throw new IllegalArgumentException("The score should be at least 1 digit long");
		}
		for (int i = 0; i < score.length(); i++)
			if (! Character.isDigit(score.charAt(i))) {
				throw new IllegalArgumentException("The score needs to be a digit");
		}

		this.score = score;
	}

	/**
	 * @return the teamName
	 */
	public String getTeamName() {
		return teamName;
	}

	/**
	 * @param teamName the teamName to set
	 */
	public void setTeamName(String teamName) {

		teamName = teamName.trim();
		if (teamName.length() < 1) {
			throw new IllegalArgumentException("The team name must contain at least 1 character");
		}

		for (int i = 0; i < teamName.length(); i++) {
			char c = teamName.charAt(i);
			if (!Character.isAlphabetic(c)) {
				if (c == ' ') {

				} else {
					throw new IllegalArgumentException("The team name must contain only letters and spaces");
				}
			}
		}
		this.teamName = teamName;
	}

	/**
	 * @return the teamId
	 */
	public String getTeamId() {
		return teamId;
	}

	/**
	 * @param teamId the teamId to set
	 */
	public void setTeamId(String teamId) {

		teamId = teamId.trim();

		if (teamId.length() != 7) {
			throw new IllegalArgumentException("The team id " + teamId +" should contain 3 uppercase letters and 4 digits");
		}
		for (int i = 0; i < 3; i++) {
			if (!(Character.isAlphabetic(teamId.charAt(i)) && Character.isUpperCase(teamId.charAt(i)))) {
				throw new IllegalArgumentException("Team Id must start with a string");
			}
		}

		try {
			int i = Integer.parseInt(teamId.substring(3));
		} catch (NumberFormatException ex) {
			throw new IllegalArgumentException("Team Id should end with 4 digits");
		}

		this.teamId = teamId;
	}

	/**
	 * @return the homeStadiumName
	 */
	public String getHomeStadiumName() {
		return homeStadiumName;
	}

	/**
	 * @param homeStadiumName the homeStadiumName to set
	 */
	public void setHomeStadiumName(String homeStadiumName) {
		homeStadiumName = homeStadiumName.trim();
		validateName(homeStadiumName);
		
		this.homeStadiumName = homeStadiumName;
	}

	/**
	 * @return the homeStadiumStreet
	 */
	public String getHomeStadiumStreet() {
		return homeStadiumStreet;
	}

	/**
	 * @param homeStadiumStreet the homeStadiumStreet to set
	 */
	public void setHomeStadiumStreet(String homeStadiumStreet) {

		homeStadiumStreet = homeStadiumStreet.trim();
		if (homeStadiumStreet.length() < 1) {
			throw new IllegalArgumentException("The home stadium street must contain at least 1 character");
		}

		for (int i = 0; i < homeStadiumStreet.length(); i++) {
			char c = homeStadiumStreet.charAt(i);
			if ((!Character.isAlphabetic(c)) & !Character.isDigit(c)) {
				if (c == ' ') {

				} else {
					throw new IllegalArgumentException(
							"The home stadium Street can contain only letters, digits and spaces");
				}
			}

		}
		this.homeStadiumStreet = homeStadiumStreet;
	}

	/**
	 * @return the homeStadiumTown
	 */
	public String getHomeStadiumTown() {
		return homeStadiumTown;
	}

	/**
	 * @param homeStadiumTown the homeStadiumTown to set
	 */
	public void setHomeStadiumTown(String homeStadiumTown) {
		boolean space = false;
		homeStadiumTown = homeStadiumTown.trim();

		validateName(homeStadiumTown);
		this.homeStadiumTown = homeStadiumTown;
	}

	private void validateName(String s) {
		if (s.length() < 1) {
			throw new IllegalArgumentException("The name must contain at least 1 character");
		}
		for (int i = 0; i < s.length(); i++) {
			char c = s.charAt(i);
			if (!Character.isAlphabetic(c)) {
				if (c == ' ') {
				} else {
					throw new IllegalArgumentException("The  name " + s +"must contain only letters and spaces");
				}
			}
		}
	}

	/**
	 * @return the homeStadiumPostcode
	 */
	public String getHomeStadiumPostcode() {
		return homeStadiumPostcode;
	}

	/**
	 * @param homeStadiumPostcode the homeStadiumPostcode to set
	 */
	public void setHomeStadiumPostcode(String homeStadiumPostcode) {
		// check length is 5
		// check first letter is upper case
		// check second char is a digit
		// check that ends with 3 upper case letters
		homeStadiumPostcode = homeStadiumPostcode.trim();

		if (homeStadiumPostcode.length() != 5) {
			throw new IllegalArgumentException("The postcode of the stadium should contain 5 characters");
		}

		if (! Character.isUpperCase(homeStadiumPostcode.charAt(0))) {
			throw new IllegalArgumentException("The postcode of the stadium must start with an uppercase letter");
		}
		
		if (! Character.isDigit(homeStadiumPostcode.charAt(1))) {
			throw new IllegalArgumentException("The postcode of the stadium must have second char a digit");
		}
		
		for(int i = 2; i < 5 ; i++) {
			if (! Character.isUpperCase(homeStadiumPostcode.charAt(i))) {
				throw new IllegalArgumentException("The postcode of the stadium must end with 3 upper case characters");
			}
		}

		this.homeStadiumPostcode = homeStadiumPostcode;
	}

	// Override toString() method
	public String toString() {
		return String.format("%s %20s %5s %20s %8s %-20s %-20s %-10s %5s", playerId, name, score, teamName, teamId,homeStadiumName, 
				homeStadiumStreet, homeStadiumTown, homeStadiumPostcode );
	}

	
}
