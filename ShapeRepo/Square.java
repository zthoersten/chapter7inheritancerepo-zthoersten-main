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
        pen.up();
        pen.move(xPos, yPos);
        pen.setDirection(0);
        pen.down();
        for (int i = 0; i < 4; i++) {
            pen.move(length);
            pen.turn(90);
        }
        pen.up();
    }
    
    public void move(double xPos, double yPos) {
        this.xPos = xPos;
        this.yPos = yPos;
    }
    
    public void stretchby(double factor) {
        length *= factor;
    }
}