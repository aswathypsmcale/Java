
public class StringComparison {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String s1="Aswathy";
		String s2="Aswathy";
		String s3=new String("Aswathy");
		String s4="Revathy";
		System.out.println(s1.equals(s2));
		System.out.println(s1.equals(s3));
		System.out.println(s1.equals(s4));
		String s5="aswathy";
		System.out.println(s1.equals(s5));
		
		System.out.println(" Using == operator");
		
		System.out.println(s1==s2);
		System.out.println(s1==s3);
		System.out.println(s1==s4);
		System.out.println(s1==s5);
		
		System.out.println("By Using compareTo() method");
		System.out.println(s1.compareTo(s2));
		System.out.println(s1.compareTo(s4));
		System.out.println(s1.compareTo(s3));
		System.out.println(s1.compareTo(s5));




	}

}
