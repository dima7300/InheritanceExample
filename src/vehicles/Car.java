package vehicles;

public abstract class Car extends Object {
   protected String model;
   protected String category;
   protected Integer maxspeed;

    public Car(String model, String category, Integer maxspeed) {
        this.model = model;
        this.category = category;
        this.maxspeed = maxspeed;
    }

    public void getTime (Integer distance){
        System.out.println(distance / maxspeed);
    }

    public abstract void test(String str);
}
