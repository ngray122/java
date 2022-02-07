
// This file will hold all my functionality


// importing Date from java library
import java.util.Date;


// class name must match file name
public class AlfredQuotes {


    Date date = new Date();

    public String basicGreeting() {
        return "Hello, lovely to see you.  How are you?";
    }

    public String guestGreeting(String name) {
        // return "Welcome! Happy to see you've arrived, " + name;
        return String.format("Welcome, %s! Happy to see you've arrived!", name);

    }

    public String dateAnnouncement() {
        return String.format("It is currently %s", date);
    }

    public String respondBeforeAlexis(String conversation) {
        String alexis = "Alexis";
        String alfred = "Alfred";

        // String.conversation.indexOf(alexis))
        if (conversation.indexOf(alexis) > -1){
            return String.format("Right away, sir. She certainly isn't sophisticated enough for that.");
        } else if (conversation.indexOf(alfred) > -1) {
            return String.format("At your service. As you wish, naturally");
        } else {
            return String.format("Right.  And with that, I shall retire");
        }
    }


    	// NINJA BONUS
	// See the specs to overload the guessGreeting method
    // SENSEI BONUS
    // Write your own AlfredQuote method using any of the String methods you have learned!
    public String excitedSentence (String sentence) {
        return sentence.toUpperCase();
    }





}
