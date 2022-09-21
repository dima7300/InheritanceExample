public class Figure extends FigureCalculation {
    protected String name = "Figure";

    public Figure(String name) {
        this.name = name;
    }

    public Figure() {
    }

    public String getNameOfFigure(){
        return name;
    }

    @Override
    public Double getPerimeter() {
        return null;
    }


    //    public Integer getPerimeter(){
//
//    }
}
