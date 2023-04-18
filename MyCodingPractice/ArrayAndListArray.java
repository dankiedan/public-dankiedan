import java.util.ArrayList; // This is needed for array list

public class ArrayAndListArray {
    public static void main(String[] args) {

        int[] array = new int[5]; // Initialise empty 1 x 5 array
        int[] arrayTwo = {1, 2, 3, 4, 5}; // Setting variables within array

        String[] stringArray = {"Hello", "World"};

        System.out.println(array[1]);
        System.out.println(arrayTwo[2]);
        System.out.println(stringArray[1]);


        System.out.println("-----------------------------------"); // Print divider

        ArrayList<Integer> listOfNumbers = new ArrayList<Integer>();
        listOfNumbers.add(256);
        listOfNumbers.add(512);
        // listOfNumbers.remove(0);
        System.out.println(listOfNumbers);

    }
}