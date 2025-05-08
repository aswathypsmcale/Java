import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

class S_Employee implements Serializable
{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	int id;    
	 String name;    
	 S_Employee(int id, String name) 
	 {    
	  this.id = id;    
	  this.name = name;    
	 }    
}
class Shop extends S_Employee
{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	String shop_name;    
	 int salary;    
	 public Shop(int id, String name, String shop_name, int salary)
	 {    
	  super(id,name);    
	  this.shop_name=shop_name;    
	  this.salary=salary;    
	 }    
}

public class EmployeeISA
{

	public static void main(String[] args)
	{
		// TODO Auto-generated method stub
		Shop s1 =new Shop(501,"ASWATHY","LULU",500);    
		  //Creating stream and writing the object    
		  FileOutputStream fout=new FileOutputStream("shop.txt");    
		  ObjectOutputStream out=new ObjectOutputStream(fout);    
		  out.writeObject(s1);    
		  out.flush();    
		  //closing the stream    
		  out.close();    
		  System.out.println("success");    
	}catch(Exception e){System.out.println(e);}    
	
	try{    
		  //Creating stream to read the object    
		  ObjectInputStream in=new ObjectInputStream(new FileInputStream("shop.txt"));    
		  Students s=(Students)in.readObject();    
		  //printing the data of the serialized object    
		  System.out.println(s.id+" "+s.name+" "+s.shop_name+" "+s.salary);    
		  //closing the stream    
		  in.close();    
		  }catch(Exception e){System.out.println(e);}    
		 }    
		}  

	}


