

import java.io.*;  
class Depersist{  
 public static void main(String args[]){  
  try{  
  //Creating stream to read the object  
  ObjectInputStream in=new ObjectInputStream(new FileInputStream("f1.txt"));  
  Employee emp=(Employee)in.readObject();  
  //printing the data of the serialized object  
  System.out.println(emp.id+" "+emp.name);  
  //closing the stream  
  in.close();  
  }catch(Exception e){System.out.println(e);}  
 }  
}  