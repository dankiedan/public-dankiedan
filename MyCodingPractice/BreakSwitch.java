public class BreakSwitch {
    public static void main(String[] args) {

        boolean x = true;
        while (x) {
            System.out.println("This is going to last a while...");
            break; // This break command will exit the loop 
        }
        System.out.println("Now we are out of the loop... That's a relief!");

        mySwitch(args); // Tap into the method mySwitch 
    }

    public static void mySwitch(String[] args) {
        // This is an example of how to use a switch statement in Java

        int day = 4;

        switch (day) {
            case 1:
                System.out.println("Monday");
                break;
            case 2:
                System.out.println("Tuesday");
                break;
            case 3:
                System.out.println("Wednesday");
                break;
            case 4:
                System.out.println("Thursday");
                break;
            case 5:
                System.out.println("Friday");
                break;
            case 6:
                System.out.println("Saturday");
                break;
            case 7:
                System.out.println("Sunday");
                break;
            default: // If the cases are not met, then run default.
                System.out.println("Invalid day");
        }
    }
}