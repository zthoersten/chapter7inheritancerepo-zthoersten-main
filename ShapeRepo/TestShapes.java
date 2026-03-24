import TurtleGraphics.*;
import java.awt.Color;
import java.util.Scanner;

public class TestShapes {
    public static void main(String[] args) {
        StandardPen pen = new StandardPen();
        Scanner scanner = new Scanner(System.in);
        
        Polygon shape = new Polygon(0, 0, 200, 16);
        shape.draw(pen);
        
        System.out.print("Press any key to continue");
        scanner.nextLine();
    }
}