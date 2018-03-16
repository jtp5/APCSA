package Unit11;

public class Hand {
	Finger[] fingers;

	public Hand(int numFingers) {
		fingers = new Finger[numFingers];
		for (int i = 0; i < fingers.length; i++) {
			fingers[i] = new Finger();
		}
	}

	public String toString() {
		return "This hand has " + fingers.length + " fingers.";
	}
}
