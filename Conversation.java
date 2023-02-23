import java.util.Scanner;
import java.util.Random;
 
/**
 * The conversation class takes in a number of rounds of conversation,
 * then has the set number of back-and-forth with the user
 * by taking in a string of user input,
 * checking if it contains any first or second-person pronouns,
 * and print either a random reply or a reply with swapped pronouns.
 * @author Yuqi Wang
 */
class Conversation {
 
  private String[] replies;
  private String[] pronouns;
  private int rounds;
 
  public Conversation(int number){
    this.rounds = number;
  }

  public void chat(){
  Scanner userInput = new Scanner(System.in);
  for (int i = 0; i < this.rounds; i++){
    
    String text = userInput.nextLine();
    String lowText = text.toLowerCase();
    
    if (hasPronouns(lowText)){
      specific(lowText);
    }
    else{
      random(lowText);
    }

  }
  userInput.close();
  }

  public boolean hasPronouns (String input){
    pronouns = new String[] {" i ", " i,", " i.", " i?", "i'", 
    " me ", " me,", " me.", " me?", 
    " my ",
    " mine ", " mine,", " mine.", " mine?",
    " you ", " you,", " you.", " you?", "you'",
    " your "};
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

    replies = new String[] {"I see.", "Thanks for sharing.", "Okay.", "Interesting.", "I'm glad we talked"};
    Random random = new Random();
    int randomInt = random.nextInt(replies.length);
    System.out.println(replies[randomInt]);
    
  }

  public void specific (String input){
  
  System.out.println("Mirror replacements place-holder");

  }
  
  public static void main(String[] arguments) {

    System.out.println("How many rounds would you like to have?");

    Scanner userInput = new Scanner(System.in);
    int number = userInput.nextInt();

    Conversation myConversation = new Conversation(number);
    System.out.println("Hi there!  What's on your mind?");
    myConversation.chat();

    System.out.println("See ya!");
    userInput.close();
  }
   
}
 