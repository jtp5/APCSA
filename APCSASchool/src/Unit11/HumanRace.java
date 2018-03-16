package Unit11;

public class HumanRace {
	Person[] people;

	public HumanRace(int numPeople) {
		people = new Person[numPeople];
	}

	public void setPeople(int pos, Person p) {
		people[pos] = p;
	}

	public Person[] getPeople() {
		return people;
	}

public static void main(String[] args) {
	HumanRace test = new HumanRace(3);
	test.setPeople(0, new Person("Jeff", 5, 5));
	test.setPeople(0, new Person("Emily", 5, 5));
	test.setPeople(0, new Person("Bob", 4, 5));
	System.out.println(test.getPeople()[0]);
	System.out.println(test.getPeople()[0].getLeftHand());
}
}
