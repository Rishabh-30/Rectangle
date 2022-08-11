public class RectangleImp {
    public static void main(String[] args) {
        Rectangle object = new Rectangle(4, 40);

        System.out.println("Area of Rectangle : " + object.getArea(4, 40));
        System.out.println("Perimeter of rectangle = " + object.getPerimeter(4, 40));

        Rectangle object1 = new Rectangle(3.5, 35.9);

        System.out.println("Area of Rectangle : " + object1.getArea(3.5, 35.9));
        System.out.println("Perimeter of rectangle = " + object1.getPerimeter(3.5, 35.9));

        Rectangle object2 = new Rectangle();

        System.out.println("Area of Rectangle : " + object2.getArea(object2.width, object2.height));
        System.out.println("Perimeter of rectangle = " + object2.getPerimeter(object2.width, object2.height));


    }

}