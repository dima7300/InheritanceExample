package vehicles;

public class ElectricityCar extends Car {
    Double timeCharge;

    public ElectricityCar(String model, String category, Integer maxspeed, Double timeCharge) {
        super(model, category, maxspeed);
        this.timeCharge = timeCharge;
    }

    @Override
    public void getTime(Integer distance) {
        if (distance > 300){
            System.out.println(Double.parseDouble(distance.toString()) / Double.parseDouble(maxspeed.toString()) + timeCharge);
        } else {
            System.out.println(Double.parseDouble(distance.toString()) / Double.parseDouble(maxspeed.toString()));
        }

    }

    @Override
    public void test(String str) {
        System.out.println("Hello from abstarct method!");
    }
}
