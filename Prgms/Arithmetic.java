//Arithmetic operator
import java.util.Scanner;
class Arithmetic
{
   public static void main(String args[])
   {
      Scanner sc=new Scanner(System.in);
      int num1,num2;
      float result;
      char opr;
      System.out.println("Arithmetic operation");
      System.out.println("Enter the first number:");
       num1=sc.nextInt();
       System.out.println("Enter the second number:");
       num2=sc.nextInt();
       System.out.println("Enter operator:");
        opr =sc.next().charAt(0);
       switch(opr)
       {
          case '+':   result=num1+num2;
                            System.out.println("Sum = "+result);
                            break;
           case '-' :
                            result= num1-num2;
                            System.out.println(" sub = "+result);
                            break;
           case '*':
                            result=num1*num2;
                            System.out.println("product="+result);
                             break;
            case '/':
                           result=num1/num2;
                           System.out.println("div="+result);
                            break;
            default:
                            System.out.println("invalid");
                             break;
             }
}
}