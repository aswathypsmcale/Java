
public class ConstructorOver {
	int id,year;
	String name,course,college;

	 ConstructorOver(int a,String b,String c)
	 {
		  id=a;
		  name=b;
		  course=c;
		  System.out.println("ID="+id+"  "+"NAME = "+name+"  "+"COURSE= "+course+"  "+"YEAR ="+year+" "+"COLLEGE="+college);
	 }
	 
	 ConstructorOver(int a,String b)
	 {
		 year=a;
		  college=b;
		  System.out.println("ID="+id+"  "+"NAME = "+name+"  "+"COURSE= "+course+"  "+"YEAR ="+year+" "+"COLLEGE="+college);
	 }
	
	public static void main(String[] args) {
		
		ConstructorOver method1=new ConstructorOver(101,"ASWATHY","MCA");
		ConstructorOver method2=new ConstructorOver(2018,"AJCE");
		

	}

}
