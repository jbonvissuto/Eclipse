import java.io.File;
import java.io.FileNotFoundException;
import java.util.*;
public class Problem5_Bonus {

	public static void main(String[] args)throws FileNotFoundException {
		int lines;
		
		lines = countLines("names.txt");
		
		String[] nameList = new String[lines];
		nameList = makeArray(lines, "names.txt");
		
		mergeSort(nameList);
		
		printArray(lines, nameList);
		
		
	}// End Main

		public static int countLines(String a) throws FileNotFoundException {
			int size = 0;
			Scanner countLines = new Scanner(new File(a));
			while(countLines.hasNextLine()){
				countLines.nextLine();
				size ++;
			}
			return size;
		}
	
		public static String[] makeArray(int size, String a) throws FileNotFoundException {
			 Scanner getNames = new Scanner(new File(a));
			 String[] names = new String[size]; 
			 for(int i = 0; i < size; i++) {
				 names[i] = getNames.nextLine();
			 }
			 return names;
		}
		
		public static void printArray(int size, String[] list) {
			for(int i = 0; i < size; i++) {
				System.out.println(list[i]);
			}
		}
		
		
		public static void merge (String[] list, String[] left, String[]right) {
			int i1 = 0;
			int i2 = 0;
			for(int i = 0; i < list.length; i++) {  
				if(i2 >= right.length || (i1 < left.length && left[i1].compareToIgnoreCase(right[i2]) < 0 ) ) {
					list[i] = left[i1];
					i1++;
				}
				else {
					list[i] = right[i2];
					i2++;
				}
			}
		}
		
		public static void mergeSort(String[] list) {
			if(list.length >= 2) {
				String[] left = new String[list.length/2];
		
				String[] right = new String[list.length - list.length/2];
	
				for(int i = 0; i < left.length; i ++) {
					left[i] = list[i];
				}
				for(int i = 0; i < right.length; i ++) {
					right[i] = list[i + list.length/2];
				}
				mergeSort(left);
				mergeSort(right);
				
				merge(list , left, right);
			
			}
			
		}
}
