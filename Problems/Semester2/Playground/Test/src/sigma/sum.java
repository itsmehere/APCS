package sigma;

public class sum {
    public static void main(String[] args){
        double sum = summation(1, 4, 10);
        System.out.println(sum);

        double sum2 = summation2(1, 4, 10);
        System.out.println(sum2);
    }

    // Less efficient way
    public static double summation(double a1, double d, int numTerms){
        double sum = 0;
        for(int i = 1; i <= numTerms; i++){
            sum += a1 + d*(i - 1);
        }
        return sum;
    }

    // More efficient way
    public static double summation2(double a1, double d, int numTerms){
        double lastTerm = a1 + d * (numTerms - 1);
        return (lastTerm + a1)*(numTerms / 2);
    }
}
