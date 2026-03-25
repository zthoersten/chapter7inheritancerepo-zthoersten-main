import TurtleGraphics.Pen;

public class Wheel extends Circle {
    private double radius;
    private int spokes;
    
    public Wheel(double x, double y, double r, int spokes) {
        super(x, y, r);
        radius = r;
        this.spokes = spokes;
    }

    public void draw(Pen p) {
        double side = 2.0 * Math.PI * radius / 120.0;
        p.up();
        p.move(xPos + radius, yPos - side / 120.0);
        p.setDirection(90);
        p.down();
        
        for (int i = 0; i < 120; i++) {
            p.move(side);
            p.turn(3);
        }
        
        double angle = 360.0 / spokes;
        for (int i = 0; i < spokes; i++) {
            p.up();
            p.move(xPos, yPos);
            p.setDirection(angle * i);
            p.down();
            p.move(radius);
        }
    }

    public double getRadius() {
        return this.radius;
    }
    
    public double getArea() {
        return Math.PI * radius * radius;
    }
    
    public void move(double x, double y) {
        xPos = x;
        yPos = y;
    }
    
    public void stretchby(double factor) {
        radius *= factor;
    }
}
