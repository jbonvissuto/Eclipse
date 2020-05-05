// Implement the class Student by extending the class Person 
import java.io.*;
import java.util.*;
public class Student extends Person
{
  // Fields
  //    -- Your Code Here
  private String studentId;
  private boolean tuitionPaid;
  private int numOfClass;
  private ArrayList<Course> courseList = new ArrayList<Course>();
  
  // Constructors
  //    -- Your Code Here
  public Student(){
	  super();
	  studentId = "null";
	  tuitionPaid = false;
	  numOfClass = 0;
  }
  
  public Student(String first, String last, String id, boolean paid, int numClass) {
	  super(first, last);
	  studentId = id;
	  tuitionPaid = paid;
	  numOfClass = numClass;
	  
  }
  public void setCourseList(Scanner fileReader) {
	  String classLine, cName, cNo,  cGrade;
	  
	  int credits;
	  for(int i = 0; i < numOfClass; i++) {
 		 
		  cName = fileReader.next();
		  cNo = fileReader.next();
		  credits = fileReader.nextInt();
		  cGrade = fileReader.next();
		  Course course = new Course(cName, cNo, credits, cGrade);
		  courseList.add(course);
	  }
  }
  public void printCourseList() {
		 for (int i = 0; i < courseList.size();i++) 
	      { 		      
	         courseList.get(i).print();		
	      }  
  }
  public String getPaid() {	 
		 if (tuitionPaid)
			 return "Y";
		 else 
			 return "N";
	} 
  public void printStudent() {
	  System.out.println(getFirstName() + " " + getLastName() + " " + studentId + " " + getPaid() + " " + numOfClass );
  }
  
  	public double getGpa() {
	   double credits = 0;;
	   int gradePoints = 0;
	   double gpa = 0;
	   String tempGrade;
  		for (int i = 0; i < numOfClass; i ++) {
		  int tempCredits = courseList.get(i).getCourseCredits();
  		  credits  += tempCredits;
		  tempGrade = courseList.get(i).getCourseGrade(); 
		  switch (tempGrade) {
		  	case "A": gradePoints += 4 * tempCredits;
		  			break;
		  	case "B": gradePoints += 3 * tempCredits;
		  	        break;
		  	case "C": gradePoints += 2 * tempCredits;
		  			break;
		  	case "D": gradePoints += 1 * tempCredits;
		  			break;
		  	case "F": gradePoints += 0 * tempCredits;
		  			break;
		  }
	  }
  		gpa = (gradePoints/credits);
  		gpa = Math.round(gpa *100.0)/100.0;
  		return gpa;
  	}
  	
  	public void printGradeReport(int cost) {
  		
  		if(tuitionPaid) {
  			System.out.println("**************************************************************");
  			System.out.println("                       Grade Report\n");
  			System.out.println("Name: " + getFirstName() + " " + getLastName());
  			System.out.println();
  			System.out.println("Student ID: " + studentId);
  			System.out.println();
  			System.out.printf("%-15s %-17s %-12s %-1s\n", "Course Name", "Course ID", "Credits", "Grade");
  			for(int i = 0; i <numOfClass; i++) {
  				courseList.get(i).print(); 
  			}
  			System.out.println();
  			System.out.println("Tuition Cost: $" + cost + " Status: Paid");
  			System.out.println();
  			System.out.println("GPA: " + getGpa());
  			System.out.println("**************************************************************");
  		
  		}
  		else {
  			System.out.println("**************************************************************");
  			System.out.println("                       Grade Report\n");
  			System.out.println("Name: " + getFirstName() + " " + getLastName());
  			System.out.println();
  			System.out.println("Student ID: " + studentId);
  			System.out.println();
  			System.out.printf("%-15s %-17s %-12s %-1s\n", "Course Name", "Course ID", "Credits", "Grade");
  			for(int i = 0; i <numOfClass; i++) {
  				courseList.get(i).printNotPaid(); 
  			}
  			System.out.println();
  			System.out.println("Tuition Cost: $" + cost + " Status: Not Paid");
  			System.out.println();
  			System.out.println("GPA: !GPA and grades held until tuition is paid!");
  			System.out.println("**************************************************************");
  		}
  	}
  	
  	
  	
  }
  // Methods
  //    -- Your Code Here

