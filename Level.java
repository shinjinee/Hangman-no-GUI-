package hangman;

import java.util.*;
public class Level
{
    void choice()
    {
        Scanner sc=new Scanner(System.in);
        int ch=0;
        do
        {
            try
            {
                System.out.println("Which level do you want to play?\n1. BEGINNER \n2. INTERMIDIATE \n3. ADVANCED\nPlease enter the level number 1, 2 or 3");
                ch=sc.nextInt();
                if (ch!=1 && ch!=2 && ch!=3)
                {
                    System.out.println("Invalid choice");
                    for (long i=0;i<500000000L;i++);
                    System.out.print("\u000c");
                    continue;
                }
            }
            catch (Exception e)
            {
                System.out.println("Invalid choice");
                for (long i=0;i<500000000L;i++);
                System.out.print("\u000c");
                sc.nextLine();
                continue;
            }
            break;
        }while(true);
        String words1[]={"A P P L E","C A S I N O","M A N G O","M A R B L E","T H I E F","K N I F E","H E A R T","G U E S S","D O U B T","P L E A S E","S H I R T","S K I R T","A F R A I D","G L A S S","N E V E R","C L E A R","J I N G L E","C H A R M","G E N T L E","T R E A T","B E T T E R","M O M E N T","E M O T I O N","T A I L O R","S W I F T","S U P E R","G R A S S","B R E A K","T H I N K","T H I R T Y","G O O S E"};
        String words2[]={"I N C R E D I B L E","F A S C I N A T E D","S P E C T A T O R","E X T R E M E","H A L L O W E E N","D A Z Z L I N G","C O N C E N T R A T E","N A T U R A L L Y","M A J E S T I C","F I C T I T I O U S","E N G A G I N G","I N T E N S E","C H I L D R E N","S T R A N G E R","D I S A S T E R","C O R P O R A L","D A Y D R E A M","C R O W B A R","B E N E A T H","D R A M A T I C","C O M P L E T E","S P E C T R U M","I G N O R A N T","P O T R A I T","B A C K S T A G E","R E G I S T E R","T R U M P E T","G U I T A R","V I O L I N","E M B A R A S S"}; 
        String words3[]={"L E V I T A T E","P E R S P E C T I V E","C U R A T O R","P A R A F F I N","S U B D U E","S M O U L D E R","M E N A C E","H O S T A G E","M I M I C K","C A M O U F L A G E","C H A N D E L I E R","U N I V E R S A L","S Y N D R O M E","C O L O G N E","D I N O S A U R","H Y M N","D I L E M M A","R H Y T H M","A C O U S T I C","G O S S I P","I R R E S I S T I B L E","P I N E A P P L E","T H R I L L I N G","C O M P U T E R","R E C O V E R Y","D E F E N D E R","H U R R I C A N E","P O L A R O I D","S O R C E R E R","C R I M S O N"};
        Game gm=new Game();
	System.out.print("\u000c");
	switch (ch)
        {
            case 1:gm.gaming(words1);
		break;
	    case 2:gm.gaming(words2);
		break;
            case 3:gm.gaming(words3);
		break;
        }
    }
}
