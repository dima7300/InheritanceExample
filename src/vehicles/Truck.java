package vehicles;

public class Truck extends Car  {
    Integer loadCapacity;
    public Truck(String model, String category, Integer maxspeed, Integer loadCapacity) {
        super(model, category, maxspeed);
        this.loadCapacity = loadCapacity;
    }
}
