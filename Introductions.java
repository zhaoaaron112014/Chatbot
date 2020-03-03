import java.util.Random;

public class Introductions{


    public String getRandomGreeting()
    {
        Random r = new Random ();
        return randomGreeting [r.nextInt(randomGreeting.length)];
    }

    public String [] randomGreeting = {
            "Hi! How are you?",
            "How are you today?"

    };

    public String iAmResponse(String statement) {
        boolean good = false;
        String returned = "";

        for (int i = 0; i < goodResponses.length; i++) {
            if (statement.contains(goodResponses[i])) {
                returned = "I'm glad you are feeling well!";

                return returned;
            }
        }
        if (!good) {
            for (int i = 0; i < badResponses.length; i++) {
                if (statement.toLowerCase().contains(badResponses[i])) {
                    returned = "I'm sorry you aren't feeling well today.";
                    good = true;
                    return returned;
                }
            }
            if (!good) {
                returned = "Hmm.";
            }
        }
        return returned;
    }
    public String greetingResponse() {
            return "Hello! " + getRandomGreeting();
    }

    public void prompt(){
        System.out.println("What can I help you with today?\nFiles and Folders, Shortcuts, Creating and Opening projects");

    }




    private String[] goodResponses = {
            "good",
            "great",
            "amazing",
            "cool",
            "well",
            "excellent"
    };

    private String[] badResponses = {
            "bad",
            "sad",
            "depressed",
            "nervous",
            "anxious",
            "poor",
            "poorly"
    };

    public String[] greetings = {
            "Hi", "Hello", "Hey"
    };

}