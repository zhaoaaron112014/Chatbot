import java.util.Random;

public class Chatbot
{
    Introductions Intro = new Introductions();
    FilesAndFolders FAF = new FilesAndFolders();
    Shortcuts SC = new Shortcuts();
    CreateAndOpen CAO = new CreateAndOpen();

    /**
     * Get a default greeting
     * @return a greeting
     */


    /**
     * Gives a response to a user statement
     *
     * @param statement
     *            the user statement
     * @return a response based on the rules given
     */
    public String getResponse(String statement){
        String response="";
        if(statement.length() == 0){
            response="Say something please.";
        }
        else if(findKeyword(statement,"no")>0){
            response="ok";
        }
        else if(findKeyword(statement, "i am") >= 0) {
            Intro.firstResponse(statement);
        }
        else {
            for (int i =0; i < Intro.randomGreeting.length; i++){
                if (findKeyword(statement, Intro.getRandomGreeting()) >= 0){
                    System.out.println(Intro.getRandomGreeting());
                }
                else{
                    response = "Sorry, can you repeat that?";
                }
            }

        }



        return response;
    }







    /**
     * Search for one word in phrase. The search is not case
     * sensitive. This method will check that the given goal
     * is not a substring of a longer string (so, for
     * example, "I know" does not contain "no").
     *
     * @param statement
     *            the string to search
     * @param goal
     *            the string to search for
     * @param startPos
     *            the character of the string to begin the
     *            search at
     * @return the index of the first occurrence of goal in
     *         statement or -1 if it's not found
     */
    public int findKeyword(String statement, String goal,
                           int startPos)
    {
        String phrase = statement.trim().toLowerCase();
        goal = goal.toLowerCase();

        // The only change to incorporate the startPos is in
        // the line below
        int psn = phrase.indexOf(goal, startPos);

        // Refinement--make sure the goal isn't part of a
        // word
        while (psn >= 0)
        {
            // Find the string of length 1 before and after
            // the word
            String before = " ", after = " ";
            if (psn > 0)
            {
                before = phrase.substring(psn - 1, psn);
            }
            if (psn + goal.length() < phrase.length())
            {
                after = phrase.substring(
                        psn + goal.length(),
                        psn + goal.length() + 1);
            }

            // If before and after aren't letters, we've
            // found the word
            if (((before.compareTo("a") < 0) || (before
                    .compareTo("z") > 0)) // before is not a
                    // letter
                    && ((after.compareTo("a") < 0) || (after
                    .compareTo("z") > 0)))
            {
                return psn;
            }

            // The last position didn't work, so let's find
            // the next, if there is one.
            psn = phrase.indexOf(goal, psn + 1);

        }

        return -1;
    }

    public String reduceContractions(String statement){
        String returned = "";
        if (findKeyword(statement, "don't") >= 0){
            returned = "do not";
        }

        return returned;

    }
    /**
     * Search for one word in phrase.  The search is not case sensitive.
     * This method will check that the given goal is not a substring of a longer string
     * (so, for example, "I know" does not contain "no").  The search begins at the beginning of the string.
     * @param statement the string to search
     * @param goal the string to search for
     * @return the index of the first occurrence of goal in statement or -1 if it's not found
     */
    public int findKeyword(String statement, String goal)
    {

        return findKeyword (statement, goal, 0);
    }



}