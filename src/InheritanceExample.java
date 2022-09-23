import vehicles.Car;
import vehicles.Truck;
import vehicles.ElectricityCar;

import java.util.ArrayList;

public class InheritanceExample {
    public static void main(String[] args) {

        ArrayList<Car> cars = new ArrayList<>();
        ElectricityCar electricityCar = new ElectricityCar("Tesla", "B", 300, 2.0);
        Truck truck = new Truck("Kamaz","D", 100,5000);
        cars.add(electricityCar);
        cars.add(truck);
        for (Car car: cars){
            car.getTime(1000);
            car.test("");
            if (car instanceof Truck){
                ((Truck) car).truckMethod();
            }
        }

        Car car = new Car("","", 4) {

            public String r;
            @Override
            public void getTime(Integer distance) {
                super.getTime(distance);
            }

            @Override
            public void test(String str) {

            }
        };


    }
}
