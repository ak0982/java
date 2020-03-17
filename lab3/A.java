import java.util.Scanner;

public class A
{
public static void main(String args[])
{
Person p = new Person("amar",10);
p.displayPerson();
Faculty f= new Faculty(10,20,"dpb",300.0,"cse");

f.displayFaculty();
}



}

class Person
{
String name;
int adhaarId;
Person()
{
    
    
}
 Person(String nam,int a)
{
name=nam;
adhaarId=a;


}
public void displayPerson()
{
System.out.println("name-"+name+"  adhaarId-"+adhaarId);

}


}
class Student extends Person
{
int studentId;
String dept;
 
 public Student(int sid,int aid,String name,String dept)
{
studentId=sid;
adhaarId=aid;
this.name=name;
this.dept=dept;

}
public Student()
{
    
}

public void displayStudent()
{
System.out.println("name-"+name+"  adhaarId-"+adhaarId+"  studentid-"+studentId+"  dept"+dept);

}


}

class Employee extends Person
{

int eld;
double salary;
public Employee(int eld,int aid,String name,double sal)
{
this.eld=eld;
salary=sal;
adhaarId=aid;
this.name=name;

}
public Employee ()
{
    
}
public void displayStudent()
{
System.out.println("name-"+name+"  adhaarId-"+adhaarId+"  employee id-"+eld+"  salary-"+salary);

}


}
class Faculty extends Employee
{
String teachingDept;
public Faculty(int eld,int aid,String name,double sal,String tDept)
{

this.eld=eld;
salary=sal;
adhaarId=aid;
this.name=name;
teachingDept=tDept;
}
public  Faculty()
{
    
}
public void displayFaculty()
{
System.out.println("name-"+name+"  adhaarId-"+adhaarId+"  employee id-"+eld+"  salary-"+salary+" teachingdept"+teachingDept);


}


}

