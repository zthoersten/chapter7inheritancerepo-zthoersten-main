public class Goldfish extends Fish {
    public Goldfish() {
        super(true);
    }
    
    public String move() {
        return "swim";
    }
    
    public String toString() {
        return super.toString() + "\nIt's a fish, and it's gold. Therefore, it's a goldfish.";
    }
}