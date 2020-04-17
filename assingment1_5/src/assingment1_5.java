//COSC 237-101
//Name: Jackson K. Bonvissuto
//ID: 0716190
import java.util.*;
public class  assingment1_5{
  public static void main(String[]args){
    Scanner input = new Scanner(System.in);
    int num = 0, amt = 1;
    int[]count = new int[101];
    System.out.println("Enter positive  integers (<= 100) until you have entered 100 numbers, or enter -999 to end the program.");
    while (num != -999 && amt != 101){
      num = input.nextInt();
      if (num != -999){
        count[num] ++;
      }
      amt++; 
    }
    System.out.printf("%2s %6s\n", "Number", "Count");
    for(int i = 0; i < 101; i ++){
      if(count[i] != 0){
        System.out.printf("%3d %8d\n",i,count[i]); 
      }
    }
  }
}
