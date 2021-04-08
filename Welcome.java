package hangman;

import java.util.*;
public class Welcome
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        while (true)
        {
            System.out.println("THE INCREDIBLE WORD GAME");
            String pr="";
            int c=0;
            do
            {
                System.out.println("Enter 'p' to play and 'r' for rules and 'q' to quit");
                pr=sc.nextLine().trim();
                if (!(pr.equalsIgnoreCase("p")) && !(pr.equalsIgnoreCase("r")) && !(pr.equalsIgnoreCase("q")))
                {
                    System.out.println("Invalid entry");
                    for (long i=0;i<500000000L;i++);
                    System.out.print("\u000c");
                    c++;
                    break;
                }
            }while (false);
            if (c>0)
            {
                continue;
            }
            if (pr.equalsIgnoreCase("p"))
            {
                Loading ld=new Loading();
                ld.load();
                Level lv=new Level();
                lv.choice();
                continue;                
            }
            else if (pr.equalsIgnoreCase("r"))
            {
                Rules rl=new Rules();
                rl.rles();
            }   
            else
            {
                System.out.print("\u000c");
                break;
            }
        }
    }
}

