public class TokenBucketRateLimiter {
    private int tokens;
    private final int capacity;

    public TokenBucketRateLimiter(int capacity) {
        this.capacity = capacity;
        this.tokens = capacity;
    }

    public synchronized boolean allowRequest() {
        if(tokens > 0) {
            tokens--;
            return true;
        }
        return false;
    }
}