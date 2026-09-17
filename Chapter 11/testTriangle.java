import java.util.*;
class TestTriangle {
   public static void main(String[] args) {
       Scanner input = new Scanner(System.in);
       GeometricObject geometricObject = new GeometricObject();
       System.out.println("Enter side 1 ");
       double side1 = input.nextDouble();
       System.out.println("Enter side 2 ");
       double side2 = input.nextDouble();
       System.out.println("Enter side 3 ");
       double side3 = input.nextDouble();
       Triangle triangle = new Triangle(side1,side2,side3);
       System.out.println("What color is the Triangle ");
       String color = input.next();
       String findColor = triangle.setColor(color);
       String confirmColor = triangle.getColor();
       System.out.println("Is the Triangle filled (true or false) ");
       boolean filled = input.nextBoolean();
       boolean findFilled = triangle.setFilled(filled);
       boolean confirmFilled = triangle.isFilled();
       double findArea = triangle.getArea(side1, side2, side3);
       double findPerimeter = triangle.getPerimeter(side1, side2, side3);
       input.close();
       System.out.println("color is " + findColor);
       System.out.println("Filled property is " + findFilled);
       String printSides = triangle.toString(side1, side2, side3);
       System.out.println(printSides);
       String printTriangle = triangle.printTriangle();
       System.out.println(printTriangle);
   }
}
class GeometricObject {
   private String color;
   private boolean filled;
   private java.util.Date dateCreated;
   public GeometricObject(){
       dateCreated = new java.util.Date();
   }
   public GeometricObject(String color, boolean filled){
       this.color = color;
       this.filled = filled;
   }
   public String getColor() {
       return color;
   }
   public String setColor(String color) {
       this.color = color;
       return color;
   }
   public boolean isFilled() {
       return filled;
   }
   public boolean setFilled(boolean filled) {
       this.filled = filled;
       return filled;
   }
   public java.util.Date getDateCreated() {
       return dateCreated;
   }
   public double getArea(double side1, double side2, double side3){
       double area;
       double s;
       s = (side1 + side2+ side3) / 2;
       area = Math.sqrt(s*(s - side1)*(s - side2)*(s - side3));
       return area;
   }
   public double getPerimeter(double side1, double side2, double side3) {
       double perimeter;
       perimeter = side1 + side2 + side3;
       return perimeter;
   }
   public String toString(double side1, double side2, double side3) {
       return "Triangle: side1 = " + side1 + ", side2 = " + side2 + ", side3 = " + side3;
   }
}
class Triangle extends GeometricObject {
   private double side1;
   private double side2;
   private double side3;
   public Triangle(){
      
   }
   public Triangle(double side1, double side2, double side3) {
       this.side1 = side1;
       this.side2 = side2;
       this.side3 = side3;
   }
   public String printTriangle() {
       return "The Triangle was created " + getDateCreated() + ", color is " + getColor() + ", filled is " + isFilled() + ", area is " + getArea(side1, side2, side3) + ", and perimeter is " + getPerimeter(side1, side2, side3);
   }
}





