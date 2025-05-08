import java.util.*;
public class Student {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Stud obj=new Stud();
		obj.putdata();

	}

}
   class Stud
   {
	   String name="John";
	   int id=2;
	   
	   void putdata()
	   {
		   System.out.println("The student name is " +name +" , "+ "id = "+id);
	   }
   }