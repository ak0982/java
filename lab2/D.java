import java.util.Scanner;
public class D
{
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		int operand1 = sc.nextInt();
		sc.nextLine();
		String operator = sc.nextLine();
		int operand2 = sc.nextInt();
		//a=sc.nextInt();
		//c=sc.nextLine();
		//sc.nextLine();
		//b=sc.nextInt();
		//sc.nextLine();
		//c=sc.nextLine();
		Operation operation = new Operation(operand1, operator, operand2);
		operation.calculateValue();
		operation.displayResult();

	}



}

class Operation
{
	int opa;
	String c;
	int opb;
	double result;
	Operation(int a,String z,int w)
	{
		opa=a;
		c=z;
		opb=w;


	}

	public void calculateValue()
	{

		if(c.equals("+"))
			result= opa+opb;
import.java.util.Scanner;
public class D
{
public static void main(String args[])
{
Scanner sc=new Scanner(System.in);
int a;
String c;
int b;
a=sc.nextInt();
c=sc.nextLine();
b=sc.nextInt();

 Operation o=new  Operation(a,c,b);
o.calculateValue();
o.displayResult();

}



}

class Operation
{
int opa;
String c;
int opb;
double result;
Operation(int a,String z,int w)
{
opa=a;
c=z;
opb=w;


}

public void calculateValue()
{
if(c=="+")
result= opa+opb;
if(c=="-")
result= opa-opb;
if(c=="*")
result= opa*opb;
if(c=="/")
result= opa/opb;


}

public void displayResult()
{
System.out.println("result is -\n"+result);


}



}		if(c.equals("-"))
			result= opa-opb;
		if(c.equals("*"))
			result= opa*opb;
		if(c.equals("/"))
			result= opa/opb;


	}

	public void displayResult()
	{
		System.out.println("result is -\n"+result);


	}



}
