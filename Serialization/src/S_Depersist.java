
import java.io.FileInputStream;
import java.io.ObjectInputStream;  
class S_Depersist{  
 public static void main(String args[]){  
  try{  
  //Creating stream to read the object  
  ObjectInputStream in=new ObjectInputStream(new FileInputStream("f.txt"));  
 Student s1=(Student)in.readObject();  
  //printing the data of the serialized object  
  System.out.println(s1.id+" "+s1.name+" "+s1.age+""+s1.college);  
  //closing the stream  
  in.close();  
  }catch(Exception e){System.out.println(e);}  
 }  
}  

