
// This file will run all my functionality from AlfredQuotes Class

public class TestAlfredQuotes {

    // main will always be launch point for my java applications
    public static void main(String[] args) {

        // initialized variable named alfredBot that is a new instance of AlfredQuotes
        // class.
        // type declaration is AlfredQuotes
        AlfredQuotes alfredBot = new AlfredQuotes();

        // test greetings
        // I declare a new String variable called testGreeting and attach the method
        // basicGreeting imported from AlfredQuotes
        String testGreeting = alfredBot.basicGreeting();

        // I delcare a new String variable called testGuestGreeting and attach the
        // method guestGreeting to alfredBot, my instance of the AlfredQuotes class
        String testGuestGreeting = alfredBot.guestGreeting("Linda Belcher");

        // I delcare a new String variable called testDateAnnouncement. I attach the
        // method dateAnnouncement to alfredBot, my instance of the AlfredQuotes class.
        String testDateAnnouncement = alfredBot.dateAnnouncement();

        // I initialized a new String variable called alexisTest.  I attached the method respondBeforeAlexis to alfredBot, an instance of the AlfredQuotes class
        // String sentence = "will you clean my room";
        // int idx = sentence.indexOf("Alexis");
        // System.out.println(idx);
        String alexisTest = alfredBot.respondBeforeAlexis("Alfred, put me to sleep!");


        // Ninja Bonus
        String testExcitedSentence = alfredBot.excitedSentence("Where are my pants?");

        System.out.println(testGreeting);
        System.out.println(testGuestGreeting);
        System.out.println(testDateAnnouncement);
        System.out.println(alexisTest);
        System.out.println(testExcitedSentence);


    }

}
