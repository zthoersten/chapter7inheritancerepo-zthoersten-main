import TurtleGraphics.Pen;

public class Square extends Shape {
    private int length;
    
    public Square(double x, double y, int length) {
        super(x, y);
        this.length = length;
    }
    
    public double getArea() {
        return length * length;
    }
    
    public void draw(Pen pen) {
        for (int i = 0; i < 4; i++) {
            pen.move(length);
            pen.turn(90);
        }
    }
}