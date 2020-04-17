// Implement the class Student by extending the class Person 
import java.io.*;

public class Student extends Person
{
  // Fields
  //    -- Your Code Here
  private int studentId;
  private boolean tuitionPaid;
  private int numOfClass;
  
  // Constructors
  //    -- Your Code Here
  public Student(){
	  super();
	  studentId = 0;
	  tuitionPaid = false;
	  numOfClass = 0;
  }
  
  public Student(String first, String last, int id, boolean paid, int numClass) {
	  super(first, last);
	  studentId = id;
	  tuitionPaid = paid;
	  numOfClass = numClass;
  }
  // Methods
  //    -- Your Code Here
}
