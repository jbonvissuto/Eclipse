//COSC 237-101
//Name: Jackson K. Bonvissuto
//ID: 0716190
import java.util.*;

public class Problem51
{
    static Scanner console = new Scanner(System.in);

    final static int SIZE = 2500;

    public static void main(String[] args)
    {
    	int binComps, seqComps, location;
    	Random rand = new Random();
    	Integer[] intList = new Integer[SIZE];
        SearchSortAlgorithms<Integer> intSearchObject = new SearchSortAlgorithms<Integer>();

        for(int i = 0; i < SIZE; i ++) {
        	intList[i] = rand.nextInt(5001);
        }
	  intSearchObject.quickSort(intList, SIZE);
	  
	  intSearchObject.initializeNoOfComparisons();
	  location = intSearchObject.binarySearch(intList, 0, SIZE, 143);
	  binComps = intSearchObject.noOfComparisons();
	  intSearchObject.initializeNoOfComparisons();
	  intSearchObject.seqSearch(intList, 0, SIZE, 143);
	  seqComps = intSearchObject.noOfComparisons();
	  
	  System.out.println("It took " + binComps + " comparisons for the binary search to finish");
	  System.out.println("It took " + seqComps + " comparisons for the sequential search to finish");
	  if(location != -1) {
		  System.out.println("143 was found at index " + location);
	  }
	  else
		  System.out.println("143 was not found");
	  
	 System.out.println("The Sequntial search will always take longer to than the Binary search unless the value is at index 3 or lower. For an array with the size of 2500"
	 		+ " the Binary search has a maximum of 12 comparisons while the Sequential search has a maximum of 2500 comparisons");
	
	}
    public static void printArray(Integer[]a) {
    	for(int i = 0; i < SIZE; i ++) {
        	System.out.print(a[i] + " ");
        }
    	System.out.println();
    }
}
