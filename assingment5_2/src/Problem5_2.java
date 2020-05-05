//COSC 237-101
//Name: Jackson K. Bonvissuto
//ID: 0716190
public class Problem5_2 {

	public static void main(String[] args) {
		//Creates stack1 with max stack size of 100 and stack top of 0
		StackClass stack1 = new StackClass();
		//Creates stack2 with max stack size of 10 and stack top of 0
		StackClass stack2 = new StackClass( 200);
		//Fills stack1 with 1-100
		for(int i = 0; i < 100; i ++) {
			stack1.push(i+1);
		}
		System.out.println("The stack top of stack1 is " + stack1.peek());
		stack1.pop();
		System.out.println("The stack top of stack1 is " + stack1.peek());
		//Fills stack1 with 1-99
		for(int i = 0; i < 99; i ++) {
			stack2.push(i+1);
		}
		System.out.println("The stack top of stack2 is " + stack2.peek());
		//Compares stack1 to stack 2
		if(stack1.equalStack(stack2))
			System.out.println("stack1 and stack2 are equal");
		else 
			System.out.println("stack1 and stack2 are NOT equal");
		//Fills stack3 with 1-99
		StackClass stack3 = new StackClass(100);
		for(int i = 0; i < 99; i ++) {
			stack3.push(i+1);
		}
		//Compares stack1 to stack 3
		if(stack1.equalStack(stack3))
			System.out.println("stack1 and stack3 are equal");
		else 
			System.out.println("stack1 and stack3 are NOT equal");
		
	}

}
