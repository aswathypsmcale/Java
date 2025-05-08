import java.util.ArrayList;
import java.util.Iterator;

public class SwapArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 ArrayList<String>list1=new ArrayList<String>();
		 ArrayList<String> list2=new ArrayList<String>();
		 ArrayList<String>list3=new ArrayList<String>();
         
		 list1.add("four");
		 list1.add("score");
		 list1.add("and");
		 list1.add("seven");
		 list1.add("years");
		 list1.add("ago");
		 
		 list2.add("to");
		 list2.add("be");
		 list2.add("or");
		 list2.add("not");
		 list2.add("to");
		 list2.add("be");
		 list2.add("hamlet");
		 
		 Iterator<String> itr=list1.iterator();
			while(itr.hasNext())
			{
				String a=itr.next();
				try
				   {
					String b=itr.next();
				    list3.add(b);
				     list3.add(a);
			       }
			       catch(Exception e)
			        {
				      list3.add(a);
			         }
			 }
			Iterator<String>itr2=list3.iterator();
			while(itr2.hasNext())
			{
				System.out.println(itr2.next()+" ");
			}
			System.out.println();
			Iterator<String> itr1=list2.iterator();
			while(itr1.hasNext())
			{
				String a=itr1.next();
				try
				   {
					String b=itr1.next();
				    list3.add(b);
				     list3.add(a);
			       }
			       catch(Exception e)
			        {
				      list3.add(a);
			         }
			 }
			Iterator<String>itr3=list3.iterator();
			while(itr3.hasNext())
			{
				System.out.println(itr3.next()+" ");
			}
	}

}
