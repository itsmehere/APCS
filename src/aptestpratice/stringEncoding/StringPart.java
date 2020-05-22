package aptestpratice.stringEncoding;

public class StringPart {
    private int start;
    private int len;

    public StringPart(int theStart, int theLen)
    {
        // initialise instance variables
        start = theStart;
        len=theLen;
    }

    public StringPart()
    {
        start = 0;
        len = 0;
    }

    public int getStart()
    {
        return start;
    }

    public int getLength()
    {
        return len;
    }

    public String toString()
    {
        return "(" + getStart() + ", " + getLength() + ")";
    }
}
