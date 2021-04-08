package hangman;

import java.util.*;
class Game
{
    void gaming(String words[])
    {
        Scanner sc=new Scanner(System.in);
        Random rd=new Random();
        ShowHangman sh=new ShowHangman();
        int rand;//random number
        String guess="";//letter entered by user
        String line ="";//the word to be guessed
        String upd="";//the blank spaces
        int i=0,sr=0;
        while (true)//game loop
        {
            int coun=10,c=0;//coun = chances left  c = counter
            i++;//counter
            rand=rd.nextInt(30);//rand = stores random number
            line=words[rand];//stores the word to be guessed
            upd="";//stores the blank spaces and correct letters guessed by the user
            int length=words[rand].length();//length of the word to be guessed
            String kpchk="";//keep a check for duplicate inputs
            for (int j=0;j<length;j++)//prints the initial number of blanks
            {
                if (j%2==0)
                {
                    upd=upd+"_";
                }
                else
                {
                    upd=upd+" ";
                }
            }
            while ((coun>0) && (upd.equals(line)==false))//loop maintaining 10 chances
            {
                c=0;
                kpchk=kpchk+guess;//store the letters already entered
                guess="";
                int z=0;
                int tempC=0;
                System.out.print("\u000c");
                do
                {
                    System.out.println(upd);//print the blanks and letters
                    System.out.println();
                    sh.show(coun);
                    System.out.println("\nEnter a letter to guess the word");
                    guess=sc.nextLine().toUpperCase().trim();
                    if (guess.isEmpty())//check if input is empty
                    {
                        System.out.println("Invalid entry! Blank entry not accepted.");
                        for (long k=0;k<50000000L;k++);
                        System.out.print("\u000c");
                        continue;
                    }
                    else if (guess.length()>1)//check if input is of more than one character
                    {
                        System.out.println("Error! Enter ONE character.");
                        for (long k=0;k<50000000L;k++);
                        System.out.print("\u000c");
                        continue;
                    }
                    else//check if input is anything except letters
                    {
                        z=(int)guess.charAt(0);
                        if ((z<65 || z>90))
                        {
                            System.out.println("Invalid input. Enter a LETTER.");
                            for (long k=0;k<50000000L;k++);
                            System.out.print("\u000c");
                            continue;
                        }
                    }
                    tempC=0;
                    for (int j=0;j<kpchk.length();j++)//check if letter has already been entered
                    {
                        if (guess.equals(Character.toString(kpchk.charAt(j))))
                        {
                            System.out.println("You have already entered that letter!");
                            tempC++;
                            for (long k=0;k<50000000L;k++);
                            System.out.print("\u000c");
                            break;
                        }
                    }
                }while (guess.length()>1 || (z<65 || z>90) || (tempC!=0));//end of loop to take input for a letter
                for (int k=0;k<length;k++)//check if letter is in the word
                {
                    if (Character.toString(line.charAt(k)).equals(guess))
                    {
                        upd=upd.substring(0,k)+guess+upd.substring(k+1);
                        c++;
                    }
                }
                if (c==0)//decrease one chance if a wrong letter is guessed
                {
                    coun--;
                }  
                System.out.print("\u000c");
                String wl="";
                if (upd.equals(line)==false && c>0)
                {
                     do//to let them guess the word at once
                     {
                         System.out.println(upd);//print the blanks and letters
                         System.out.println();
                         sh.show(coun);
                         System.out.println("\nWould you like to guess the whole word? (y/n)");
                         wl=sc.nextLine().trim();
                         if (!(wl.equalsIgnoreCase("y")) && !(wl.equalsIgnoreCase("n")))
                         {
                             System.out.println("Invalid entry");
                             for (long j=0;j<50000000L;j++);
                             System.out.print("\u000c");
                             c++;
                             continue;
                         }
                         break;
                     }while (true);
                     System.out.print("\u000c");
                     System.out.println(upd);
                     System.out.println();
                     sh.show(coun);
                     if (wl.equalsIgnoreCase("y"))
                     {
                         upd="";
                         int u=0;
                         System.out.println("\nEnter the word");
                         String gsswd=sc.nextLine().toUpperCase().trim();
                         for (int j=0;j<((gsswd.length()*2)-1);j++)
                         {   
                             if(j%2==0)
                             {
                                 upd=upd+gsswd.charAt(u);
                                 u++;
                             }
                             else
                             {
                                 upd=upd+" ";
                             }
                         }
                         if (upd.equals(line)==false)
                         {
                             coun=0;
                         }
                     }
                }
            }//end of while
            System.out.print("\u000c");
            if (upd.equals(line)==true)//if the word is guessed right
            {
                System.out.println("Yippee!! You got the word! You get "+coun+" points! ლ ( ◕  ᗜ  ◕ ) ლ");
                sr=sr+coun;
            }    
            else if (coun==0)// if the word is guessed wrong
            {
                System.out.println("Sorry! You lost! The word was "+line);
                System.out.println("You lost 5 points ☯﹏☯");
                sr=sr-5;
            }
            System.out.println("Your score is "+sr);
            String ex="";
            System.out.println("\nPress '0(zero)' to exit and anything else to continue");
            ex=sc.nextLine().trim();
            if (ex.equals("0"))
            {
                break;//exits from game loop
            }
            System.out.print("\u000c");
            System.out.print("Now on to the next word");//a short message
            for (long j=0;i<50000000L;i++);
            System.out.print("\u000c");
        }//end of for
        System.out.print("\u000c");
        do
        {
            System.out.println("You scored "+sr+" points!\n\nPress anything to exit");
            String ext=sc.nextLine().trim();
            if (ext.isEmpty())
            {
                System.out.println("Empty input not accepted");
                for (long k=0;k<50000000L;k++);
                System.out.print("\u000c");
                continue;
            }
            System.out.print("\u000c");
            break;
        }while (true);
    }
}
