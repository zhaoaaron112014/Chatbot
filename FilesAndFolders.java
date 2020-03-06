public class FilesAndFolders extends Helper{


    public String getFAFGreeting(){
        return "What would you like to know about Files and Folders?";
    }
    
    public String iAmResponse(String statement){
      for (int i = 0; i < save.length; i++) {
            if (statement.contains(create[i])) {
                returned = "to create a new file, go to files -> new project -> next -> and then save the file where you would like to.";

                return returned;
            }


    private String[] create = {
            "save"
    };
      }


