public class TestVolume {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Volume cube=new Volume(5);
		Volume cylinder=new Volume(6,10);
		Volume cuboid=new Volume(10,5,4);

	}
}
	
class Volume 
	{
		
		double V_Cylinder,radius,height,pie=3.14;
		int s,V_Cube;
		double v_cuboid,height1,length,breadth;
		Volume(int s)
		{
			V_Cube=s*s*s;
			System.out.println("Volume of Cube ="+V_Cube);
		}
		
		Volume(double radius,double height)
		{
			V_Cylinder=pie*radius*radius*height;
			System.out.println("Volume of Cylinder ="+V_Cylinder);
		}
		
		Volume(double length,double breadth,double height1)
		{
			v_cuboid=length*breadth*height1;
			System.out.println("Volume of cuboid ="+ v_cuboid);
		}
		 
}

