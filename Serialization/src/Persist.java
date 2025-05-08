
import java.io.FileOutputStream;
import java.io.ObjectOutputStream;    
public class Persist{    
 public static void main(String args[]){    
  try{    
  //Creating the object    
  Employee emp=new Employee(211,"ravi");    
  //Creating stream and writing the object    
  FileOutputStream fout=new FileOutputStream("f1.txt");    
  ObjectOutputStream out=new ObjectOutputStream(fout);    
  out.writeObject(emp);    
  out.flush();    
  //closing the stream    
  out.close();    
  System.out.println("success");    
  }catch(Exception e){System.out.println(e);}    
 }    
}    
