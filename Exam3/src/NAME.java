

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class  NAME{

public static void main(String[] args){

String given="ASWATHY PS";


Pattern p1 = Pattern.compile("\\b[a-zA-Z]");
Matcher m1 = p1.matcher(given);
while (m1.find())
System.out.print(m1.group());


System.out.print(".");
}}