public class PersonMain {

	public static void main(String[] args) {

		// -- just one variable to represent Bob
		Person bob = new Person("Bob", "Jones", 18);

		// -- just one variable to represent Jenny
		Person jenny = new Person("Jenny", "Jones", 20);

		bob.introduceSelf();

		jenny.introduceSelf();

	}

}