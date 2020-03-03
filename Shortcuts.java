public class Shortcuts extends Helper{
    public String ShortcutsIntro()
    {
        return "What type of shortcut would you like to use?";
    }

    public String Response(String x)
    {
        String response = "";

        if (findKeyword (x, "move") > 0)
        {
            response = "if you want to move a line to the end of the code, \t press END. \t if you want to move a line to the top of the code, \t press HOME.";
        }

        if (findKeyword (x, "delete") > 0)
        {
            response = "use the command \tctrl + Y\t to delete the current line you are on";
        }

        if (findKeyword (x, ("copy")) >= 0|| findKeyword(x,"duplicate")>= 0)
        {
            response = "Using \tctrl + D\t allows you to duplicate the chosen line ";
        }
        return response;

        //unfinished for editing and additions if above works
    }





}