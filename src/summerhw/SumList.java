package summerhw;

import java.util.ArrayList;

public class SumList {
    public static void main(String[] args){
        ArrayList<Double> theList = new ArrayList<Double>();
        theList.add(1.5);
        theList.add(2.0);
        theList.add(3.2);
        theList.add(4.8);
        System.out.println(sumList(theList));
    }

    public static double sumList(ArrayList<Double> lst){
        double sum = 0;
        for(int i = 0; i < lst.size(); i++){
            sum = sum + lst.get(i);
        }
        return sum;
    }
}
