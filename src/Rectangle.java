public class Rectangle {
    double height;
    double width;

    Rectangle(){
        height = 1;
        width = 1;

    }
    Rectangle(double height,double width){
        this.height = height;
        this.width = width;
    }
    public double getArea(double height,double width){
        double areaOfRectangle = height * width;
        return  areaOfRectangle;
    }
    public double getPerimeter(double height, double width){
        double perimeterOfRectangle = 2*(height + width);
        return perimeterOfRectangle;
    }


}
