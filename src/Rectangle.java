public class Rectangle extends Figure{
    private Integer sideLength;
    private Integer  countSides;

    public Rectangle(String name, Integer sideLength, Integer countSides) {
        super(name);
        this.sideLength = sideLength;
        this.countSides = countSides;
    }

    public Rectangle(Integer sideLength, Integer countSides) {
        this.sideLength = sideLength;
        this.countSides = countSides;
    }

    @Override
    public Double getPerimeter() {
        return Double.valueOf(countSides*sideLength);
    }
}
