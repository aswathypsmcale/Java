class TestOverloading1
{
public static void main(String[] args){
System.out.println(Sum.add(11,11));
System.out.println(Sum.add(11,11,11));
System.out.println(Sum.add(10.5,20.5,5.5));
}
}
class Sum{
static int add(int a,int b)
{
return a+b;
}
static int add(int a,int b,int c)
{
return a+b+c;
}
static float add(float a,float b,float c)
{
return a+b+c;
}
}
