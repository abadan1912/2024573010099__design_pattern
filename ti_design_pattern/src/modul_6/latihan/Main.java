package modul_6.latihan;

public class Main {
    public static void beginTrip(Vehicle vehicle, String destination) {
        vehicle.startEngine();  // Fails for bicycles!
        vehicle.navigateTo(destination);
    }

    public static void main(String[] args) {
        Vehicle car = new Car();
        Vehicle bike = new Bicycle();

        System.out.println("Car trip:");
        beginTrip(car, "Central Park");

        System.out.println("\nBike trip:");
        try {
            beginTrip(bike, "Central Park");  // Throws exception
        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}
