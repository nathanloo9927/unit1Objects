import java.util.Random;

public class DiceRoll
{
    public static void main(String[] args)
    {
        Random generator = new Random();
        System.out.println("You rolled a " + (generator.nextInt(6) + 1));
    }
}