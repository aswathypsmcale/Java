//Write a program to create automatic type conversions apply to overriding.?

public class Type_conversion
{
	int a;
	void sample(float a)
	{
		System.out.println(a);
		
	}
public static void main(String[] args) {
		
		// TODO Auto-generated method stub
		Type_conversion T=new Type_conversion();
		T.a=4;
		T.sample(T.a);
		//T.sample(20);
	}
	
}
class Type extends Type_conversion
{
	void sample(float a)
	{
		System.out.println(a);
		//float f=b;
		//System.out.println(b);
	}

}
