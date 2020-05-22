package aptestpratice.wordpair;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
        int numMatches = 0;
        ArrayList<Wordpair> listOfWords = new ArrayList<Wordpair>();

        listOfWords.add(new Wordpair("Apple", "Pie"));
        listOfWords.add(new Wordpair("Orange", "Soda"));
        listOfWords.add(new Wordpair("Cheese", "Cheese"));

        for(int i = 0; i < listOfWords.size(); i++){
            if(listOfWords.get(i).getFirstWord() == listOfWords.get(i).getSecondWord()){
                numMatches++;
            }
        }

        System.out.println(numMatches);
    }

}
