package Lab8;

public class Circle extends GraphicObject {
    final static double PI = 3.141;
    private double radius;

    //constructor
    public Circle(double radius) {
        this.radius = radius;
    }

    @Override
    void findArea() {
        double area = PI * radius * radius;
        System.out.println("The area of circle with  "
                +this.radius+" radius = "+area);
    }
    //getter and setter

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }
}
