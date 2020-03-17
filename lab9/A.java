import java.util.Scanner;

public class A 
{
	public static void main(String[] args)throws NumberFormatException
	{
		String str;
		Scanner scan  =  new Scanner(System.in);
		str = scan.nextLine();
		str. replaceAll("[^0-9,]"," ");
		int len = str.length();
		char ch2,ch='+';


		int num1=0,num2,sum=0,j=0,k=0,digit,count1=0;
		try{
			for(int i=0;i<=len;)
			{
				j=0;
				ch2 = str.charAt(i);
				k=0;
				num1 =0;
				while(Character.isDigit(ch2))
				{
					ch2 = str.charAt(i);
					digit =  Integer.parseInt(String.valueOf(ch2));
					num1 = k*10 + digit;
					k = num1;

					i++;
					ch2 = str.charAt(i);

				}




				System.out.println("num is  "+num1);

				ch2 = str.charAt(i);
				if(count1 == 0)
				{sum = num1;
					ch = ch2;
					count1++;
					i++;
				}
				else
			{		if('+' == ch)
					{
						sum = sum + num1; 
						System.out.println("in +" +sum);
						i++;
						ch = ch2;

					}
				if('*' == ch)
				{

					sum *= num1;
					i++;
					ch = ch2;


				}

				if('/' == ch)
				{
					sum =sum/ num1;
					i++;
					ch = ch2;




				}

				if('-' == ch)
				{
					sum = sum-num1;
					System.out.println("in -"+sum);
					i++;
					ch = ch2;

				}
			}


			}
			System.out.println(sum);
		}
		catch(Exception e)
		{

		}

		System.out.println(sum);



	}




}
