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
        System.out.println(shouting("\n I really need to shout!\n"));

        // Let's generate an array from 3 integers
        int generatedArray[] = arrayGenerator(2, 4, 6);
        System.out.println(generatedArray[0]);
        System.out.println(generatedArray[1]);
        System.out.println(generatedArray[2]);
    }

    public static void printAMessage() {
        System.out.println("\nHello World?\n");
    }
    
    public static int sumOfTwoNumbers(int a, int b) {
        return a + b; // Returning an integer
    }

    public static String shouting(String s) {
        return s.toUpperCase(); // Return a string
    }

    public static int[] arrayGenerator(int A, int B, int C) {
        int array[] = new int[3];

        array[0] = A;
        array[1] = B;
        array[2] = C;

        return array;
    }
}