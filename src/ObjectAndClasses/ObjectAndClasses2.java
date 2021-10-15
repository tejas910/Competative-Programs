package ObjectAndClasses;

class Rectangle{
	int l,b;
	public Rectangle(int l, int b) {
		this.l = l;
		this.b = b;
	}
	public double area() {
		double area = 0.0;
		area = 2*l + 2*b;
		return area;
	}
}

public class ObjectAndClasses2 {
	public static void main(String[] args) {
		Rectangle r = new Rectangle(4,5);
		Rectangle r1 = new Rectangle(5,8);
		System.out.println(r.area());
		System.out.println(r1.area());
    }
}
