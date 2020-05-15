package playground;

public class equals {
    public static void main(String[] args){
        String a = "apples";
        String b = a;
        String c = new String("apples");
        String d = "apples";

        // Conclusion: a and b point to the same value while having the same content.
        if(a == b){
            System.out.println("a == b");
        }
        if(a.equals(b)){
            System.out.println("a equals b");
        }

        // Conclusion: Doing new String() explicitly creates a new Object so
        // a == c is false(== checks reference). However, the content of a
        // and c is the same; "apples."
        if(a == c){
            System.out.println("a == c");
        }
        if(a.equals(c)){
            System.out.println("a equals c");
        }

        // Conclusion: Ideally, you would think that a == d should return false
        // because you are creating a new String but that's not the case. Sometimes,
        // java reuses an instance from the string constant pool; hence, we see
        // "a == d" in the console. Once again, the content of a and the content of d
        // is the same.
        if(a == d){
            System.out.println("a == d");
        }
        if(a.equals(d)){
            System.out.println("a equals d");
        }
    }
}
