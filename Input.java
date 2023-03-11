import java.util.Scanner;

public class Input {
    public static void main(String[] args) {

        Scanner beep = new Scanner(System.in); // Scanner object named "beep" will take user input 

        System.out.println("Enter your name: ");
        String name = beep.nextLine(); // String named "name" will store user input

        System.out.println("You have entered your name: " + name);
        beep.close(); // Closes scanner to avoid memory leaks
    }
}