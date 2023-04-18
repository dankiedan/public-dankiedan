public class StaticMethods {

    public void askQuestion() {
        System.out.println("What is your name?");
    }


    public static void main(String[] args) {
    System.out.println("Hello");
    // StaticMethods.askQuestion(); // You can directly call the method but the method must be static.

    StaticMethods sm = new StaticMethods(); // Or you can call the method by creating an object of the class StaticMethods, before calling the method.
    sm.askQuestion();
    }
}