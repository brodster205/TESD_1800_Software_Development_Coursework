import java.util.Scanner;
class testOctagon {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("The Octagon sides are all the same");
        System.out.println("Enter side 1 ");
        double side1 = input.nextDouble();
        System.out.println("Enter side 2 ");
        double side2 = input.nextDouble();
        System.out.println("Enter side 3 ");
        double side3 = input.nextDouble();
        System.out.println("Enter side 4 ");
        double side4 = input.nextDouble();
        System.out.println("Enter side 5 ");
        double side5 = input.nextDouble();
        System.out.println("Enter side 6");
        double side6 = input.nextDouble();
        System.out.println("Enter side 7");
        double side7 = input.nextDouble();
        System.out.println("Enter side 8 ");
        double side8 = input.nextDouble();
        Octagon octagon = new Octagon(side1, side2, side3, side4, side5, side6, side7, side8);
        Octagon octagon2 = (Octagon)octagon.clone();
        System.out.println(octagon.compareTo(octagon2) + " The Octagons are equal");
        input.close();
    }
}
abstract class GeometricObject{
    public abstract double getArea();
}
class Octagon extends GeometricObject implements Cloneable, Comparable<Octagon>{
    private double side1;
    private double side2;
    private double side3;
    private double side4;
    private double side5;
    private double side6;
    private double side7;
    private double side8;
    public Octagon(){

    }
    public Octagon(double side1, double side2, double side3, double side4, double side5, double side6, double side7, double side8){
        this.side1 = side1;
        this.side2 = side2;
        this.side3 = side3;
        this.side4 = side4;
        this.side5 = side5;
        this.side6 = side6;
        this.side7 = side7;
        this.side8 = side8;
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
    public double getSide4(){
        return side4;
    }
    public void setSide4(double side4){
        this.side4 = side4;
    }
    public double getSide5(){
        return side5;
    }
    public void setSide5(double side5){
        this.side5 = side5;
    }
    public double getSide6(){
        return side6;
    }
    public void setSide6(double side6){
        this.side6 = side6;
    }
    public double getSide7(){
        return side7;
    }
    public void setSide7(double side7){
        this.side7 = side7;
    }
    public double getSide8(){
        return side8;
    }
    public void setSide8(double side8){
        this.side8 = side8;
    }
    @Override
    public double getArea(){
        double area;
        area = (2 * 4/Math.sqrt(2) * side1 * side1);
        return area; 
    }
    @Override
    public Object clone(){
        try{
            Object octagonClone = super.clone();
            return octagonClone;
        }
        catch (CloneNotSupportedException ex){
            return null;
        }
    }
    @Override
    public int compareTo(Octagon o){
        if (this.getArea() > o.getArea()){
            return 1;
        }
        else if (this.getArea() < o.getArea()){
            return -1;
        }
        else{
            return 0;
        }
    }
}