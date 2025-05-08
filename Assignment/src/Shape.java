
public class Shape {
	String colour;
	 boolean filled;
	void Shape() 
	{
		colour="green";
		filled=true;
		
	}
	void Shape(String col,boolean fil) 
	{
		filled = fil;
	      colour = col;
	}
	

	public String getColour() {
		return colour;
	}
	public void setColour(String colour) {
		this.colour = colour;
	}
	public boolean isFilled() {
		return filled;
	}
	public void setFilled(boolean filled) {
		this.filled = filled;
	}
	public String toString() {
		return ("A Shape with "+this.colour+"and"+this.filled);
		
	}

	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Circle cl=new Circle();
		Rectangle rg=new Rectangle("blue", true, 10, 5);
		cl.Circle(5);
		cl.Circle("blue", false, 5);
		cl.Shape("white", true);
		rg.Rectangle(10, 5);
		rg.getArea();
		rg.Shape("Green", true);
		System.out.println(rg.toString());
		System.out.println(cl.toString());
		
	}

}
class Circle extends Shape{
	double radius;
	void Circle() {
		
		radius=1.0;
	}
	void Circle(double rad) {
		
		
		this.radius=rad;
	}
	void Circle(String colour,boolean fill,double rad) {
		this.colour=colour;
		this.filled=fill;
		this.radius=rad;
	}
	public double getRadius() {
		return radius;
	}
	public void setRadius(double radius) {
		this.radius = radius;
	}
	public void getArea() {
		double pi=3.14;
		double area=(pi*(this.radius*this.radius));
		System.out.println(area);
	}
	public void getPerimeter() {
		double pi=3.14;
		double peri=(2*pi*this.radius);
		System.out.println(peri);
	}
	public String toString() {
		return ("A circle with radius"+this.radius+"which is a subclass of"+super.toString());
		
	}
}
class Rectangle extends Shape{
	double width;
	double length;
	void Rectangle() {
		
		width=1.0;
		length=1.0;
	}
	void Rectangle(double wid,double leng) {
		
		this.width=wid;
		this.length=leng;
	}
	public Rectangle(String colo,boolean fill,double wid,double leng) {
		this.colour=colo;
		this.filled=fill;
		this.width=wid;
		this.length=leng;
	}
	public double getWidth() {
		return width;
	}
	public void setWidth(double width) {
		this.width = width;
	}
	public double getLength() {
		return length;
	}
	public void setLength(double length) {
		this.length = length;
	}
	public void getArea() {
		double area=(this.length*this.width);
		System.out.println(area);
	}
	public void getPerimeter() {
		double peri=(2*(this.length+this.width));
		System.out.println(peri);
	}
	public String toString(){
		return ("A Rectangle with"+this.length+"and"+this.width+"which is a subclass of"+super.toString());
	}
}


