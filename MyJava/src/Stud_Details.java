import java.util.*;
public class Stud_Details {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
     Students s1=new Students();
      s1.getdata();
      
      Students s2=new Students();
      s2.putdata();
	  
	}
}
   class Students
   {
	   int roll;
	   double phone;
	   String addr;
	   String stud1="KIRAN";
	   String stud2="Rahul";
	 Scanner sc=new Scanner(System.in);
	   void getdata()
	   {
		   System.out.println("KIRAN Details");
		   System.out.println("Enter roll number: ");
		   roll=sc.nextInt();
		   System.out.println("Enter phone number: ");
		   phone=sc.nextDouble();
		   System.out.println("Enter Address: ");
		   addr=sc.next();
		   
		   System.out.println("student name ="+stud1+"Rollnum =" + roll +"phone ="+phone+"address= "+addr);
	   }
	   void putdata()
	   {
		   System.out.println("Rahul Details");
		   System.out.println("Enter roll number: ");
		   roll=sc.nextInt();
		   System.out.println("Enter phone number: ");
		   phone=sc.nextDouble();
		   System.out.println("Enter Address: ");
		   addr=sc.next();
		   
		   System.out.println("student name ="+stud2+"Rollnum =" + roll +"phone ="+phone+"address= "+addr);
	   }
   }

