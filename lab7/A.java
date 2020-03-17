import java.io.*;
import java.io.FileWriter;
import java.io.IOException;

public class A {
        public static void main (String[] args) {
                System.out.println("GfG!");
                Student.experiment1();



        }
}
class Student implements java.io.Serializable
{

        public String username = null;
        private transient String password = null;
        public String name = null;
        public int roll = 0;
        public int marks = 0;
        public transient static int totalMarks = 100;
        public transient double gradePoints = 0.0;
        public transient final String institute;

        public Student (String username,String password,String name,int roll,int marks,String institute)
        {
                this.username = username;
                this.password = password;
                this.name = name;
                this.roll = roll;
                this.marks = marks;
                this.institute = institute;

                gradePoints = (10.0 * marks) / totalMarks;
        }

        public String toString()
        {

                return "username-->"+username+"  password-->"+password+"  name-->"+name+"  roll-->"+roll+"  institute-->"+institute;
        }


        public static void  experiment1()
        {
                Student stu1 = new Student("amar","kumar","amar kumar",1801016,96,"IIIT G");
                Student stu2 = new Student("ankit","kumar s","ankit kumar s",1801017,90,"IIIT G");
                Student stu3 = new Student("adarsh","raj","adarsh raj",1801018,85,"IIIT G");
                Student stu4 = new Student("aman","chini","aman chini",1801019,80,"IIIT G");

                System.out.println(stu1);
                System.out.println(stu2);
                System.out.println(stu3);
                System.out.println(stu4);

                File f = new File("records.txt");

                FileWriter fw = null;

                try{
                       fw = new FileWriter(f);
                        fw.write(stu1.toString()+"\n");
                         fw.write(stu2.toString()+"\n");
                          fw.write(stu3.toString()+"\n");
                           fw.write(stu4.toString()+"\n");
                
                }
                catch(Exception e)
                {
                        System.out.println("file is not avaliable");
                }
                finally
                {
                        try{
                                fw.close();
                                fw.flush();
                        }
                        catch(Exception ex)
                        {
                                System.out.println("not close ");
                        }

                }




        }





}
