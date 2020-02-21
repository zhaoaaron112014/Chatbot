public class CreateAndOpen extends MagpieMain{

    public String getCAOGreeting(){
        return "What would you like to know about Creating and Opening projects?";
    }

    public String getCAOResponse(String statement){
        String response = "";
        if (findKeyword(statement, "create")>= 0 || findKeyword(statement, "new")>= 0){
            response = "To create a new project, click File > New> Project.\nNext, select Java and any additional libraries you need, before clicking Next.\n" +
                    "If you have a template to use, select the option, then click Next.\nThen, select the folder you would like to put your project in, before clicking Finish.";
        }
        return response;


    }



}
