/**
 * The conversation class takes in a number of rounds of conversation,
 * then has the set number of back-and-forth with the user
 * by taking in a string of user input,
 * checking if it contains any first or second-person pronouns,
 * and print either a random reply or a reply with swapped pronouns.
 * @author Yuqi Wang
 */

import java.util.Scanner;
import java.util.Random;

class Conversation {

  private String[] replies;
  private String[] pronouns;
  private int rounds;

  public Conversation(int rounds){
    this.rounds = rounds;
  }

  public boolean hasPronouns (String input){
    pronouns = new String[] {"i ", "i,", "i.", "i?", 
    "me ", "me,", "me.", "me?", 
    "my ", "my,", "my.", "my?",
    "mine ", "mine,", "mine.", "mine?",
    "you ", "you,", "you.", "you?",
    "your ", "your,", "your.", "your?",};
    boolean match = false;
    for (String pronoun : pronouns){ // Reference: https://stackoverflow.com/questions/8992100/test-if-a-string-contains-any-of-the-strings-from-an-array
      if (input.contains(pronoun)){
        match = true;
        break;
      }
    }
    return match;
  }

  public void random (String input){

    replies = new String[] {"I see.", "Thanks for sharing.", "Okay.", "Interesting."};
    Random random = new Random();
    int randomInt = random.nextInt(replies.length);
    System.out.println(replies[randomInt]);

  }

  public void specific (String input){

  }

  public void chat(){

    Scanner input = new Scanner(System.in);
    for (int i = 0; i < this.rounds; i++){
      
      
      String text = input.nextLine();
      String lowText = text.toLowerCase();
      
      if (hasPronouns(lowText)){
        specific(lowText);
      }
      else{
        random(lowText);
      }
      
    }

    input.close();
  }
  
  
  public void main(String[] arguments) {
    
    System.out.println("How many rounds would you like to have?");
    Scanner userInput = new Scanner(System.in);
    int rounds = userInput.nextInt();
    
    System.out.println("Hi there!  What's on your mind?");

    Conversation myConversation = new Conversation(rounds);
    myConversation.chat;

    System.out.println("See ya!");
    userInput.close();
  }
  
}

