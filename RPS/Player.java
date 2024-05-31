package RPS;
import java.util.Scanner;

public class Player implements RPSPlayer{
    private final Scanner scanner;
    
    public Player(Scanner scanner)
    {
        this.scanner = scanner;
    }

    public String play()
    {
        System.out.println("Choose (1) - Rock, (2) - Paper, and (3) - Scissors");
        int choice = this.scanner.nextInt();

        return choices[choice - 1];
    }
}
