import TurtleGraphics.Pen;

public class Polygon extends Shape {
    private int length, numSides;
    
    public Polygon(double x, double y, int length, int numSides) {
        super(x, y);
        this.length = length;
        this.numSides = numSides;
    }
    
    public double getArea() {
        return 0.25 * numSides * length * length / Math.tan(Math.PI / numSides);
    }
    
    public void draw(Pen pen) {
        for (int i = 0; i < numSides; i++) {
            pen.move(length);
            pen.turn(360.0 / numSides);
        }
    }
    
    public void move(double xPos, double yPos) {
        this.xPos = xPos;
        this.yPos = yPos;
    }
    
    public void stretchby(double factor) {
        length *= factor;
    }
}