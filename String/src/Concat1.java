/*Show two ways to concatenate the following two strings together to get the string "Hi, mom.":
String hi = "Hi, ";
String mom = "mom.";*/

public class Concat1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
   String hi = "Hi,  ";
   System.out.println("First String is:"+hi);
   String mom="mom.";
   System.out.println("Second String is:"+mom);
  String result=hi.concat(mom); 
  System.out.println("combined String is:"+result);
	}

}
