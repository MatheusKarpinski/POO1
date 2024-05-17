public class ArithmeticProgression extends Progression {
    private long increment;

    public ArithmeticProgression(long increment, long start) {
        super(start);
        this.increment = increment;
    }

    protected void advance() {
        current += increment;
    }
}

