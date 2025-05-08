
public class INITIAL {

	public static void main(String[] args)
	{
		String name="Aswathy PS";
		lastname(name);
	}
static void lastname(String name)
{
	String words[]=name.split(" ");
	for(String word:words)
	{
		System.out.print(Character.toUpperCase(word.charAt(0))+" ");
		
	}
}

}
