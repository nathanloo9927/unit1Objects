import java.awt.*;

public class Turtle1
{
    public static void main(String[] args)
    {
        World turtleworld = new World();
        Turtle turtle1 = new Turtle(turtleworld);
        Turtle turtle2 = new Turtle(turtleworld);
        turtle1.penUp();
        turtle1.forward(100);
        turtle1.setPenColor(Color.BLACK);
        turtle1.penDown();
        turtle1.turn(-165);
        turtle1.forward(200);
        turtle1.turn(-140);
        turtle1.forward(200);
        turtle1.turn(-145);
        turtle1.forward(200);
        turtle1.turn(-145);
        turtle1.forward(200);
        turtle1.turn(-145);
        turtle1.forward(210);
        turtle2.penUp();
        turtle2.forward(100);
        turtle2.setPenColor(Color.BLUE);
        turtle2.penDown();
        turtle2.turn(180);
        turtle2.forward(200);
        turtle2.turn(180);
        turtle2.penUp();
        turtle2.forward(100);
        turtle2.turnRight();
        turtle2.forward(100);
        turtle2.penDown();
        turtle2.turn(180);
        turtle2.forward(200);
        turtle2.penUp();
        turtle2.turn(180);
        turtle2.forward(100);
        turtle2.turn(-135);
        turtle2.forward(100);
        turtle2.penDown();
        turtle2.turn(180);
        turtle2.forward(200);
        turtle2.penUp();
        turtle2.turn(180);
        turtle2.forward(100);
        turtle2.turnRight();
        turtle2.forward(100);
        turtle2.turn(180);
        turtle2.penDown();
        turtle2.forward(200);
    }
}
