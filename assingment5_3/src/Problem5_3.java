//COSC 237-101
//Name: Jackson K. Bonvissuto
//ID: 0716190
public class Problem5_3 {

	public static void main(String[] args) {
		
		StackClass stack1 = new StackClass();
		//Fills stack1 with 1-100
		for(int i = 0; i < 100; i ++) {
			stack1.push(i+1);
		}
		
		StackClass stack2 = new StackClass(10);
		//Fills stack1 with 1-10
		for(int i = 0; i < 10; i ++) {
			stack2.push(i+1);
		}
		
		System.out.println("The top of stack1 is " + stack1.peek());
		System.out.println("The top of stack2 is " + stack2.peek());
		System.out.println("Coppying the contents of stack1 in reverse order to stack2");
		stack1.reverseStack(stack2);
		System.out.println("The top of stack1 is " + stack1.peek());
		System.out.println("The top of stack2 is " + stack2.peek());
				
	

	}


}
