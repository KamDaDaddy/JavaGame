package RPS;

import java.util.Random;
import java.util.Scanner;

public class RockPaperScissors {
    
    private static boolean playAgain(Scanner scanner)
    {
        System.out.println("");
        System.out.println("Try again? y(8) / n(9)");
        switch (scanner.nextInt()) {
            case 8:
                System.out.println("Rock, Paper, Scissors!");
                return true;
    
            default:
                System.out.println("Thank you for playing!! See you later :)");
                return false;
        }

    }
    
    
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        RPSPlayer comp = new CPU(new Random());
        RPSPlayer player = new Player(scanner);
        
        String r1 = "echo";
        System.out.println("Welcome to Rock Paper Scissors made by DUMDUM :)");
        System.out.println("Type 'echo' to begin!");
        r1 = scanner.nextLine();

        if (r1.equals("echo")) {
            System.out.println("");

        do
        {
            String cpu = comp.play();
            String player1 = player.play();
        
                System.out.printf("%s vs. %s", cpu, player1);
                if (player1.equals(cpu)) {
                    System.out.println("");
                    System.out.println("It's a tie!");
                }
                else if (("Rock".equals(player1) && "Scissors".equals(cpu)) || ("Scissors".equals(player1) && "Paper".equals(cpu)) || ("Paper".equals(player1) && "Rock".equals(cpu)))
                {
                    System.out.println("");
                    System.out.println("You win!! :)");
                }
                else {
                    assert (("Rock".equals(cpu) && "Scissors".equals(player1)) || ("Scissors".equals(cpu) && "Paper".equals(player1)) || ("Paper".equals(cpu) && "Rock".equals(player1)));
                    System.out.println("");
                    System.out.println("Aww You lose!");
                }

            } while (playAgain(scanner));
        
        }
        else {
            System.out.println("Invalid input. Please try again.");
        }
        
    }
}

