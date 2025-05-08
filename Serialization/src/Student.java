
import java.io.Serializable;  
public class Student implements Serializable{  
 int id;  
 String name; 
 String college;
 public Student(int id, String name,String college) {  
  this.id = id;  
  this.name = name; 
  this.college=college;
 }  
}  