import java.util.Scanner;
class Temperature
{
 public static void main(String args[])
 {
 Scanner input= new Scanner(System.in);
 System.out.println("input values in Fahrenheit:");
 Float temp= input.nextFloat();
  
  Float celsious = ((temp-32)*5/9);
 System.out.println("converting Fahrenheit to celsious="+celsious);
 }
}

