import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

/**
 * Created by Samin Alnajafi on 16/02/2018.
 */
public class BinarySearch {

    /**
     * Recursive binary search
     *
     * @param arrayList a sorted arrl of unique integers
     * @param first is the position of the first item in the arrl/subarrl
     * @param last is the position of the last item in the arrl/subarrl
     * @param key is the integer we are searching for
     * @return the position of the key in the arrl (or -1 if it is not found)
     */
    public static int binarySearchRecursive(ArrayList<Integer> arrayList, int first, int last, int key){
        if (last >= first)
        {
            // Calculate the position of the middle item
            int middle = first + (last - first)/2;

            // Is the key at the middle?
            if (arrayList.get(middle) == key){
                return middle;
            }

            // If key is smaller than item at the middle then the key must be in the left subarrl
            if (arrayList.get(middle) > key){
                return binarySearchRecursive(arrayList, first, middle-1, key);
            }

            // Otherwise the key is bigger than the item at the middle so the key must be in the right subarrl
            return binarySearchRecursive(arrayList, middle+1, last, key);
        }

        // If key is not found we return -1
        return -1;
    }

    /**
     * Iterative binary search
     *
     * @param arrayList is a sorted arrl of unique integers
     * @param first is the position of the first item in the arrl
     * @param last is the position of the last item in the arrl
     * @param key is the integer we are searching for
     * @return the position of the key in the arrl (or -1 if not found)
     */
    public static int binarySearchIterative(ArrayList<Integer> arrayList, int first, int last, int key){

        while(first <= last){
            // Calculate position of middle item
            int middle = first + (last - first)/2;

            // Is the key at the middle>
            if(arrayList.get(middle) == key){
                return middle;
            }

            // If key is smaller than item at the middle then the key must be in the left subarrl
            if(arrayList.get(middle) > key){
                last = middle -1;
            }
            // Otherwise the key is bigger than the item at the middle so the key must be in the right subarrl
            else{
                first = middle +1;
            }
        }

        // If key is not found we return -1
        return -1;
    }

    public static void main(String args[])
    {
        ArrayList<Integer> randomArray = new ArrayList<>();
        Scanner scan = new Scanner(System.in);

        System.out.println("Enter size of array");
        int arraySize = scan.nextInt();

        Other.randomArray(arraySize, randomArray);
        Collections.sort(randomArray); // Alternatively you could include one of the sorting algorithms

        System.out.println("Here is the array: ");
        Other.showArray(randomArray);
        System.out.println("\nWhat do you want to search for?");
        int key = scan.nextInt();

        int recursionResult = binarySearchRecursive(randomArray, 0, arraySize-1, key);
        System.out.println("========== Using binary search recursively ==========");
        if (recursionResult == -1){
            System.out.println("Item not present");
        }
        else{
            System.out.println("Item found at index " + recursionResult);
        }

        int iterativeResult = binarySearchIterative(randomArray, 0, arraySize-1, key);
        System.out.println("========== Using binary search iteratively ==========");
        if (iterativeResult == -1){
            System.out.println("Item not present");
        }
        else{
            System.out.println("Item found at index " + iterativeResult);
        }
    }
}