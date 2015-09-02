import java.awt.*;

public class Turtle1
{
    public static void main(String[] args)
    {
        World turtleworld = new World();
        Turtle turtle = new Turtle(turtleworld);
        turtle.setPenColor(Color.BLACK);
    }
}