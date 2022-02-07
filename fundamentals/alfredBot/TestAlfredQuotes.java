// This file will run all my functionality from AlfredQuotes Class



public class TestAlfredQuotes{

    // main will always be launch point for java application
    public static void main(String[] args) {

        // creating instance of AlfredQuotes for this file, to access all the information in it 

        //???????????????????????? line 12 in confusing
        // ??AlfredQuotes variable named alfredBot that is a new instance of AlfredQuotes????  which alfredquotes 
        AlfredQuotes alfredBot = new AlfredQuotes();


        // test greetings
        String testGreeting = alfredBot.basicGreeting();
        // String testGuestGreeting = alfredBot.guestGreeting("Linda Belcher");
        // String testDateAnnouncement = alfredBot.dateAnnouncement();
        // String alexisTest = alfredBot.respondBeforeAlexis("Alexis, put me to sleep!");
        // String nonRelevantTest = alfredBot.respondBeforeAlexis("Maybe that's what Batman is about.  Not winning. But failing..")

        
        System.out.println(testGreeting);
        
    

}



}
