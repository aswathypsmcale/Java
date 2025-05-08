/*Create a regular expression that accepts alphanumeric characters only.  
Its length must be six characters long only?*/


import java.util.regex.*;
public class Regular1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      System.out.println("Aphanumeric with 6 character");
      System.out.println(Pattern.matches("[a-zA-Z0-9]{6}","aswathy"));
      System.out.println(Pattern.matches("[a-zA-Z0-9]{6}","aswathy123"));
      System.out.println(Pattern.matches("[a-zA-Z0-9]{6}","ammu12"));
    		  	
	}

}
