

/*Create an interface Shape with methods read() ,display() and volume().
create two classes cylinder and cube implementing the interface.*/

import java.util.*;
public class Shape {
	 Scanner sc=new Scanner(System.in);
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
   Cylinder obj=new Cylinder();
   obj.read(); 
   obj.volume();
   obj.display();
	}

}
interface Shape1
{
    void read();
    void display();
    void volume();
}
class Cube implements Shape1
{
    int a=0;  
    double volume;
    public void read()
    {
    	Scanner sc=new Scanner(System.in);
        System.out.println("Enter the side of cube :");
        a = sc.nextInt();
        
    }
    public void volume()
    {
        volume=a*a*a;
        
    }
   
    public void display()
    {
    	System.out.println("Volume of a cube:"+volume);	
    }
}
class Cylinder extends Cube
{
    double pie=3.14;
    int r,h;
  
    public void read()
    
    {
        super.read();
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the radius of cylinder:");
        r=sc.nextInt();
        System.out.println("Enter the height of cylinder:");
        h=sc.nextInt();
    }
    public void volume()
    {
        super.volume();
        
        volume=pie*r*r*h;
        
    }
    public void display()
    {
    	System.out.println("volume of a cylinder:"+volume);
    }
}
