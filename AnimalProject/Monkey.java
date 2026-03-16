public class Monkey extends Mammal {
    private boolean prehensileTail;
    
    public Monkey(boolean tail) {
        super(true);
        prehensileTail = tail;
    }
    
    public String move() {
        return "swing";
    }
    
    public String toString() {
        return super.toString() + " and has prehensile tail? " + prehensileTail;
    }
}