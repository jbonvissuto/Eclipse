
import java.io.*;

public class Course
{
    private String courseName;  //object to store the
                                //course name
    private String courseNo;    //object to store the
                                //course number
    private String courseGrade;
    
    private int courseCredits;  //variable to store the
                                //course credits
 //Dr. Yu -- complete this class by implementing the following methods:
    
    //Default Constructor
    //The object is initialized to the default values.
    //Postcondition: courseName = ""; courseNo = "";
    //               courseCredits = 0;
    public Course()
    {
      courseName = "null";
      courseNo = "0000";
      courseCredits = 0;
      courseGrade = "b";
    }

    //Constructor
    //The object is initialized according to the parameters.
    //Postcondition: courseName = cName; courseNo = cNo;
    //               courseCredits = credits;
    public Course(String cName, String cNo, int credits, String cGrade)
    {
      // -- Your Implementation
    	 courseName = cName;
         courseNo = cNo;
         courseCredits = credits;
         courseGrade = cGrade;
    }

    //Method to set the course information
    //The course information is set according to the parameters.
    //Postcondition: courseName = cName; courseNo = cNo;
    //               courseCredits = credits;
    public void setCourseInfo(String cName, String cNo, int credits, String cGrade)
    {
      // -- Your Implementation
    	 courseName = cName;
         courseNo = cNo;
         courseCredits = credits;
         courseGrade = cGrade;
    }

    //Method to set the course Name
    //Postcondition: courseName = cName;
    public void setCourseName(String cName)
    {
      // -- Your Implementation
    	courseName = cName;
    }

    //Method to set the course Number
    //Postcondition: courseNo = cNo;
    public void setCourseNumber(String cNo)
    {
      // -- Your Implementation
    	 courseNo = cNo;
    }

    //Method to set the course credits
    //Postcondition: courseCredits = credits;
    public void setCourseCredits(int credits)
    {
      // -- Your Implementation
    	 courseCredits = credits;
    }

   
    public void setCourseGrade(String cGrade) {
    	courseGrade = cGrade;
    }
    
    //Method to print the course information
     //Postcondition: This method prints the course
       //               information on the screen.
    public void print()
    {
      // -- Your Implementation
    	System.out.printf("%-15s %-17s %-12d %-1s\n", courseName, courseNo, courseCredits, courseGrade);
    }

    public void printNotPaid()
    {
      // -- Your Implementation
    	System.out.printf("%-15s %-17s %-12d %-1s\n", courseName, courseNo, courseCredits, "!Grades Held!");
    }
    //Method to print the course information
    //Postcondition: This method sends the course information to a file.
    public void print(PrintWriter outp)
    {
      // -- Your Implementation 
    	outp.print(courseName + " " + courseNo + " " + courseCredits + " " + courseGrade);
    	outp.close();
    }

    //Method to return the course name
    //Postcondition: The value of courseName is returned.
    public String getCourseName()
    {
     return courseName;
    }

    //Method to return the course number
    //Postcondition: The value of courseNo is returned.
    public String getCourseNumber()
    {
      // -- Your Implementation
    	return courseNo;
    }

    //Method to return the credit hours
    //The value of the private data member courseCredits
    //is returned.
    public int getCourseCredits()
    {
      // -- Your Implementation
    	return courseCredits;
    }
    
    public String getCourseGrade()
    {
    	return courseGrade;
    }
    
    //Method to copy a course�s information.
    //otherCourse is copied into this course
    //Postcondition: courseName = otherCourse.courseName;
    //               courseNo = otherCourse.courseNo;
    //               courseCredits = otherCourse.courseCredits;
    public void copyCourseInfo(Course otherCourse)
    {
      // -- Your Implementation
    	courseName = otherCourse.courseName;
    	courseNo = otherCourse.courseNo;
    	courseCredits = otherCourse.courseCredits;
    	courseGrade = otherCourse.courseGrade;
    }
    
}
