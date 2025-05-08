

public class StaticX {
	   static int a,b;
	   static {
	      System.out.println("loaded Static Method");
	      a=10;
	      b=5;
	      System.out.println("static variables are:"+a+"and "+b);
	   }
	static void sum(){
	       System.out.println("loaded static method");
	       int sum;
	       sum=a+b;
	       System.out.println("sum is:"+sum);
	}
	public static void main(String[] args) {
	    sum();
	 }
	}
