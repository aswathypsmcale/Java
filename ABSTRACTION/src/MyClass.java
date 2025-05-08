/*Write a program to create interface A in this interface we have two
method meth1 and meth2. Implements this interface in another class
named MyClass.*/

interface MyInterface
{
   
   public void method1();
   public void method2();
}
class MyClass implements MyInterface
{
   
   public void method1()
   {
	System.out.println("implementation of method1");
   }
   public void method2()
   {
	System.out.println("implementation of method2");
   }
   public static void main(String arg[])
   {
	MyInterface obj = new MyClass();
	obj.method1();
   }
}