import vehicles.Car;
import vehicles.Truck;
import vehicles.ElectricityCar;

import java.util.ArrayList;

public class InheritanceExample {
    public static void main(String[] args) {
//        ArrayList<Figure> figures = new ArrayList<>();
//        Cat cat = new Cat();
//        Figure circle = new Circle(3);
//        Figure square = new Square(3, 4);
//        Figure rectangle = new Rectangle(3, 3);
//        Figure figure = new Figure();
//        System.out.println(figure.getNameOfFigure());
//        System.out.println(circle.getNameOfFigure());
//        System.out.println(square.getNameOfFigure());


//        figures.add(circle);
//        figures.add(square);
//        figures.add(rectangle);
//        figures.add(figure);
//
//        for (Figure fig: figures){
//            System.out.println(fig.getNameOfFigure());
//            System.out.println(fig.getPerimeter());
//        }
        ArrayList<Car> cars = new ArrayList<>();
        ElectricityCar electricityCar = new ElectricityCar("Tesla", "B", 300, 2.0);
        Truck truck = new Truck("Kamaz","D", 100,5000);
        cars.add(electricityCar);
        cars.add(truck);
        for (Car car: cars){
            car.getTime(1000);
        }
    }
}
