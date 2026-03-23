import TurtleGraphics.*;
import java.awt.Color;
import java.util.Scanner;

public class TestShapes {
    public static void main(String[] args) {
        //declare and instantiate a pen and a circle
        Scanner scanner = new Scanner(System.in);
        StandardPen p = new StandardPen();
        //Shape s1 = new Circle(20, 20, 20);
        //Wheel w1 = new Wheel(30, 30, 50, 36);
        
        Square cube = new Square(10, 10, 85);
        cube.draw(p);
        
        //draw the circle
        //s1.draw(p);
        
        //display a description of the circle
        //System.out.println(s1);
        
        // pause until the user is ready to continue
        System.out.print ("Press any key to continue");
        int value = scanner.nextInt();
        
        //erase the circle
        p.setColor (Color.white);
        //s1.draw(p);
        
        //move the circle, change size and redraw
        p.setColor (Color.green);
        //s1.move(30,30);
        //s1.stretchby(2);
        //s1.draw(p);
        //w1.draw(p);
    }
}