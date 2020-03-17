import java.util.Scanner;
abstract class Shape
{
	String name;
	int noSides;
	abstract double getArea();
	abstract double getPerimiter();
	
	
	
}
class Circle extends Shape
{
	double redius;
	double a,p;
	Circle(double redius)
	{
		redius=this.redius;
		name="Circle";
		noSides=0;
	}	
	void setArea(double redius)
	{
		a=3.14*redius*redius;
		
	}
	void setPerimiter(double redius)
	{
		p=2*3.14*redius;
	
	}
	double getArea()
	{
		return a;
	}
	double getPerimiter()
	{
		return p;
		
	}

	public String toString()
	{
		return "Area"+a+"\n"+"Perimiter: "+p;
	}
}
class Rectangle extends Shape
{
	int length,breadth;
	double c,d;
	Rectangle(int length,int breadth)
	{
		length=this.length;
		breadth=this.breadth;
		name="Rectangle";
		noSides=4;
	}
	void setArea(int length,int breadth)
	{
		c=length*breadth;
		
	}
	void setPerimiter(int length,int breadth)
	{
		d=2*(length+breadth);
		
	}
	double getArea()
	{
		return c;
	}
	double getPerimiter()
	{
		return d;
	}
	
	public String toString()
	{
		return "Area: "+c+"\n"+"Perimiter: "+d;
	}
}
public class Area
{
	static int s,l,b;
	static double r;
	public static void main(String args[])
	{
	Scanner sc= new Scanner(System.in);
	
	
	while(true)
	{
		System.out.println("1. rectangle"+"\n"+"2.circle");
		s=sc.nextInt();
		switch(s)
		{
			case 1:
			{
				System.out.println("Enter Length"+"\n"+"Enter Breadth");
				l=sc.nextInt();
				b=sc.nextInt();
				Rectangle ra=new Rectangle(l,b);
			    ra.setArea(l,b);
				ra.setPerimiter(l,b);
				System.out.println(ra.toString());
				break;
			}
			case 2:
			{
				System.out.println("Enter Redius");
				r=sc.nextDouble();
				Circle ci = new Circle(r);
				ci.setArea(r);
				ci.setPerimiter(r);
				System.out.println(ci.toString());
				break;
			}
			default:
			{
				System.out.println("you entered a wrong key");
		
			}
		}
		
	}
	
	}
}
	
	
	
