package com.java.sorting.programs;

public class BinarySearch {

	public static void main(String[] args) 
	{

		int[] arr = {1,3,5,7,9,11,13,15,17,19};
		int low = arr[0];
		int high = arr.length;
		int element = 33;
		
		System.out.println("Start");
		
		int result = binarySearch(arr, element, low, high);
		if(result == 1)
			System.out.println("eleemnt found");
		else 
			System.out.println("Element not found");

	}
	
	
	
	  static int binarySearch(int array[], int x, int low, int high) {

		    while (low <= high) {
		      int mid = low + (high - low) / 2;

		      if (array[mid] == x)
		        return mid;

		      if (array[mid] < x)
		        low = mid + 1;

		      else
		        high = mid - 1;
		    }

		    return -1;
		  }
	

}
