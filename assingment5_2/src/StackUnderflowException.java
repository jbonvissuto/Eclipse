//COSC 237-101
//Name: Jackson K. Bonvissuto
//ID: 0716190
public class StackUnderflowException extends StackException
{
    public StackUnderflowException()
    {
         super("Stack Underflow");
    }

    public StackUnderflowException(String msg)
    {
        super(msg);
    }
}