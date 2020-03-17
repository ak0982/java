import java.util.Scanner;
public class A
{
	public static void main(String args[])
	{
		Scanner scan = new Scanner(System.in);
		System.out.println(" enter name and adhar id");
		String name= scan.nextLine();
		//scan.nextLine();
		int aid = scan.nextInt();
		System.out.println(" enter student id and dept ");
		int sid=scan.nextInt();

		scan.nextLine();
		String dept= scan.nextLine();
			System.out.println("enter employee id and salaray");
		int eid = scan.nextInt();

		double sal = scan.nextLong();
		//scan.nextLine();

			System.out.println(" enter the teaching deopt ");
			scan.nextLine();
		String tdep = scan.nextLine();

		Person person1 = new Person(name,aid);
		person1.displayPerson();

		Student s1 = new Student(sid,aid,name,dept);
		s1.displayStudent();


	//	scan.nextLine();

		Employee e1 = new Employee(eid,aid,name,sal);
		e1.displayEmployee();


		Faculty f= new Faculty(eid,aid,name,sal,tdep);
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
		System.out.println("-----------person detail-------------");

		System.out.println("name-  "+name+"  adhaarId-"+adhaarId);

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

		System.out.println("-----------student detail -------------");
		System.out.println("name-"+name+"  adhaarId-"+adhaarId+"  studentid-"+studentId+"  dept- "+dept);

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
	public void displayEmployee()
	{

		System.out.println("-----------employee detail-------------");
		System.out.println("name - "+name+"  adhaarId - "+adhaarId+"  employee id - "+eld+"  salary-"+salary);

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

		System.out.println("-----------faculty detail-------------");
		System.out.println("name - "+name+"  adhaarId - "+adhaarId+"  employee id - "+eld+"  salary - "+salary+" teachingdept - "+teachingDept);


	}


}
