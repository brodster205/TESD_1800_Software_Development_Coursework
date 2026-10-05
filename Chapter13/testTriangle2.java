import java.util.Scanner;
class testTriangle2{
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.println("Enter side 1 ");
        double side1 = input.nextDouble();
        System.out.println("Enter side 2 ");
        double side2 = input.nextDouble();
        System.out.println("Enter side 3 ");
        double side3 = input.nextDouble();
        Triangle triangle = new Triangle(side1, side2, side3);
        System.out.println("what color is the triangle ");
        String color = input.next();
        String findColor = triangle.setColor(color);
        String confirmColor = triangle.getColor();
        System.out.println("is the triangle filled (true or false) ");
        boolean filled = input.nextBoolean();
        boolean findFilled = triangle.setFilled(filled);
        boolean confirmFilled = triangle.isFilled();
        String printTriangle = triangle.toString();
        System.out.println(printTriangle);
    }
}
abstract class geometricObject{
    private String color;
    private boolean filled;
    protected geometricObject(){

    }
    protected geometricObject(String color, boolean filled){
        this.color = color;
        this.filled = filled;
    }
    public String getColor(){
        return color;
    }
    public String setColor(String color){
        this.color = color;
        return color;
    }
    public boolean isFilled(){
        return filled;
    }
    public boolean setFilled(boolean filled){
        this.filled = filled;
        return filled;
    }
    public String toString(){
        return "color is " + color + ", and filled is " + filled;
    }
    public abstract double getArea();
    public abstract double getPerimeter();
}
class Triangle extends geometricObject{
    private double side1;
    private double side2;
    private double side3;
    public Triangle(){

    }
    public Triangle(double side1, double side2, double side3){
        this.side1 = side1;
        this.side2 = side2;
        this.side3 = side3;
    }
    public double getSide1(){
        return side1;
    }
    public void setSide1(double side1){
        this.side1 = side1;
    }
    public double getSide2(){
        return side2;
    }
    public void setSide2(double side2){
        this.side2 = side2;
    }
    public double getSide3(){
        return side3;
    }
    public void setSide3(double side3){
        this.side3 = side3;
    }
    @Override
    public double getArea(){
        double s = (side1 + side2 + side3) / 2;
        double area = Math.sqrt(s*(s - side1)*(s - side2)*(s - side3));
        return area;
    }
    @Override
    public double getPerimeter(){
        double perimeter = side1 + side2 + side3;
        return perimeter;
    }
    @Override
    public String toString(){
        return super.toString() + ", area: " + getArea() + ", perimeter: " + getPerimeter();
    }
}