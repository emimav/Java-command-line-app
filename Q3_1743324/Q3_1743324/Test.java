// name: Emima Vaipan
// student number: 1743324

public class Test {

	public static void main(String[] args) {

		Instruments newarray[] = new Instruments[6]; // polymorphic array
		newarray[0] = new Triangle("Steve Hoffman");
		newarray[1] = new Drum("Roger Taylor");
		newarray[2] = new Violin("Antonio Stradivari", true);
		newarray[3] = new Trumpet("Louis Armostrong");
		newarray[4] = new Clarinet("Anton Stadler");
		newarray[5] = new Trumpet("Ray charles");
		
		for(int i = 0 ; i < 6 ; i++) {
			newarray[i].play();
			System.out.println(newarray[i]);
			System.out.println();
		}
		
		Percussion percussionInstruments[] = new Percussion[3];
		
		percussionInstruments[0] = new Drum("Buddy Rich");
		percussionInstruments[1] = new Triangle("O'neill");
		percussionInstruments[2] = new Drum("Ringo Star");
		percussionInstruments[0].setNumberOfSticks(3);
		
		System.out.println(percussionInstruments[0].getName() + " has " + percussionInstruments[0].getNumberOfSticks() + " sticks.");
		
		
		
		
	}
}
