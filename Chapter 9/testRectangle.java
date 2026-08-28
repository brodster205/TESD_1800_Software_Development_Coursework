import java.awt.*;


public class testRectangle {
	public static void main(String[] args) {
		Rectangle rectangle1 = new Rectangle(4, 40);
		System.out.println("The area and perimeter of rectangle1 " + "4, 40" + " are " + rectangle1.getArea() + " and " + rectangle1.getPerimeter());
		Rectangle rectangle2 = new Rectangle(3.5, 35.9);
		System.out.println("The area and perimeter of rectangle2 " + "3.5, 35.9" + " are " + rectangle2.getArea() + " and " + rectangle2.getPerimeter());
	}
	
}


class Rectangle {
		double width;
		double height;
		Rectangle(){
			
		}
	Rectangle(double width1, double height1){
		width = width1;
		height = height1;
	}
	double getArea(){
		return width * height;
	}
	double getPerimeter(){
		return 2 * (width + height);
	}
	
}