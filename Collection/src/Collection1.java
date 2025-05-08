
import java.util.*;
class Collection1
{
public static void main(String args[])
{
ArrayList<String> Marklist=new ArrayList<String>();
ArrayList<String> Marklist4=new ArrayList<String>();
Marklist.add("this");
Marklist.add("is");
Marklist.add("lots");
Marklist.add("of");
Marklist.add("fun");
Marklist.add("for");
Marklist.add("every");
Marklist.add("Java");
Marklist.add("programmer");
Iterator<String> itr=Marklist.iterator();
while(itr.hasNext())
{
	String s1=itr.next();
	if(s1.length() == 4)
	{
		Marklist4.add("****");
	    Marklist4.add(s1);
	}
	else
	{
		Marklist4.add(s1);
	}
}
	Iterator<String> itr2=Marklist4.iterator();
	while(itr2.hasNext())
	{
		System.out.print(itr2.next()+" ");
     }
}
}

