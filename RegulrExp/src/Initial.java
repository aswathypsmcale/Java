

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Initial{

public static void main(String[] args){

String given="John";
String middle="Fitzgerald";
String family="Kennedy";

Pattern p1 = Pattern.compile("\\b[a-zA-Z]");
Matcher m1 = p1.matcher(given);
while (m1.find())
System.out.print(m1.group());
System.out.print(".");

Pattern p2 = Pattern.compile("\\b[a-zA-Z]");
Matcher m2 = p2.matcher(middle);
while (m2.find())
System.out.print(m2.group());
System.out.print(".");

Pattern p3 = Pattern.compile("\\b[a-zA-Z]");
Matcher m3 = p3.matcher(family);
while (m3.find())
System.out.print(m3.group());
System.out.println();
}
}