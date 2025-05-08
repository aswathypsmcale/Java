

public class First1  {
	   public static void main(String[] args) {
	      String name = "ASWATHY PS";
	      System.out.println("The full name is: " + name);
	     
	      int len = name.length();
	      name = name.trim();
	      String str1 = "";
	      for (int i = 0; i < len; i++) {
	         char ch = name.charAt(i);
	         if (ch != ' ') {
	        str1 = str1 + ch;
	         }else {
	            System.out.print(Character.toUpperCase(str1.charAt(0)) );
	            str1 = "";
	         }
	      }
	   
	   }   }


