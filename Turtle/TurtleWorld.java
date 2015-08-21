import java.awt.Color;

public class TurtleWorld
{
    public static void main(String args[])
    {
        World turtleWorld = new World();
        Turtle turtle = new Turtle(turtleWorld);
        turtle.setPenColor(Color.RED);
        turtle.penDown();
        turtle.forward(50);
        turtle.turnRight();
        turtle.forward(50);
        turtle.turnLeft();
        turtle.forward(50);
        turtle.turnLeft();
        turtle.forward(55);
        turtle.penUp();
        turtle.backward(5);
        turtle.turnLeft();
        turtle.forward(119);
        turtle.penDown();
        turtle.forward(1);
        turtle.penUp();
}
