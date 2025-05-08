import java.util.*;

/**
 * @author aswat
 *
 */
public class Myobject {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
         
         Myclass myObj=new Myclass();
         myObj.getdata();
	}
}
    class Myclass{

        Scanner sc=new Scanner(System.in);
        int x;
	  void getdata()
	  {
		  System.out.println("Enter the value x:");
		  x=sc.nextInt();
		  System.out.println("The value of x is:"+x);
	  }
}
