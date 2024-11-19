import java.util.*;

public class MyProgram
{
    public static void main(String[] args)
    {
        // initializing objects
        Scanner in = new Scanner(System.in);
        ranWord choice = new ranWord();
        
        // selects random word, starts chances
        String word = choice.randWordChoice();
        int chances = 0;
        
        System.out.println("-` WORDLE ´-");
        System.out.println("-------------");
        System.out.println("O for green\n! for yellow\nX for grey");
        System.out.println("-------------");
        
        
        do {
            
            //lets user guess
            String guess = in.nextLine();
            
            //checks if guess is accurate. O for green, ! for yellow, X for grey
            check(word, guess, chances);
            
            //adds to chances
            chances ++;
            
        } while (chances < 5); //runs this while chances are less than 5
        
    }

    // im not commenting this dont ask
    public static void check(String word, String guess, int chances) {
        
        word = word.toUpperCase();
        guess = guess.toUpperCase();
        
        if ( word.equals(guess)) {
            System.out.println("\nGreat job!\nThe word was " + word);
        } else {
            
            if (guess.length() < 5) {
                
                for (int i = 0; guess.length() < 5; i++) {
                    guess = guess + "*";
                }
            }
        
            for ( int i = 0; i < 5; i++) {
            
                String guess1 = Character.toString(guess.charAt(i));
            
                if (word.charAt(i) == guess.charAt(i)){
                    System.out.print(/*word.charAt(i)*/ "O");
                
                } else if (word.contains(guess1)){
                    System.out.print("!");
                
                } else {
                System.out.print("X");
                }
            }
            
            System.out.println("\n");
            
            if (chances == 4) {
                System.out.println("Nice try\nThe word was " + word);
            }
        }
    } //dont delete
}//dont delete
