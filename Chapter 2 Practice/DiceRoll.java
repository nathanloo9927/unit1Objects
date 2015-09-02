import java.util.Random;

public class DiceRoll
{
    public static void main(String[] args)
    {
        // Option A
        Random generator = new Random();
        //int dieValue = generator.nextInt(6);
        //dieValue += 1;
        System.out.println("You rolled a " + (generator.nextInt(6) + 1)); 
        // (or)
        //System.out.println(dieValue);
        // This is if I did a random generator in a variable
        
        // Option B
        double dieValue2 = Math.random(); // returns [0, 1)
                                          // Remember! closed = inclusive, open = exclusive!
        dieValue2 *= 6; // returns [0, 6)
        dieValue2 += 1; // returns [1, 7)
        System.out.println("You rolled a " + (int) dieValue2);
    }
}