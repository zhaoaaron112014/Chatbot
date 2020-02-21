public class ErrorMessages extends MagpieMain{


    public String getEMGreeting(){
        return "What would you like to know about Error Messages?";
    }

    public String getEMResponse(String statement){
        String response  = "";
        if (findKeyword(statement, "incompatible types") >= 0){
            response = "The incompatible types error message will occur when an assignment statement tries to pair a variable with an expression of types.\nTo fix this, change the variable type.";
        }else{
            return getEMGreeting();
        }


        return response;
    }

}
