package classes;

public class Circle extends Shape {
	public double getArea(double radius) {
		double Area = Math.PI * (radius*radius);
		System.out.println("Area of circle: " + Area);
		return Area;
	}
	public double getPerimeter(double a) {
		double Perimeter = 2 * Math.PI * a;
		System.out.println("Perimeter of circle: " + Perimeter);
		return Perimeter;
	}
}
