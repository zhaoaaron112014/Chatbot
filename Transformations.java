public class Transformations {

    public String Transform(String input) {
        String userInput = " " + input.toLowerCase() + " ";
        if (userInput.contains("'")) {
            if (userInput.contains(" i'm ")) {
                userInput = userInput.replaceAll("i'm", "i am");
            }
        } else {
            if (userInput.contains(" im ")) {
                userInput = userInput.replaceAll("im", "i am");
            }
        }
        return userInput.trim();
    }
}
