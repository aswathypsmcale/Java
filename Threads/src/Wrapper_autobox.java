

public class Wrapper_autobox{  
public static void main(String args[])
{  
//Converting int into Integer  
int a=20;  
Integer i=Integer.valueOf(a);//converting int into Integer explicitly  
Integer j=a;
//autoboxing, now compiler will write Integer.valueOf(a) internally  
  
System.out.println(a+" "+i+" "+j); 

float f= 10;
Float d= Float.valueOf(f);//converting int into Integer explicitly  
Float c= f;
//autoboxing, now compiler will write Integer.valueOf(a) internally  
  
System.out.println(f+" "+d+" "+c); 

Character gfg = 'a';

// Auto-unboxing of Character
char ch = gfg;
System.out.println("Value of ch: " + ch);
System.out.println("Value of gfg: " + gfg);
}}
