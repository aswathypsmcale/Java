
public class MethodOverride1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Student s=new Student();
		Faculty f=new Faculty();
		s.Stud_details("Aswathy",101);
		f.Fac_details("Nikhil","CS");

	}

}
class College
{
	String C_name="Amal Jyothi";
	String code="AJCE";
}
class Student extends College
{
	String S_name;
	int S_id;
	void Stud_details(String s,int i)
	{
		S_name=s;
		S_id=i;
		System.out.println("College Name:"+C_name);
		System.out.println("Student name:"+S_name);
		System.out.println("Student id :"+S_id);
	}
}
class Faculty extends College
{
	String F_name;
	String Dept;
	void Fac_details(String f,String D)
	{
		
		F_name=f;
		Dept=D;
		System.out.println("College Name"+C_name);
		System.out.println("College Code"+code);
		System.out.println("Faculty Name:"+F_name);
		System.out.println("Department:"+Dept);
	}
}
