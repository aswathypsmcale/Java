import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;    
class Person implements Serializable{    
 /**
	 * 
	 */
	private static final long serialVersionUID = 1L;
int id;    
 String name;    
 Person(int id, String name) {    
  this.id = id;    
  this.name = name;    
 }    
}    
class Students extends Person{    
 /**
	 * 
	 */
	private static final long serialVersionUID = 1L;
String course;    
 int fee;    
 public Students(int id, String name, String course, int fee) {    
  super(id,name);    
  this.course=course;    
  this.fee=fee;    
 }    
}    
public class SerializeISA  
{    
 public static void main(String args[])  
 {    
    try{    
  //Creating the object    
  Students s1 =new Students(501,"ASWATHY","MCA",50000);    
  //Creating stream and writing the object    
  FileOutputStream fout=new FileOutputStream("stud.txt");    
  ObjectOutputStream out=new ObjectOutputStream(fout);    
  out.writeObject(s1);    
  out.flush();    
  //closing the stream    
  out.close();    
  System.out.println("success");    
  }catch(Exception e){System.out.println(e);}    
  try{    
  //Creating stream to read the object    
  ObjectInputStream in=new ObjectInputStream(new FileInputStream("stud.txt"));    
  Students s=(Students)in.readObject();    
  //printing the data of the serialized object    
  System.out.println(s.id+" "+s.name+" "+s.course+" "+s.fee);    
  //closing the stream    
  in.close();    
  }catch(Exception e){System.out.println(e);}    
 }    
}  