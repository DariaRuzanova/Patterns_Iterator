import java.util.Iterator;
import java.util.Random;

public class Randoms implements Iterable<Integer>, Iterator<Integer> {
    private final int min;
    private final int max;
    private final Random random;

    public Randoms(int min, int max) {
        this.min = min;
        this.max = max;
        random = new Random();

    }

    @Override
    public Iterator<Integer> iterator() {
        return this;
    }

    @Override
    public boolean hasNext() {
        return true;
    }

    @Override
    public Integer next() {
        return min + random.nextInt(max - min + 1);
    }
}
