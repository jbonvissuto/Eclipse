// Complete the Program with main functions

import java.io.*;
import java.util.*;

public class GradeReportProgram
{
  public static void main(String[] args) throws FileNotFoundException {
	  int numOfStudents, tuition, numClasses;
	  String first, last, id ,temp;
	  boolean paid = true;
	  Scanner readFile = new Scanner(new File("stData.txt"));
	  
	 numOfStudents = readFile.nextInt();
	 Student[] studentList = new Student[numOfStudents];
	 tuition = readFile.nextInt();
	 readFile.nextLine();
	 for(int i = 0; i < numOfStudents; i++) {

		  first = readFile.next();
		  last = readFile.next();
		  id = readFile.next();
		  temp = readFile.next();
		  if (temp.equals("Y")) 
			  paid = true;
		  else 
			  paid = false;
		  numClasses = readFile.nextInt();
		  readFile.nextLine();
		  Student student = new Student(first, last, id, paid, numClasses);
		  student.setCourseList(readFile);
		  studentList[i] = student;
	 }
	  for(int i = 0; i < numOfStudents; i ++) {
		  studentList[i].printGradeReport(tuition);
		  
		  System.out.println();
	  }
	 
	 
  }
 public static void studentReport(Student a) {
	 
 }
  
  
}
