
/*Write a program to create a package named mypack and import it in circle
class. ?*/
/*public class Circle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}*/


import mypack.mypack;
import java.util.*;
public class Circle extends mypack {

public static void main(String[] args) {
// TODO Auto-generated method stub
Circle obj = new Circle();
System.out.println("Enter the radius of a circle");
Scanner sc = new Scanner(System.in);
int a=sc.nextInt();
System.out.println("Area of the circle is "+(obj.Area(5)));
}



}





