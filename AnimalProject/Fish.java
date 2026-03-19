public abstract class Fish extends Animal {
    private boolean hasScales;
    
    public Fish() {
        super("fish");
        hasScales = false;
    }
    
    public Fish(boolean scales) {
        super("fish");
        hasScales = scales;
    }
    
    public boolean hasScales() {
        return hasScales;
    }
    
    public String toString() {
        return super.toString() + "\nThis is a fish.";
    }
}