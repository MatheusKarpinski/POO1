public class GeometricProgression extends Progression {
    private long base;

    public GeometricProgression(long base, long start) {
        super(start);
        this.base = base;
    }

    protected void advance() {
        current *= base;
    }
}