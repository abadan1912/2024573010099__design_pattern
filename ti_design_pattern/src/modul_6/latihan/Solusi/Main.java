package modul_6.latihan.Solusi;

public class Main {
    public static void beginMotorizedTrip(EngineVehicle vehicle, String destination) {
        vehicle.startEngine();
        vehicle.navigateTo(destination);
    }

    public static void beginTrip(Navigable vehicle, String destination) {
        vehicle.navigateTo(destination);
    }

    public static void main(String[] args) {
        Car car = new Car();
        Bicycle bike = new Bicycle();

        System.out.println("=== Car Trip ===");
        beginMotorizedTrip(car, "Central Park");

        System.out.println("\n=== Bike Trip ===");
        beginTrip(bike, "Central Park");
    }
}

