public abstract class Mammal extends Animal {
    private boolean hair;
    
    public Mammal() {
        super("mammal");
        hair = true;
    }
    
    public Mammal(boolean hair) {
        super("mammal");
        this.hair = hair;
    }
    
    public String toString() {
        return super.toString() + " and has hair? " + hair;
    }
}