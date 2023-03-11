import java.util.Scanner;

public class Loops {
    public static void main(String[] args) {

        for (int i = 0; i < 11; i++) {
            System.out.println(i);
        }

        Scanner input = new Scanner(System.in);
        System.out.println("Please enter your name: ");
        String name = input.nextLine();
        input.close();

        if (name.equals("dankie")) {
            System.out.println("You're getting good at this...");
        }
        
        int a = 0;
        while (a < 20) { 
            System.out.println(a);
            a++; // Increment
        }
    }
}