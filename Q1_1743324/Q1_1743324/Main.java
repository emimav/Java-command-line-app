// name : Emima Vaipan
// student id: 1743324

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintStream;
import java.util.ArrayList;
import java.util.Scanner; // Java program to read data of various types using Scanner class. 



public class Main {
	private ArrayList<Player> fileContent;
	//list 
	private Scanner sc;
	

	public Main() {
		fileContent = new ArrayList<>();
		sc = new Scanner(System.in);
		//Declare object and initialise with predefined standard input object
	}

	public void displayPlayers() {
		int i = 1;
		for (Player player : fileContent) {
			System.out.printf("%2d  ", i++);
			System.out.println(player);
		}
	}

	public void load() {
		fileContent.clear();
		try (Scanner in = new Scanner(new File("rugby.csv"))) {
			//checks if the file exists, and while it exists it executes the code below
			while (in.hasNextLine()) {
				String line = in.nextLine();

				// System.out.println(line);
				String[] s = line.trim().split(",");
				Player player = new Player();
				fileContent.add(player);

				player.setPlayerId(s[0]);
				player.setName(s[1]);

				player.setScore(s[2]);
				player.setTeamName(s[3]);

				player.setTeamId(s[4]);
				player.setHomeStadiumName(s[5]);

				player.setHomeStadiumStreet(s[6]);
				player.setHomeStadiumTown(s[7]);

				player.setHomeStadiumPostcode(s[8]);

			}
		} catch (FileNotFoundException e) {
			System.out.println("rugby.csv not found starting with an empty list"); // if the file is doesn't exist, once
																					// it gives the error it's created
		}
	}

	public void delete() {
		System.out.println("Please enter player position to delete it");
		String target = sc.nextLine().trim();
		// user's input taken and trimmed of extra spaces
		int Target = Integer.parseInt(target);
		fileContent.remove(--Target);
		try {
			save();
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}

		// First I chose to delete by name or player Id, updated later but I left the code below for future improvements
		/*
		 * Player d = null; for (Player player : list) { if
		 * (player.getName().equalsIgnoreCase(target) ||
		 * player.getPlayerId().equalsIgnoreCase(target)) { d = player; break; } }
		 * 
		 * if (d != null) { list.remove(d); }
		 */

	}

	
	public void save() throws FileNotFoundException {
		// save() loops through file content containing the players updated last and and save it to file
		PrintStream out = new PrintStream("rugby.csv");
		for (Player player : fileContent) {
			out.print(player.getPlayerId());
			out.print(",");

			out.print(player.getName());
			out.print(",");

			out.print(player.getScore());
			out.print(",");

			out.print(player.getTeamName());
			out.print(",");

			out.print(player.getTeamId());
			out.print(",");

			out.print(player.getHomeStadiumName());
			out.print(",");

			out.print(player.getHomeStadiumStreet());
			out.print(",");

			out.print(player.getHomeStadiumTown());
			out.print(",");

			out.print(player.getHomeStadiumPostcode());
			out.print(",");

			out.println();
		}


		out.close();
	}

	public void gatherData() {

		Player player = new Player();

		while (true) {
			try {
				System.out.println(
						"Please enter the player name ( both first name and last name) or hit return on a blank line to end");
				String s = sc.nextLine().trim();
				player.setName(s);
				break;
			} catch (IllegalArgumentException ex) {
				System.out.println(ex);
			}
		}
		while (true) {
			try {

				System.out.println("Please enter the player Id (format RFUyyyyy, y is a digit)");
				player.setPlayerId(sc.nextLine().trim());
				break;
			} catch (IllegalArgumentException ex) {
				System.out.println(ex);
			}
		}
		while (true) {
			try {
				System.out.println("Please enter the career tries score for your player (digit format)");
				player.setScore(sc.nextLine().trim());
				break;
			} catch (IllegalArgumentException ex) {
				System.out.println(ex);
			}
		}
		while (true) {
			try {

				System.out.println("Please enter the player team name");
				player.setTeamName(sc.nextLine().trim());
				break;
			} catch (IllegalArgumentException ex) {
				System.out.println(ex);
			}
		}

		while (true) {
			try {

				System.out.println("Please enter the team Id (format XXXyyyy, X is an uppercase letter, y is a digit )");
				player.setTeamId(sc.nextLine().trim());
				break;
			} catch (IllegalArgumentException ex) {
				System.out.println(ex);
			}
		}

		while (true) {
			try {
				System.out.println("Please enter the player home stadium name");
				player.setHomeStadiumName(sc.nextLine().trim());
				break;
			} catch (IllegalArgumentException ex) {
				System.out.println(ex);
			}
		}

		while (true) {
			try {

				System.out.println("Please enter the player home stadium street");
				player.setHomeStadiumStreet(sc.nextLine().trim());
				break;
			} catch (IllegalArgumentException ex) {
				System.out.println(ex);
			}
		}
		while (true) {
			try {

				System.out.println("Please enter the player home stadium town");
				player.setHomeStadiumTown(sc.nextLine().trim());
				break;
			} catch (IllegalArgumentException ex) {
				System.out.println(ex);
			}
		}
		while (true) {
			try {

				System.out.println("Please enter the player home stadium postcode (format XyXXX, X is uppercase letter, y is a digit)");
				player.setHomeStadiumPostcode(sc.nextLine().trim());
				break;
			} catch (IllegalArgumentException ex) {
				System.out.println(ex);
			}
		}
		fileContent.add(player);
		try {
			save();
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	private void menu() {
		while (true) {
			System.out.println("");
			System.out.println("Rugby Players");
			System.out.println("");
			System.out.println("Menu Options:");
			System.out.println("1. Add an new player entry");
			System.out.println("2. Display all entries");
			System.out.println("3. Delete a player entry by entering player position");
			System.out.println("4. Display rugby players by their position in the list ( eg. from lower index = 2 till upper index 5)");
			System.out.println("5. Display rugby player details given the team name (case sensitive)");
			System.out.println("6. Display a full stadium address given either its name, street, town or postcode (case insensitive)");
			System.out.println("7. Exit the program");
			System.out.println("");
			System.out.println("Please select an option from 1-7\r\n");

			try {
				int input = Integer.parseInt(sc.nextLine().trim());

				switch (input) {
				case 1:
					gatherData();
					break;
				case 2:
					displayPlayers();
					break;
				case 3:
					delete();
					break;

				case 4:
					dispaySubset();
					break;

				case 6:
					searchStadium();
					break;

				case 5:
					displayTeam();
					break;
				case 7:
					System.out.println("You have quit the program\r\n");
					return;
				default:
					System.out.println("You have entered an invalid selection, please try again\r\n");

				}

			} catch (NumberFormatException ioe) {
				System.out.println("Not a valid choice. Please type a number between 1 and 7");

			}
		}
	}

	private void searchStadium() {
		System.out.println("You can search either by name, street, town or postcode (case insensitive) ");
		String target = sc.nextLine().trim();
		Player d = null; //used at first for the delete() method when deleting by player name or nameid
		int i = 1;
		for (Player player : fileContent) {
			if (player.getHomeStadiumName().equalsIgnoreCase(target)
					|| player.getHomeStadiumStreet().equalsIgnoreCase(target)
					|| player.getHomeStadiumTown().equalsIgnoreCase(target)
					|| player.getHomeStadiumPostcode().equalsIgnoreCase(target)) {
				System.out.printf("%2d  ", i++);

				System.out.println(player.getHomeStadiumName() + ", " + player.getHomeStadiumStreet() + ", "
						+ player.getHomeStadiumTown() + ", " + player.getHomeStadiumPostcode());
			}
		}
	}

	private void displayTeam() {
		System.out.println("Please enter team name (case sensitive)");
		String target = sc.nextLine().trim();
		Player d = null; //used at first for the delete() method when deleting by player name or nameid
		int i = 1;
		boolean found = false;
		for (Player player : fileContent) {
			if (player.getTeamName().contains(target)) {
				System.out.printf("%2d  ", i++);
				System.out.println(player);
				found = true;
			}
		}
		if (!found)
			System.out.println("No results found.");
	}

	private void dispaySubset() {
		System.out.println("Please enter the lower index ");
		int lower = Integer.parseInt(sc.nextLine().trim());
		if(lower > 0) {
			System.out.println("Please enter the upper index ");
			int upper = Integer.parseInt(sc.nextLine().trim());
			if(upper <= fileContent.size()) {
				for (int i = lower - 1; i <= (upper - 1) && i < fileContent.size();) {
					Player player = fileContent.get(i++);
					System.out.printf("%2d  ", i);
					System.out.println(player);
				}
			}else {
				System.out.println("Please enter the correct position");
			}
		}else {
			System.out.println("Please enter the correct position");
		}
	}


	public static void main(String[] args) throws FileNotFoundException {
		Main m = new Main();
		m.load();
		m.menu();
		m.save();   
	}

}
