public class NumberGuesser{
    protected int low;
    protected int high;
    protected int mid;
    public NumberGuesser(int lowerBound, int upperBound) {
        low = lowerBound;
        high = upperBound;
    }

    public void higher(int nlow) {
        this.low = nlow;
    }

    public void lower(int nhigh) {
        this.high = nhigh;
    }

    public int getCurrentGuess() {
        mid = (low + high)/2;
        return mid;
    }

    public void reset() {
        low = 1;
        high = 100;
    }
}
