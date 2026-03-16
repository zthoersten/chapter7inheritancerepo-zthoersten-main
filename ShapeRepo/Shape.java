import TurtleGraphics.Pen;

public abstract class Shape {
    private double xPos, yPos;

    public Shape(double x, double y) {}

    // you must write these methods here
    public double getXpos() {
        return this.xPos;
    }
    
    public double getYpos() {
        return this.yPos;
    }
    
    //public void move(double xLoc, double yLoc);
    // increase the size by the factor
    //public void stretchby (double factor);

    public abstract double getArea();

    public abstract void draw (Pen p);

    //toString should display xpos, ypos
    public String toString() {
        return "(" + this.xPos + ", " + this.yPos + ")";
    }
}