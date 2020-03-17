import java.util.Scanner;
public class class1{

public static void main(String[] args){
Scanner a=new Scanner(System.in);
q2 s1=new q2();
int x,y;
//q2 s2=
s1.name=a.nextLine();
s1.mark1=a.nextInt();
s1.mark2=a.nextInt();
s1.per=((s1.mark1+s1.mark2)*100)/200;
//s1.per *=100;
a.nextLine();//after this code we can able to get input from keyboard for other object;
q2 s2=new q2();
s2.name=a.nextLine();
s2.mark1=a.nextInt();
s2.mark2=a.nextInt();
//x=s2.mark1;
//y=s2.mark2;
s2.per=((s2.mark1+s2.mark2)*100)/200;
//s2.per *=100;
System.out.println("name-- " +s1.name +" mark1-- "+s1.mark1 +" mark2-- "+s1.mark2 +" percentage--" +s1.per);
System.out.println("name2--"+s2.name +"mark1--"+s2.mark1 +"mark2--"+s2.mark2 +"percentage--"+s2.per);


}

}
