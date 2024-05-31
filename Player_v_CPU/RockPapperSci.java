package Player_v_CPU;
import java.util.*;

public class RockPapperSci {
    
    
    @SuppressWarnings("null")
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        String readText = sc.nextLine();
        Random rnd = new Random();

        //Player controls for the rock paper and scissor selection
        final int rock = 1;
        final int paper = 2;
        final int scissors = 3;
        int Userinput = sc.nextInt();
        int randomNum = rnd.nextInt(3 - 1 + 1) + 1;
        
        
        String r1 = "echo";
        System.out.println("Welcome to rock paper scissors made by DUMDUM :)");
        System.out.println("Type 'echo' to begin!");
        sc.nextLine();

        if (readText.equals(r1)) {
            System.out.println("");
        }
        else {
            System.out.println("Please type 'echo'");
            sc.nextLine();
        }
        

    /* 
        Player Logic
        This is assumed that the CPU will choose rock
    */
        if (Userinput == rock) {
            System.out.println("Rock v Rock, IT'S A TIE!");
        }
        else if (Userinput == paper)
        {
            System.out.println("Rock v Paper, You win!");
        }
        else if (Userinput == scissors)
        {
            System.out.println("Rock v Scissors, You lose!");
        }

        




    }
}

