//Parametersied constructor
public class P_Employee {
int empId;
String empName;
//parameterized constructor with two parameters
P_Employee(int id, String name){
this.empId = id;
this.empName = name;
}
void info(){
System.out.println("Id: "+empId+" Name: "+empName);
}
public static void main(String args[]){
P_Employee obj1 = new P_Employee(10245,"Chaitanya");
P_Employee obj2 = new P_Employee(92232,"Negan");
obj1.info();
obj2.info();
}
}
