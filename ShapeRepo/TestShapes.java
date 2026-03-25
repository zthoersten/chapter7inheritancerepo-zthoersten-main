import TurtleGraphics.*;
import java.awt.Color;
import java.util.Scanner;

public class TestShapes {
    public static void main(String[] args) {
        StandardPen pen = new StandardPen();
        Scanner scanner = new Scanner(System.in);
        
        Wheel wheel = new Wheel(0, 0, 50, 5);
        wheel.draw(pen);
        
        wheel.move(-300, -300);
        wheel.stretchby(1.5);
        
        wheel.draw(pen);
    }
}