/*
 * File: Wordle.java
 * -----------------
 * This module is the starter file for the Wordle assignment.
 * BE SURE TO UPDATE THIS COMMENT WHEN YOU COMPLETE THE CODE.
 */

public class Wordle {
    
    /* Private instance variables */
    // TODO: Add any extra instance variables here, if any
    private WordleGWindow gw;
    private String word;
    
    
    
    public void run() {
        // DEBUG: useful for testing
        // word = "GLASS"; 
        word = chooseWord(); // choose random word
        gw = new WordleGWindow();
        gw.addEnterListener((s) -> enterAction(s));
    }
    
    /**
     * returns a random word from WordleDictionary.
     */
    public String chooseWord(){
         // TODO
         return "GLASS"; // delete this line of code
    }

/*
 * Called when the user hits the RETURN key or clicks the ENTER button,
 * passing in the string of characters on the current row.
 */

    public void enterAction(String s) {
        // TODO
        // You may decide to write some helper methods
        // to make this method more manageable.
        gw.showMessage("You have to implement this method.");
    }
    
    
    /**
     * @param guess the user's guess
     * @param word the secret word to be guessed
     * @return a String version of the hint where a capital letter 
     * represents a correct guess at the correct location, a lower
     * case letter represents a correct guess at the wrong location, 
     * and a '*' represents an incorrect letter (neither in the 
     * correct place nor a correct letter anywhere in the word)
     * 
     * You will use this helper method when coloring the squares.
     * It's also the crucial method that is tested in codePost.
     * 
     * Examples: 
     * word        = "CLASS"
     * guess       = "SASSY"
     * returns:      "sa*S*"
     * 
     * word        = "FLUFF"
     * guess       = "OFFER"
     * returns:      "*ff**"
     * 
     * word        = "STACK"
     * guess       = "TASTE"
     * returns:      "tas**"
     * 
     * word        = "MYTHS"
     * guess       = "HITCH"
     * returns:      "h*T**"
     * 
     */
    public String getHint(String guess, String word){
        word = word.toUpperCase();
        guess = guess.toUpperCase();
        //TODO
        return "*****"; // delete this line of code
        
    }

/* Startup code */

    public static void main(String[] args) {
        new Wordle().run();
    }


}
