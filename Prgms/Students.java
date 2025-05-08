import java.util.Scanner;
 class Students
{
  public static void main(String args[])
{
 
 System.out.println("STUDENTS DETAILS");
 Student st = new Student();
 st.getdata();
 st.Putdata();
}
}
  class Student
{
 
      String sname;
      int sid;
     String course;
  
   void  getdata()
   {
     Scanner sc= new Scanner(System.in);
     System.out.println("Enter the student name:");
     sname=sc.nextLine();
     System.out.println("Enter student course:");
     course=sc.nextLine();
     System.out.println("Enter the student id:");
     sid=sc.nextInt();
    
    }
  void Putdata()
{
  System.out.println("Student Name:  "+sname);
  System.out.println("Student Id:  " +sid);
  System.out.println("Course  :"+course);
}
}
