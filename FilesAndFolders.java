public class FilesAndFolders extends Helper{


    public String getFAFGreeting(){
        return "What would you like to know about Files and Folders?";
    }
    
    public String iAmResponse(String statement){
      for (int i = 0; i < save.length; i++) {
            if (statement.contains(save[i])) {
                returned = "If you would like to know how to save your document, click the Save button, and then choose where you would like to put your file";

                return returned;
            }


    private String[] save = {
            "save"
    };
      }


