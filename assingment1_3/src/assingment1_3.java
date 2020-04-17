//COSC 237-101
//Name: Jackson K. Bonvissuto
//ID: 0716190

import java.util.*;
public class  assingment1_3{
  public static void main(String[]args){
    Scanner input = new Scanner(System.in);
    int score;
    double grade = 0;
    System.out.println("Enter your grade");
    score = input.nextInt();
    grade = getGrade(score);
    System.out.printf("%.1f",grade);
  }//Main end
  //getGrade Method
  public static double getGrade(int score){
    if(score < 60){
      return 0;
    }
    else if(score >= 60 && score <= 62){
      return 0.7;
    }
    else if(score >= 95){
      return 4;
    }
    else{
    return (score - 62)/10.0 + 0.7;//Computes grades from 62 - 94
    }
    
  }
  
}//Class end