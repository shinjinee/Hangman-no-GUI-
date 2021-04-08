package hangman;

import java.util.*;
public class Rules
{
    public void rles()
    {
        public Scanner sc=new Scanner (System.in);
        System.out.print("\u000c");
        public String bk="";
        do
        {
	    System.out.println("<Rules>");
            System.out.println("\nEnter 'b' to go back");
            bk=sc.nextLine().trim();
            if (!(bk.equalsIgnoreCase("b")))
            {
                System.out.println("Invalid entry");
 				for (long i=0;i<500000000L;i++);
                System.out.print("\u000c");
            }
        }while (!(bk.equalsIgnoreCase("b")));
        System.out.print("\u000c");
    }
}
