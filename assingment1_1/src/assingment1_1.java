//COSC 237-101
//Name: Jackson K. Bonvissuto
//ID: 0716190

public class  assingment1_1{
  public static void main(String[]args){
    for(int i = 0 ; i < 7 ; i++){//Prints rows
      for(int j = 0 ; j < 6 - i ; j ++){
        System.out.print("*");
      }
      for(int k = 0; k < 2 + i; k++){	
        System.out.print(" ");
      }
      for(int x = 0 ; x < 12 - i * 2; x++){
        System.out.print("/");
      }
      for(int x = 0 ; x < 0 + i * 2; x++){
        System.out.print("\\");
      }
      
      for(int k = 0; k < 2 + i; k++){
        System.out.print(" ");
      }
      
      for(int j = 0 ; j < 6 - i ; j ++){
        System.out.print("*");
      }
      
      System.out.println();
    }
    
  }//End Main
}//End Class 