public class FibonacciProgression extends Progression {
    private long prev;

    public FibonacciProgression(long first, long second) {
        super(first);
        this.prev = second - first;
    }

    protected void advance() {
        long temp = prev;
        prev = current;
        current += temp;
    }
}