package RPS;
import java.util.Random;

public class CPU implements RPSPlayer{
    
    private final Random rnd;
    
    public CPU(Random rnd)
    {
        this.rnd = new Random();

    }
    

    public String play()
    {
        return choices[this.rnd.nextInt(choices.length)];
    }
}
