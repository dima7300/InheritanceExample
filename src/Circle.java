public class Circle extends Figure {
    private Integer radius;
    public final static Double Pi = 3.14;

    public Circle(String name, Integer radius) {
        super(name);
        this.radius = radius;
    }

    public Circle(Integer radius) {
        this.radius = radius;
    }

    @Override
    public Double getPerimeter() {
        return Circle.Pi*2*this.radius;
    }
}
