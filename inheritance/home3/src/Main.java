
public class Main {

    public static void main(String[] args) {

        Truck truck = new Truck(4, 'D', 5000);

        System.out.println("Passenger Count: " + truck.getPassengerCount());
        System.out.println("Engine Type: " + truck.getEngineType());
        System.out.println("Capacity: " + truck.getCapacity());
    }
}