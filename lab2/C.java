public class C
{
public static void main(String args[])
{
StudentRecord s=new StudentRecord();
s.displayRecord();
StudentRecord sa=new StudentRecord(2);
sa.displayRecord();
StudentRecord sb=new StudentRecord(3,"amar");
sb.displayRecord();
StudentRecord sc=new StudentRecord(4,"kumar","cse");

sc.displayRecord();


}




}
class StudentRecord
{
int rollNo;
String name;
String dep;

StudentRecord()
{
rollNo=-1;
name="000";
dep="000";


}
StudentRecord(int rollNo)
{
this.rollNo=rollNo;
name="000";
dep="000";

}
StudentRecord(int rollNo,String name)
{
this.rollNo=rollNo;
this.name=name;
dep="000";


dep="000";
}

StudentRecord(int rollNo,String name,String dep)
{
this.rollNo=rollNo;
this.name=name;
this.dep=dep;



}
void displayRecord()
{

System.out.println("name-\n"+name+"\nrollNo-\n"+rollNo+"\ndepartment-\n"+dep);


}

}


