package Unit11;

public class Person {
	String name;
	Hand leftHand;
	Hand rightHand;

	public Person() {
		name = "Joe";
		leftHand = new Hand(5);
		rightHand = new Hand(5);
	}

	public Person(String n, int numLeftFingers, int numRightFingers) {
		name = n;
		leftHand = new Hand(numLeftFingers);
		rightHand = new Hand(numRightFingers);
	}

	public Hand getLeftHand() {
		return leftHand;
	}

	public Hand getRightHand() {
		return rightHand;
	}

	public String toString() {
		return name + " - ";
	}
}
