import java.util.Scanner;
public class q1{

public static void main(String[] args){

Scanner a=new Scanner(System.in);

String name=a.nextLine();
String branch=a.nextLine();


int ed=a.nextInt();



String name1=a.nextLine();

System.out.println("  branch is \n\n"+branch);


double sa=a.nextLong();
System.out.println("\n\n");
if(sa>=80000.0)
{
System.out.println(name);
System.out.println(ed);
System.out.println(sa);
System.out.println("A");
}
else
{
if(sa>= 50000.0 && sa<=79999.0)
{
System.out.println(name);
System.out.println(ed);
System.out.println(sa);
System.out.println("B");

}
else
{
if(sa>= 30000.0 && sa<=49999.0)
{
System.out.println(name);
System.out.println(ed);
System.out.println(sa);
System.out.println("c");
}
else
{

if(sa<=29999.0)
{
System.out.println(name);
System.out.println(ed);
System.out.println(sa);
System.out.println("D");


}

}

}


}


}

}
