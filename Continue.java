public class Continue {
    public static void main(String[] args) {

        for (int i = 0; i <= 10; i++) {
            
            if (i == 5) {
                continue; // If the value of i is 5, then continue and jump back to the loop again
            }

            System.out.println("The current number is " + i);

        }
    }
}
