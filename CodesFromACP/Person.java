
public class Person {

	private String firstName;
	private String lastName;
	private int age;

	public Person(String fn, String ln, int a) {
		firstName = fn;
		lastName = ln;
		age = a;
	}

	public void introduceSelf() {
		System.out.println("Hello, my name is " + firstName + lastName + " and I am " + age + " years old.");
	}

}
