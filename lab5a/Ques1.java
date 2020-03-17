import java.util.Scanner;

public class Ques1{
	public static void main(String[] args){
		System.out.println("\n1.Add");
		System.out.println("\n2.Sub");
		System.out.println("\n3.Multi");

		Scanner sc=new Scanner(System.in);
		System.out.println("Type your choice: ");

		int y=sc.nextInt();



		switch(y){
			case 1:
				Add ob1=new Add();
				ob1.operaA();
				System.out.println("\nYou choose Addition");

				ob1.disA();
				break;

			case 2:
				Sub ob2=new Sub();
				ob2.operaS();
				System.out.println("\nYou choose Subtraction");
				ob2.disS();
				break;
			case 3:
				Mul ob3=new Mul();
				ob3.operaM();
				System.out.println("\nYou choose Multiplication");
				ob3.disM();
				break;



		}
	}}

class Maths{
	protected int n1;
	protected int n2;

	void inputm(){
		Scanner sc=new Scanner(System.in);
		System.out.println("Type First no: ");
		n1=sc.nextInt();
		System.out.println("Type 2nd no: ");
		n2=sc.nextInt();
	}

	void dism(){
		System.out.println("\nFirst No: "+this.n1+"\nSecond no: "+this.n2);
	}
}  
class Mul extends Maths{
	protected double result;

	void operaM(){
		inputm();
		result=super.n1*super.n2;
	}

	void disM(){

		System.out.println("Result: "+this.result);
	}}
class Sub extends Maths{
	protected double result;

	void operaS(){
	inputm();
		result=super.n1-super.n2;
	}

	void disS(){

		System.out.println("Result: "+this.result);
	}}


class Add extends Maths{
	protected double result;

	void operaA(){
	inputm();
		result=super.n1+super.n2;

	}

	void disA(){

		System.out.println("Result: "+this.result);
	}
}

