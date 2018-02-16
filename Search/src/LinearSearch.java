import java.util.ArrayList;
import java.util.Scanner;

/**
 * Created by asamin on 16/02/2018.
 */
public class LinearSearch {

    /**
     * Linear search for unsorted lists
     *
     * @param arrayList is an unsorted list of unique integers
     * @param key is the integer we are searching for
     * @return the position of the key in the arrl (or -1 if not found)
     */
    public static int linearSearch(ArrayList<Integer> arrayList, int key){
        // Iterate through arrl and check each item to see if it matches the key
        for(int i = 0; i < arrayList.size(); i++){
            if(arrayList.get(i) == key){
                return i;
            }
        }

        // If key is not found we return -1
        return -1;
    }

    public static void main(String args[]){
        ArrayList<Integer> randomArray = new ArrayList<>();
        Scanner scan = new Scanner(System.in);

        System.out.println("Enter size of array");
        int arraySize = scan.nextInt();

        Other.randomArray(arraySize, randomArray);

        System.out.println("Here is the array: ");
        Other.showArray(randomArray);
        System.out.println("\nWhat do you want to search for?");
        int key = scan.nextInt();

        int result = linearSearch(randomArray, key);

        if(result == -1){
            System.out.println("Item not present");
        }
        else{
            System.out.println("Item was found at index " + result);
        }
    }
}
