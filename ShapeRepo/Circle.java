import TurtleGraphics.Pen;

public class Circle extends Shape {
    private double radius;
    
    public Circle(double x, double y) {
        super(x, y);
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