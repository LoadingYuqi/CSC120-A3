/**
 * The conversation class takes in a number of rounds of conversation,
 * then has the set number of back-and-forth with the user
 * @author Yuqi Wang
 */

import java.util.Scanner;

class Conversation {

  private String[] replies;
  private String[] pronouns;
  private int rounds;

  public boolean ifPronouns (String input){
    pronouns = new String[] {"i ", "i,", "i.", "i?", 
    "me ", "me,", "me.", "me?", 
    "my ", "my,", "my.", "my?",
    "mine ", "mine,", "mine.", "mine?",
    "you ", "you,", "you.", "you?",
    "your ", "your,", "your.", "your?",};
    boolean match = false;
    for (String pronoun : pronouns){
      if (input.contains(pronoun)){
        match = true;
        break;
      }
    }
    return match;
  }

  public void random (String input){

    replies = new String[] {"I see.", "Thanks for sharing.", "Okay.", "Interesting."};
  }

  public void specific (String input){

  }
  
  public void main(String[] arguments) {
    
    

    System.out.println("How many rounds would you like to have?");

    Scanner userInput = new Scanner(System.in);
    rounds = userInput.nextInt();
    
    System.out.println("Hi there!  What's on your mind?");

    for (int i = 0; i < rounds; i++){
    
      String text = userInput.nextLine();
      if ()
    }

    System.out.println("See ya!");
    userInput.close();
  }
  
}
