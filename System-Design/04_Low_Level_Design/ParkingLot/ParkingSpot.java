public class ParkingSpot {
    private boolean isFree = true;
    public boolean isFree() { return isFree; }
    public void occupy() { isFree = false; }
    public void free() { isFree = true; }
}