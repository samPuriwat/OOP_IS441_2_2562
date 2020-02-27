package Lab8;

public class Triangle extends GraphicObject {
    private double width;
    private double height;
    //constructor

    public Triangle(double width, double height) {
        this.width = width;
        this.height = height;
    }
    // findArea() เป็นเมธอดของ super-class และเป็น abstract method
    // ดังนั้น จึงต้องทำการ implement ใหม่ใน sub-class
    @Override
    void findArea() {
        double area = 05. * width * height;
        System.out.println("The area of triangle with width "
                +width+" and height "+height+" = "+area);
    }
    //getter and setter

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }
}//class
