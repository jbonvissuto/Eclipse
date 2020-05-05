//COSC 237-101
//Name: Jackson K. Bonvissuto
//ID: 0716190
public class StackOverflowException extends StackException
{
    public StackOverflowException()
    {
         super("Stack Overflow");
    }

    public StackOverflowException(String msg)
    {
        super(msg);
    }
}

