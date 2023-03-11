public class ReturnStatements {
    public static void main(String[] args) {
        printAMessage();
        int x = sumOfTwoNumbers(23, 46);
        int y = sumOfTwoNumbers(2, 223);
        int z = sumOfTwoNumbers(12, 16);

        System.out.println("The sum of the two numbers is: " + x);
        System.out.println("The sum of the two numbers is: " + y);
        System.out.println("The sum of the two numbers is: " + z);

        // Let's learn how to shout
        System.out.println(shouting("I really need to shout!"));

    }

    public static void printAMessage() {
        System.out.println("Hello World?");
    }
    
    public static int sumOfTwoNumbers(int a, int b) {
        return a + b; // Returning an integer
    }

    public static String shouting(String s) {
        return s.toUpperCase(); // Return a string
    }
}