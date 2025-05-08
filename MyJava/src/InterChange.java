
public class InterChange {
	 int a;
	 InterChange(int a)
	 {
		 this.a=a;
	 }
   public void display(InterChange i1,InterChange i2)
   {
	   int temp=i1.a;
	   i1.a=i2.a;
	   i2.a=temp;
	   System.out.println("i1="+i1.a +"  "+"i2="+i2.a);
   }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
       InterChange i1=new InterChange(100);
       InterChange i2=new InterChange(200);
       System.out.println("Before interchange i1.a="+i1.a);
       System.out.println("Before interchange i2.a="+i2.a);
       i1.display(i1,i2);
	}

}
