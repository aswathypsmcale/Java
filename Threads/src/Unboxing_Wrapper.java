

//Java program to convert object into primitives  
//Unboxing example of Integer to int  

public class Unboxing_Wrapper{    
public static void main(String args[]){    
//Converting Integer to int    
//Integer a=new Integer(3);   
	Integer a=3;
float i=a.floatValue();//converting Integer to int explicitly  
float j=a;//unboxing, now compiler will write a.intValue() internally    
  
System.out.println(a+" "+i+" "+j);    
}}
