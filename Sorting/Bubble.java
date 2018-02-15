/*
 * Created by Samin Alnajafi on 02/03/17 15:29
 * Copyright(c) 2017. All rights reserved
 *
 * Las modified on 29/01/17 16:39
 */

import java.util.ArrayList;
import java.util.Random;

public class Bubble
	{
		/**
		 * Bubble Sort
		 * @param arrl is an ArrayList containing a list of random integers
		 * @return sorted arrl from largest to smallest
		 */
		public static ArrayList<Integer> bubbleSort(ArrayList<Integer> arrl)
			{
				boolean noswaps = false;
				
				while (!noswaps)
					{
						noswaps = true;
						
						// Iterate through arrl
						for(int i = 0; i < arrl.size()-1; i++)
							{
								/**
								 * If current item is < or > the next one, swap them
								 *
								 * < gives descending order
								 * > gives ascending order
								 */
								if (arrl.get(i) > arrl.get(i+1))
									{
										Integer temp = arrl.get(i);
										arrl.set(i,arrl.get(i+1));
										arrl.set(i+1,temp);
										noswaps = false;
									}
							}
					}
				
				return(arrl);
			}
		
		public static void main(String args[]){
			ArrayList<Integer> randomArray = new ArrayList<>();
			Other.randomArray(5, randomArray);
			
			System.out.println("========== BEFORE SORTING ==========");
			Other.showArray(randomArray);
			System.out.println();
			
			System.out.println("========== SORTED ==========");
			bubbleSort(randomArray);
			Other.showArray(randomArray);
		}
	}