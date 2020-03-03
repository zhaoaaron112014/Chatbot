import java.util.ArrayList;

public class Helper {
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

    public int findKeyword(String statement, String goal)
    {

        return findKeyword (statement, goal, 0);
    }

    public String reduceContractions(String statement){
        String returned = "";
        ArrayList<String> words = new ArrayList<String>();
        statement = statement.toLowerCase();
        int index = 0;


        for (int i = 0; i < statement.length(); i ++){
            if (statement.substring(i, i+1).equals(" ")){

                words.add(statement.substring(index, i));
                index = i+1;

            }
        }
        if (words.size() == 0){
            words.add(statement);

        }
        for (int i = 0; i < words.size(); i++) {
            if (findKeyword(words.get(i), "don't") >= 0){

                words.remove(i);
                words.add(i, "do not");

            } else if(findKeyword(words.get(i), "i'm") >= 0){

                words.remove(i);
                words.add(i, "i am");

            }

            returned = returned +" " +  words.get(i);

        }

        return returned;




    }


}
