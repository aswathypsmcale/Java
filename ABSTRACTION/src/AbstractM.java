
//Write a java program to implement abstract methods and abstract classes
 class AbstractM {

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		Bank b;  
		b=new SBI();  
		System.out.println("Rate of Interest is: "+b.getRateOfInterest()+" %");    
		b=new PNB();  
		System.out.println("Rate of Interest is: "+b.getRateOfInterest()+" %");    

	}

}
abstract class Bank
{    
abstract int getRateOfInterest();    
}    
   class SBI extends Bank
  {    
   int getRateOfInterest()
   {
	return 7;
   }    
   }    
class PNB extends Bank
{    
int getRateOfInterest()
{
	return 8;
}    
}    
    
    