
public class Truck extends Car {

    private int capacity = 0;

    public Truck(int passengerCount, char engineType, int capacity) {
        super(passengerCount, engineType);
        this.capacity = capacity;
    }

    public int getCapacity() {
        return capacity;
    }

    public void setCapacity(int capacity) {
        this.capacity = capacity;
    }
}