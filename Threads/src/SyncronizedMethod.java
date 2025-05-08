

class Table{
synchronized void printTable(int n){//method not synchronized
for(int i=1;i<=5;i++){
System.out.println(n*i);
try{
Thread.sleep(900);
}catch(Exception e){System.out.println(e);}
}
}
}
class MyThread_A extends Thread{
Table t;
MyThread_A (Table t){
this.t=t;
}
public void run(){
t.printTable(3);
}
}class MyThread_B extends Thread{
Table t;
MyThread_B (Table t){
this.t=t;
}
public void run(){
t.printTable(5);
}
}
class SyncronizedMethod{
public static void main(String agrs[]){
Table tab=new Table();
MyThread_A ta=new MyThread_A(tab);
MyThread_B tb=new MyThread_B(tab);
ta.start();
tb.start();
}
}
