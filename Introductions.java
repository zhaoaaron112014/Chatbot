import java.util.Random;

public class Introductions{


    public String getRandomGreeting()
    {
        Random r = new Random ();
        return randomGreeting [r.nextInt(randomGreeting.length)];
    }

    public String [] randomGreeting = {"Interesting, tell me more",
            "Hi! How are you?",
            "How are you today?"

    };

    public void firstResponse(String statement){
        boolean good = false;
        for (int i = 0; i < goodResponses.length; i++) {
            if ((goodResponses[i].contains(statement))) {
                System.out.println("I'm glad you are feeling well!");
                good = true;
                break;
            }
        }
        if (!good) {
            for (int i = 0; i < badResponses.length; i++) {
                if (statement.toLowerCase().contains(badResponses[i])) {
                    System.out.println("I'm sorry you aren't feeling well today.");
                    good = true;
                    break;
                }
            }
            if (!good) {
                System.out.println("Hmm.");
            }
        }



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

}