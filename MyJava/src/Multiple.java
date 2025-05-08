import java.util.Scanner;
public class Multiple {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

 Vehicle v1=new Vehicle();
 v1.getdata();
 v1.putdata();
 Vehicle v2=new Vehicle();
  v2.getdata();
  v2.putdata();
}
}
class Vehicle
{
String type;
  String name;
  String  owner;
 void getdata()
{
  Scanner sc=new Scanner(System.in);
  

 System.out.println("Enter vehicle type:");
 type=sc.nextLine();
  System.out.println("Enter vehicle name:");
 name=sc.nextLine();
System.out.println("Ente owner name:");
  owner=sc.nextLine();
}
void putdata()
{
  System.out.println("vehicle type= "+type);
 System.out.println("vehicle name=" +name);
System.out.println("vehicle owner="+owner);
}
}