import java.util.ArrayList;
import java.util.Random;

/**
 * Created by Samin on 14/02/2018.
 */

// General purpose functions

public class Other
   {
      /**
       * Fill an arrl with random integers
       * @param n is the size of the arrl
       *
       * @return an arrl of size n filled with random integers
       */
      public static ArrayList<Integer> randomArray(int n, ArrayList<Integer> arrl)
         {
            Random rand = new Random();
            
            int number;
            for(int i = 0; i<n; i++)
               {
                  number = rand.nextInt(255 - 0);
                  arrl.add(number);
               }
            
            return arrl;
         }
      
      public static void showArray(ArrayList<Integer> arrl)
         {
            for(int i = 0; i < arrl.size(); i++)
               {
                  System.out.print(arrl.get(i) + " ");
               }
         }
   }
