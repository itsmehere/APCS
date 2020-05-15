public class HiddenWord{

    String guessWord;

    public HiddenWord(String wordToGuess){
        this.guessWord = wordToGuess;
    }

    public String getHint(String userWord){
        String hint = "";
        for(int i = 0; i < userWord.length(); i++){
            if(userWord.charAt(i) == guessWord.charAt(i)){
                hint = hint + userWord.charAt(i);
            } else if(guessWord.contains(Character.toString(userWord.charAt(i)))){
                hint = hint + "+";
            } else {
                hint = hint + "*";
            }
        }
        return hint;
    }

    /** This is a main method for testing the class */
    public static void main(String[] args)
    {
        HiddenWord puzzle = new HiddenWord("HARPS");
        System.out.println(puzzle.getHint("AAAAA") + " it should print +A+++");
        System.out.println(puzzle.getHint("HELLO") + " it should print H****");
        System.out.println(puzzle.getHint("HEART") + " it should print H*++*");
        System.out.println(puzzle.getHint("HARMS") + " it should print HAR*S");
        System.out.println(puzzle.getHint("HARPS") + " it should print HARPS");

    } // end of main

} // end of class