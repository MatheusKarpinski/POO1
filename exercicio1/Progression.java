public class Progression {
    protected long current;

    public Progression(long first) {
        this.current = first;
    }

    protected void advance() {
        current++;
    }

    public long next() {
        long answer = current;
        advance();
        return answer;
    }

    public void reset() {
        current = 0;
    }
}



