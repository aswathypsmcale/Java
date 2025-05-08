/*Create a regular expression that accepts 10 digit numeric characters 
  starting with 7, 8 or 9 only*/
import java.util.regex.*;
public class numeric {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
    
		System.out.println(Pattern.matches("[789][0-9]{9}", "9987541261"));
		 System.out.println(Pattern.matches("[789]\\d{9}", "8856231470")); 
	}

}
