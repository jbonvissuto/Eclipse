//COSC 237-101
//Name: Jackson K. Bonvissuto
//ID: 0716190

import java.io.*;
import java.util.*;
public class  assingment1_6{
  public static void main(String[]args)
    throws FileNotFoundException{
    Scanner read = new Scanner(new File("data6.txt"));
    char grade;
    double avg;  
    String name;
    
    while(read.hasNext()){
      name = read.next();
      avg = calculateAverage(read);
      grade = calculateGrade(avg);
      System.out.printf("%s %s %c.\n", name,  "got a",  grade);
    }
  }//End class
  //Calculate Average Method 
  public static double calculateAverage (Scanner read){
    int sum = 0;
    int num;
    while(read.hasNextInt()){
        num = read.nextInt();
        sum += num;
    }
    
    return sum/5.0;
  }
  //Calculate Grade Method 
  public static char calculateGrade (double avg) {
    if(avg <= 60){
      return 'F';
    }
    else if( avg <= 69){
      return 'D';
    }
    else if (avg <=79){
      return 'C';
    }
    else if (avg <= 89){
      return 'B';
    }
    else{
      return 'A';
    }
  }
}//End main 