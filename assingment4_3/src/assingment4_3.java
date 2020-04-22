//COSC 237-101
//Name: Jackson K. Bonvissuto
//ID: 0716190
import java.util.*;
public class assingment4_3 {
	
	public static void main(String[] args) {
		 Scanner input = new Scanner(System.in);
		 int size, total = 0;
		 char cont = 'y';
		 do {
			 System.out.println("Enter the size size of the array.");
		 	size = input.nextInt();
		 	int[] array1 = new int[size];
		 	for(int i = 0; i < array1.length; i++) {
		 		System.out.print("Enter the value for index [" + i + "]");
		 		array1[i] = input.nextInt();
		 	}
		 	System.out.println("The sum of all the elements in the array is " + arraySum( array1, size, total));
		 	System.out.println("Do you want to continue? (y/n)");
		 	cont = input.next().charAt(0);
		 }while(cont == 'y' || cont == 'Y');
	}
	public static int arraySum(int[] a, int b, int sum) {
		
		if(b > 0) {
			sum = sum + a[b -1];
			return arraySum(a, b - 1, sum);
		}
		else if(b == 0) {
			return sum;
		}
		return sum;
	}
}
