
//Print the sum, difference and product of two complex numbers by creating a class named 'Complex'
//with separate methods for each operation whose real and imaginary parts are entered by user.?/*

		
		public class ComplexNum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       Complex no1=new Complex(4,5);
       Complex no2=new Complex(9,4);
       
       Complex sum=Complex.add(no1,no2);
       Complex sub=Complex.diff(no1,no2);
       Complex mult=Complex.product(no1,no2);
       sum.printcomplex();
       sub.printcomplex();
       mult.printcomplex();
       
	}

}

		class Complex
{
	int real;
	int img;
	public Complex(int r,int i)
	{
		real=r;
		img=i;
	}
	public static Complex add(Complex a,Complex b)
	{
		return new Complex((a.real+b.real),(a.img+b.img));
				
	}
	public static Complex diff(Complex a,Complex b)
	{
		return new Complex((a.real-b.real),(a.img-b.img));
	}
	public static Complex product(Complex a,Complex b)
	{
		return new Complex(((a.real*b.real)-(a.img*b.img)),((a.real*b.img)+(a.img*b.real)));
	}
	
	public void printcomplex()
	{
		if(real==0&&img!=0)
		{
			System.out.println(img+"i");
		}
		else if(img==0&&real!=0)
		{
			System.out.println(real);
		}
		else
		{
			System.out.println(real+"+"+img+"i");
		}
	}
	
}
