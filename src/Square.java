public class Square extends Figure {
    private Integer sideLength;
    private Integer countSides;

    public Square(String name, Integer sideLength, Integer countSides) {
        super(name);
        this.sideLength = sideLength;
        this.countSides = countSides;
    }

    public Square(Integer sideLength, Integer countSides) {
        this.sideLength = sideLength;
        this.countSides = countSides;
    }

    @Override
    public String getNameOfFigure() {
        return this.name + " Square";
    }
}
