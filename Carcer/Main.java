import java.io.*;
import java.util.*;
/**
 * Runs all the classes through here
 * 
 * @author (Kevin Sweitzer) 
 * @version (3/19/18)
 */
public class Main
{
    private Scanner user;
    private CLS cls;

    private int menuAns;

    Main()
    {
        user = new Scanner(System.in);
        cls = new CLS();

        menuAns = 0;
    }

    public int getMenuAns()
    {
        menuAns();
        return menuAns;
    }

    private void menuAns()
    {
        while(true)
        {
            System.out.println("1. Continue Character");
            System.out.println("2. Create New Character");
            System.out.print("Menu Answer: ");
            menuAns = user.nextInt();

            if(menuAns == 1 || menuAns == 2)
            {
                break;
            }
            else
            {
                String[] arr = {""};
                try 
                {
                    try
                    {
                        cls.main(arr);
                    }
                    catch (IOException e)
                    {
                        System.out.println(e);
                    }
                }
                catch (InterruptedException e) 
                {
                    System.out.println(e);
                }
            }
        }
    }

}
