 class College
{
public static void main(String args[])
{
  Faculty fac;
  fac=new Faculty();
  fac.F_Id=10;
  fac.F_name="Meera";
  fac.Dept="CS";
  fac.display();
//Student stud;
//stud=new Student();
//stud.display();
}
}

class Faculty
{
   int F_Id;
   String F_name;
   String Dept;
  void display()
 {
  System.out.println(F_Id + " "+F_name +" "+Dept);
 }
}

/*class Student
{
  int S_id;
  String S_name;
  String S_couse;
  void display()
 {
   System.out.println(" inside student class");
  }
}*/
