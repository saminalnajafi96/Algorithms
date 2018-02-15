/*
 * Created by Samin Alnajafi on 02/03/17 15:29
 * Copyright(c) 2017. All rights reserved
 *
 * Las modified on 29/01/17 16:53
 */

import java.util.ArrayList;

public class Quick
	{
		/**
		 * This function takes in an arrl and calls the quickSort() function
		 *
		 * @param arrl is an ArrayList that contains a random list of integers
		 * @return a sorted list
		 */
		public static ArrayList<Integer> sort(ArrayList<Integer> arrl)
			{
				quickSort(arrl,0,arrl.size()-1);
				
				return(arrl);
			}
		
		/**
		 *
		 * @param arrl is an arrl of integers
		 * @param first is the position of first item of the arrl
		 * @param last is the position last item of the arrl
		 */
		public static void quickSort(ArrayList<Integer> arrl, int first, int last)
			{
				if (first < last)
					{
						// Partition the arrl
						int pivot = pivotList(arrl,first,last);
						
						// Recursively calling quickSort function to partition the sub arrls, sorting them and so on...
						quickSort(arrl,first,pivot-1);
						quickSort(arrl,pivot+1,last);
					}
			}
		
		/**
		 * Swap 2 numbers in arrl
		 *
		 * @param arrl is an arrl of integers
		 * @param a is the position of one of the numbers to swap
		 * @param b is the position of the other number to swap
		 */
		private static void swap(ArrayList<Integer> arrl, int a, int b)
			{
				Integer temp = arrl.get(a);
				arrl.set(a,arrl.get(b));
				arrl.set(b,temp);
			}
		
		/**
		 * Get the pivot and partition the arrl
		 *
		 * @param arrl is an arrl of integers
		 * @param first is the position of first item in the arrl
		 * @param last is the position last item in the arrl
		 *
		 * @return the position of the pivot in the arrl
		 */
		private static int pivotList(ArrayList<Integer> arrl, int first, int last)
			{
				// Set the value and position of the pivot to the first item (leftmost)
				Integer pivotValue = arrl.get(first);
				int pivotPoint = first;
				
				/**
				 * Iterate from 1+leftmost item to the last and move all items < pivotValue to the left, leaving the ones
				 * > to the right
				 */
				for(int i=first+1; i <= last; i++)
					{
						/**
						 * If the value of the item and position i is < or > pivot then move it to the left
						 *
						 * < gives ascending
						 * > gives descending
						 */
						if (arrl.get(i) < pivotValue)
							{
								pivotPoint = pivotPoint+1;
								swap(arrl,pivotPoint,i);
							}
					}
				
				swap(arrl,first,pivotPoint);
				
				return(pivotPoint);
			}
		
		public static void main(String args[]){
			ArrayList<Integer> randomArray = new ArrayList<>();
			
			Other.randomArray(5, randomArray);
			
			System.out.println("========== BEFORE SORTING ==========");
			Other.showArray(randomArray);
			System.out.println();
			
			System.out.println("========== SORTED ==========");
			sort(randomArray);
			Other.showArray(randomArray);
		}
	}