//Write a program to give a simple example for abstract class. 


public class AbstractClass {

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
        CS computer=new CS();
        ECE electri=new ECE();
        computer.branch();
        electri.branch();
	}

}

abstract class Engineering {
  abstract void branch();

class CS extends Engineering {
    
  // implementation of abstract method
  public void branch()
{
    System.out.println("Computer Scence Engineering");
  }
}

class ECE extends Engineering {
    
  // implementation of abstract method
  public void branch() 
  {
    System.out.println("Electrical and communication Engineering");
  }
}
}

