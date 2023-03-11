public class Methods {
    public static void main(String[] args) {
        // This is called a main method.
        // We can use methods to simplify our code. These are similar to "functions" within MATLAB or C.

        multiply(5, 10);
        multiply(20, 2);

        determinant(1,4,2);
    }

    public static void multiply(int a, int b) {
        System.out.println(a * b);
    }

    public static void determinant(int a, int b, int c) {
        // Calculate the determinant
        int determinant = b^2 - (4*a*c);
        System.out.println(determinant);
        
        if (determinant < 0) {
            System.out.println("There are no real roots");
        } if (determinant == 0) {
            System.out.println("There are two real repeated roots");
        } if (determinant > 0) {
            System.out.println("There are two real unique roots");
        }
    }
}