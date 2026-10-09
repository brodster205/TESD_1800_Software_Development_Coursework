import java.util.Scanner;
class testTriangle3 {
  public static void main(String[] args){
    Scanner input = new Scanner(System.in);
    boolean isColor = false;
      Triangle[] triangle = {
          new Triangle(0, 12.5, 15.8, 18.2, isColor),
          new Triangle(1, 14.8, 13.9, 19.5, isColor),
          new Triangle(2, 20.1, 17.7, 15.2, isColor),
          new Triangle(3, 19.9, 14.2, 16.3, isColor),
          new Triangle(4, 18.4, 20.7, 16.5, isColor)
      };
      String printTriangle = triangle.toString();
      
      System.out.println(printTriangle);
      for (int i = 0; i < 5; i++){
        System.out.println("For triangle " + i + triangle[i].toString());
        System.out.println("Is triangle " + i + " colorable? ");
        isColor = input.nextBoolean();
        if (isColor == true){
            triangle[i].howToColor();
        }
      }
      input.close();
  }
}
abstract class GeometricObject{
  private String color;
  private boolean filled;
  protected GeometricObject(){
  }
  protected GeometricObject(String color, boolean filled){
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
  public abstract String toString();
  public abstract double getArea();
}
class Triangle extends GeometricObject implements Colorable{
  private double side1;
  private double side2;
  private double side3;
  private int number;
  public Triangle(){




  }
  public Triangle(int number, double side1, double side2, double side3, boolean filled){
      this.side1 = side1;
      this.side2 = side2;
      this.side3 = side3;
      this.number = number;
  }
  public int getNumber(){
    return number;
  }
  public void setNumber(int number){

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
      double area = Math.sqrt(s*(s - side1)*(s - side2)*(s-side3));
      return area;
  }
  @Override
  public String toString(){
      return " the area is: " + getArea();
  }
  @Override
  public void howToColor(){
      System.out.println("Color all three sides ");
  }
}