package InheritenceImp;

class A{
	int i;
	void display() {
		System.out.println(i);
	}
}
class B extends A{
	int j;
	void display() {

		System.out.println(j);
	}
}

public class Inheritence1 {
	public static void main(String[] args) {
		B obj = new B();
		obj.i = 2;
		obj.j = 1;
		obj.display();
	}
}
