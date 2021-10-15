package Array;
import java.util.Scanner;
public class PerimeterandArea {
  

	       public static void main(String[] args) {
	       Scanner s = new Scanner(System.in); 
	       double radius= s.nextDouble();
	       double perimeter;
	       double area;
	   	   double pi = Math.PI;
	   	if(radius==0.0 || radius<0.0){
	   	  System.out.println("please enter non zero positive number");
	   	}
	   	else{
	   	 perimeter = (2*pi*radius);
	   	  System.out.println(perimeter);
	   	}
	   	if(radius==0.0 || radius<0.0){
	   	  System.out.println("please enter non zero positive number");
	   	}
	   	else{
	   	 area = (pi*radius*radius);
	   	  System.out.println(area);
	   	}

  }
}
