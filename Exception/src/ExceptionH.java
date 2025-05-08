

import java.util.Scanner;
class MyException extends Exception{
	MyException(String s){
		super(s);
	}
}

public class ExceptionH {

	public static void main(String[] args) throws MyException{
		// TODO Auto-generated method stub
		try {
	         int a[] = {1,2,3,4,5};
	        
	         System.out.println("Element at index 7 = "+a[7]);
	        
	         try {
	            System.out.println("Division by zero");
	            int res = 100/ 0;
	         }
	         catch (ArithmeticException e) {
	            System.out.println(e);
	         }
	      }
	      catch (ArrayIndexOutOfBoundsException e) {
	         System.out.println("ArrayIndexOutOfBoundsException");
	         System.out.println("Enter your age:");
	         Scanner sc=new Scanner(System.in);
	         int a=sc.nextInt();
	         try {
	         if(a<18) {
	        	 throw new MyException("Not eligible to license");
	         }
	         }catch(Exception e1)
	         {System.out.println(e1);}
	         finally {
	        	 System.out.println("eligible");
	         
	      }
	        	 
	      }
	   }
	
	}