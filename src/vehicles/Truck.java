package vehicles;

public class Truck extends Car  {
    Integer loadCapacity;
    public Truck(String model, String category, Integer maxspeed, Integer loadCapacity) {
        super(model, category, maxspeed);
        this.loadCapacity = loadCapacity;
    }

    @Override
    public void test(String str) {
        System.out.println("Hello from Truck!");
    }

    public void truckMethod(){
        System.out.println("Hello from truck method");
    }
}
