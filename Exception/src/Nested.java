

import java.util.Scanner;

import javax.security.auth.login.AccountException;
class UserExeption extends Exception{
UserExeption(String str){
super(str);
}

}

public class  Nested {

public static void main(String[]args)throws UserExeption{
try {
try {
double a=100/0;
System.out.println("divide by zero"+a);
}catch(Exception e) {System.out.println(e);}

}catch(Exception e) {System.out.println("main try");}
System.out.println("hello, enter your age");
Scanner sc=new Scanner(System.in);
int a=sc.nextInt();
if(a<=0) {
throw new UserExeption("invalid age");
}
else
System.out.println(a);
}

}
