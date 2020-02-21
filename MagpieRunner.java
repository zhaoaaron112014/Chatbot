import java.io.File;
import java.util.Scanner;

/**
 * A simple class to run the Magpie class.
 * @author Laurie White
 * @version April 2012
 */
public class MagpieRunner
{

    /**
     * Create a Magpie, give it user input, and print its replies.
     */
    public static void main(String[] args)
    {
        MagpieMain maggie = new MagpieMain();

        ErrorMessages EM = new ErrorMessages();
        FilesAndFolders FAF = new FilesAndFolders();
        Shortcuts SC = new Shortcuts();
        CreateAndOpen CAO = new CreateAndOpen();

        System.out.println (maggie.getGreeting());
        Scanner in = new Scanner (System.in);
        String statement = in.nextLine();

        while (!statement.equals("Bye"))
        {
            if (statement.equals("1")){
                System.out.println(EM.getEMGreeting());
                statement = in.nextLine();
                while (!statement.equals("2") && !statement.equals("3") && !statement.equals("4")){
                    System.out.println(EM.getEMResponse(statement));
                    statement = in.nextLine();
                }
            }else if (statement.equals("2")){
                System.out.println(FAF.getFAFGreeting());
                statement = in.nextLine();
            }else if (statement.equals("3")){
                System.out.println(SC.getSCGreeting());
                statement = in.nextLine();
            }else if (statement.equals("4")){
                System.out.println(CAO.getCAOGreeting());
                statement = in.nextLine();
            }else {
                System.out.println(maggie.getResponse(statement));
                statement = in.nextLine();
            }
        }
        in.close();
    }

}
