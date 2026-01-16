import java.util.*;

public class ParkingLot {
    private List<ParkingSpot> spots;

    public ParkingLot(int size) {
        spots = new ArrayList<>(size);
        for(int i=0;i<size;i++) spots.add(new ParkingSpot());
    }

    public synchronized boolean parkVehicle(Vehicle v) {
        for(ParkingSpot s : spots) {
            if(s.isFree()) {
                s.occupy();
                return true;
            }
        }
        return false;
    }
}