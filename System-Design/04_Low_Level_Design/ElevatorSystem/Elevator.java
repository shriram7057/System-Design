import java.util.concurrent.PriorityBlockingQueue;

public class Elevator {
    private int currentFloor = 0;
    private PriorityBlockingQueue<Integer> requests = new PriorityBlockingQueue<>();

    public void requestFloor(int floor) {
        requests.add(floor);
    }
}