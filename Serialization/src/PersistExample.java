
import java.io.*;      
 class Student implements Serializable{    
 int id;    
 String name;   
 String college;
 transient int age;//Now it will not be serialized    
 public Student(int id, String name,int age,String college) {    
  this.id = id;    
  this.name = name;    
  this.age=age;   
  this.college=college;
 }    
}    
class PersistExample{    
 public static void main(String args[])throws Exception{    
  Student s1 =new Student(211,"ravi",22,"AJCE");//creating object    
  //writing object into file    
  FileOutputStream f=new FileOutputStream("f.txt");    
  ObjectOutputStream out=new ObjectOutputStream(f);    
  out.writeObject(s1);    
  out.flush();    
  out.close();    
  f.close();    
  System.out.println("success");    
 } 
}