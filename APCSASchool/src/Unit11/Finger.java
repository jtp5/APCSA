package Unit11;

public class Finger {
	String kind;

	public Finger() {
		kind = "normal finger";
	}

	public Finger(String k) {
		kind = k;
	}

	public String toString() {
		return "This finger is a " + kind;
	}
}
