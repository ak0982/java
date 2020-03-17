import java.util.Scanner;
interface Bank
{
	String name="SBI";
	void depositMoney(double d);
	double getTotal();
}
class Saving implements Bank
{
	
	static double tA,pA,de;
	double a;
	double principalAmount;
	Saving(double d1)
	{
		pA=d1;
	}
	public void depositMoney(double d)
	{
		de=d+de;
		a=d;
		System.out.println("Deposit Amount: "+de);
	
	}
	public double getTotal()
	{
		tA=(tA+a+pA)+(tA+a+pA)*3.5/100;
			return 0;
	}
	
	
	public String toString()
	{
		return "Tatal Amount"+tA;
	}
	
}
class PPF implements Bank
{
	double de,tA,pA;
    double a;
	static double intersRate;
	PPF(double d2)
	{
		pA=d2;
	}
	public void depositMoney(double d)
	{
		de=d+de;
		a=d;
		System.out.println("Deposit Amount: "+de);
	
	}
	
	public double getTotal()
	{
		tA=(tA+a+pA)+(tA+a+pA)*7.5/100;
		return 0;
	}
	
	
	public String toString()
	{
		return "Tatal Amount"+tA;
	}
}
public class Banking
{
	
	public static void main(String[] args)
	{
		double p,q;
		Scanner h= new Scanner(System.in);
		
		System.out.println("Type Principal amount in Saving: ");
     double p1=h.nextDouble();


     System.out.println("Type Principal amount in PPF: ");
     double p2=h.nextDouble();
		while(true)
		{
			int x;
			
			System.out.println("1: Saving"+"\n"+"2: FFP");
			x=h.nextInt();
			switch(x)
			{
				case 1:
				{
					Saving ref1 = new Saving(p1);
					System.out.println("Enter Deposit Mpney");
					p=h.nextDouble();
					ref1.depositMoney(p);
					ref1.getTotal();
					System.out.println(ref1.toString());
					break;
				}
				case 2:
				{
					PPF ref2=new PPF(p2);
					System.out.println("Enter Deposit Mpney");
					q=h.nextDouble();
					ref2.depositMoney(q);
					ref2.getTotal();
					System.out.println(ref2.toString());
					break;
					
				}
				/*case 0:
 * 				{
 * 									System.out.println("Thank You for E-banking");
 * 													}*/
				default:
				{
					System.out.println("You have Entered Wrong key");
				}
				
			}
			
		}
	}
	
}



