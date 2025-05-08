/*Create class box and box3d. box3d is extended class of box. The above
two classes going to pull fill following requirement?
? Include constructor.
? set value of length, breadth, height
? Find out area and volume.
Note: Base class and sub classes have respective methods and instance
variables. 
*/
class Box
{
private int length;
private int breadth;
public Box ( )
{
length =0;
breadth =0;
}
public Box (int x, int y)
{
length = x;
breadth =y;
}
public void setval (int x, int y)
{
length = x;
breadth = y;
}
public int area ( )
{
return (length * breadth);
}
}
class Box3D extends Box
{
private int height;
public Box3D ( )
{
super ( );
height = 0;
}
public Box3D(int x, int y, int z)
{
super (x, y);
height = z;
}
public void setval (int x, int y, int z)
{
super.setval(x, y);
height = z;
}
public int volume ( )
{
return (super.area ( ) * height );
}
public static void main(String arga [ ])
{
Box b1 = new Box ( );
Box b4 = new Box (10,20 );
Box3D b2 = new Box3D(12,34,18);
b1.setval (25,30);
Box3D b3 = new Box3D();
b3.setval (3,4,5);
System.out.println ("The area of b1 is : " + b1.area( ) );
System.out.println ("The volume of b2 is : "+ b2.volume ( ));
System.out.println ("The volume of b3 is : "+ b3.volume ( ));
System.out.println ("The area of b4 is : " + b4.area( ) );
}
}
