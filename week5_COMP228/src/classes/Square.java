package classes;

public class Square extends Shape {
	
	private double length;
	
	public Square() {
	}
	
	public Square(double length) {
		this.length = length;
	}
	
	public double getArea(double length) {
		double Area = length * length;
		System.out.println("Area of square: " + Area);
		return Area;
	}
	public double getPerimeter(double a) {
		double Perimeter = a * 4;
		System.out.println("Perimeter of square: " + Perimeter);
		return Perimeter;
	}
}
