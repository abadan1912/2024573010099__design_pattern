package modul_6.latihan.Solusi;

public class Car extends Vehicle implements EngineVehicle {
    @Override
    public void startEngine() {
        System.out.println("Car engine started");
    }

    @Override
    public void navigateTo(String destination) {
        System.out.println("Calculating Car route to " + destination);
        System.out.println("Following Car route to " + destination);
    }
}

