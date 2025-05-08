/*Create a package that has an interface which contains methods insert delete and display and a static final variable size. 
Create another package that contains a class called Queue which is implementing the interface.*/

package Package2;
import Package1.Interface1;
public class Queue {
	public static void main(String args[]) {
		A a = new A();
		a.insert();
		a.delete();
		a.display();
		B b = new B();
		b.insert();
		b.delete();
		b.display();
		
	}

}
class A implements Interface1 {
	public void insert() {
		
		System.out.println(A.size);
	}
	public void delete() {
		System.out.println("delete");
	}
	public void display() {
		System.out.println("display");
	}
	
}

class B implements Interface1 {
	public void insert() {
	
	//B.size = 12;
		System.out.println(B.size);
		System.out.println("insert");
	}
	public void delete() {
		System.out.println("delete");
	}
	public void display() {
		System.out.println("display");
	}
}

