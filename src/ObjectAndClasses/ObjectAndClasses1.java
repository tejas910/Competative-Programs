package ObjectAndClasses;

class Triangle{
	int l , b, h;
	public Triangle(int l, int b , int h) {
		this.l = l;
		this.b = b;
		this.h = h;
	}
	public void area() {
		double area=0;
		double a= 0.5;
		try {
		area  = (b*h)*a;
		}catch(Exception e) {
			System.out.println("Enter the valid breadth and height");
		}
		System.out.println(area);
	}
	public void perimeter() {
		int perimeter = 0;
		perimeter = l + b + h;
		System.out.println(perimeter);
	}
}

public class ObjectAndClasses1 {
	public static void main(String[] args) {
		Triangle t = new Triangle(3,4,5);
		t.area();
		t.perimeter();

	}
}
