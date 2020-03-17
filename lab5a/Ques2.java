import java.util.Scanner;


public class Ques2{
	public static void main(String[] args){

		int b=9;
		while(b>1){
			System.out.println("\n1.SBI");

			System.out.println("\n2.PNB");

			System.out.println("\n3.BOI");

			System.out.println("\n4.Exit");

			Scanner sc=new Scanner(System.in);
			System.out.println("Type your choice: ");

			int y=sc.nextInt();

			switch(y){
				case 1:

					System.out.println("Type Local Balance in SBI: ");

					int lb1=sc.nextInt();
					SBI ob1=new SBI(lb1);
					ob1.aiS();
					ob1.disS();
					break;

				case 2:
					System.out.println("Type Local Balance in PNB: ");

					int lb2 =sc.nextInt();
					PNB ob2=new PNB(lb2);
					ob2.aiP();
					ob2.disP();
					break;

				case 3:
					System.out.println("Type Local Balance in BOI: ");
					int lb3=sc.nextInt();

					BOI ob3=new BOI(lb3);
					ob3.aiB();
					ob3.disBo();
					break;
				case 4: 
					System.exit(0);

			}

		}
	}}




class Bank{
	static double tb;

	void disB(){
		System.out.println("Total Balance in Bank: "+this.tb);
	}}

class SBI extends Bank{
	double roi=3.5;

	double lb1;

	SBI(double lb1){
		this.lb1=lb1;

	}

	void aiS(){
		this.lb1=this.lb1+(roi*this.lb1)/100;
		super.tb=super.tb+this.lb1;

	}

	void disS(){

		System.out.println("\nLocal balance in SBI : "+this.lb1);
		disB();
	}}


class PNB extends Bank{
	double roi=4;

	double lb1;

	PNB(double lb1){
		this.lb1=lb1;

	}

	void aiP(){
		this.lb1=this.lb1+(roi*this.lb1)/100;
		super.tb=super.tb+this.lb1;

	}

	void disP(){

		System.out.println("\nLocal balance in PNB: "+this.lb1);
		disB();
	}}
class BOI extends Bank{
	double roi=5;

	double lb1;

	BOI(double lb1){
		this.lb1=lb1;

	}

	void aiB(){
		this.lb1=this.lb1+(this.roi*this.lb1)/100;
		super.tb=super.tb+this.lb1;

	}


	void disBo(){


		System.out.println("\nLocal balance in BOI: "+this.lb1);
		disB();
	}}

