//Write a program to give the example for ‘super’ keyword?


public class Super1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Dog d=new Dog();
		d.printcolor();

	}

}

class Animal
{
	String color="black";
}

class Dog extends Animal
{
	String color="white";
	void printcolor()
	{
		System.out.println("Dog colour is : "+color);
		System.out.println("Animal color is : "+super.color);
		
	}
}