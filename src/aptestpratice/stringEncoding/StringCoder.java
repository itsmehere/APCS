package aptestpratice.stringEncoding;
import java.util.*;

public class StringCoder {
    private String masterString;

    /**
     * Constructor for objects of class StringCoder
     */
    public StringCoder()
    {
        masterString="sixtyzipperswerequicklypickedfromthewovenjutebag";
    }

    public StringCoder(String master)
    {
        masterString=master;
    }

    /** @param parts an ArrayList of string parts that are
     * valid in the master string
     * Precondition: parts.size() > 0
     * @return the string obtained by concatenating the parts
     * of the master string
     */
    public String decodeString(ArrayList<StringPart> parts)
    {
        String s = "";
        for (StringPart part : parts)
            s = s + masterString.substring(part.getStart(), part.getStart() + part.getLength());
        return s;
    }

    private StringPart findPart(String str)
    {
        int start=0;
        int length=0;
        for (int len=1; len<=str.length(); len++)
        {
            int found=masterString.indexOf(str.substring(0,len));
            if (found!=-1)
            {
                start=found;
                length=len;
            }
        }
        return new StringPart(start, length);
    }

    /** @param word the string to be encoded
     * Precondition: all of the characters in word
     * appear in the master string;
     * word.length() > 0
     * @return an ArrayList of string parts of the master
     * string that can be combined
     * to create word
     */
    public ArrayList<StringPart> encodeString(String word)
    {
        // Recursive Version
        ArrayList<StringPart> partsList = new ArrayList<StringPart>();
        if(word.length() != 0){
            StringPart part = findPart(word);
            partsList.add(part);
            partsList.addAll(encodeString(word.substring(part.getLength())));
        }
        return partsList;

        /*
        ArrayList<StringPart> partsList = new ArrayList<StringPart>();
        while(word.length() != 0){
            StringPart part = findPart(word);
            partsList.add(part);
            word = word.substring(part.getLength());
        }
        return partsList;
         */
    }

    public static void main(String[] args)
    {
        ArrayList<StringPart> overeager = new ArrayList<StringPart>();
        overeager.add(new StringPart(37,3));
        overeager.add(new StringPart(14,2));
        overeager.add(new StringPart(46,2));
        overeager.add(new StringPart(9,2));

        System.out.println("overeager should be encoded as " + overeager);
        StringCoder key=new StringCoder();
        System.out.println("Testing part b overeager is encoded as " + key.encodeString("overeager"));
    }
}
