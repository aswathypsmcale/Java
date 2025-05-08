

import java.util.Scanner;
class Anagram {
 public static void main(String[] args) {
 System.out.println("enter the first string:");
Scanner sc=new Scanner(System.in);
String a=sc.nextLine();
System.out.println("enter the second string:");
String b=sc.nextLine();
   if(checkAnagram(a, b))
     System.out.println("Anagram");
   else
     System.out.println("Not an Anagram");

 }
 public static boolean checkAnagram(String a, String b){
   StringBuffer sb = new StringBuffer(b);

   for(int i=0; i<a.length(); i++){
     sb.deleteCharAt(sb.indexOf(a.charAt(i)+""));
   }
   if(sb.length() == 0)
    return true;
   else
     return false;
 }
}