
//Write a program for reuse class. For this program use the above ‘room class’ program.?



public class ReuseClass
{
House r2;
	void createhouse()
	{
	 r2=new House();
    }
	void sethouse()
	{
		r2.setdata(30,"karthika");	
		r2.getdetails();
	}
	public static void main(String[] args) 
	{
		
		// TODO Auto-generated method stub
		ReuseClass ru=new ReuseClass();
		House h=new House();
		h.setdata(25,"Souparnika");	
		h.getdetails();
		ru.createhouse();
		ru.sethouse();
	}	
 
}
class House
{
	int Hno;
	String Hname;
	
	void setdata(int h,String name)
	{
		this.Hno=h;
		this.Hname=name;
	}
	 void getdetails()
	 {
		 System.out.println("House number:"+Hno+" "+"House Name:"+Hname);
	 }
}
