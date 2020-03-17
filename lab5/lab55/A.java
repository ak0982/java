import java.lang.Object;
import java.util.Scanner;

public class A {

        public static void main(String[] args) {

                Scanner scan = new Scanner(System.in);
                System.out.println("enter your choice");
                System.out.println("1.Stack");
                System.out.println("2.Queue");
		System.out.println("3.exit");
                int i = scan.nextInt();
                if(i == 1)
                {
                        Stack1 s = new Stack1();
                        while(true)
                        {       System.out.println("   ");
                                System.out.println("*****************************************");
                                System.out.println("enter your choice");
                                System.out.println("1. add");
                                System.out.println("2.remove");
                                System.out.println("3.display element");
			 	System.out.println("4.display no of element");
                                System.out.println("5.exit");
                               

                                int j = scan.nextInt();
                                if(j == 1)
                                {
                                        int k = scan.nextInt();
                                        s.add(k);
                                }
                                if(j == 2)
                                {
                                        s.remove();

                                }
                                if(j == 3)
                                {
                                        s.displayAllElements();

                                }
                                if(j == 5)
                                {

                                        return;
                                }
                                if(j == 4)
                                {

                                s.displayStatistics();

                                }
                        }

                      


                }
              if(i == 2)
		{
			
                       Queue q = new Queue();
                        while(true)
                        {       System.out.println("   ");
                                System.out.println("*****************************************");
                                System.out.println("enter your choice");
                                System.out.println("1. add");
                                System.out.println("2.remove");
                                System.out.println("3.display element");
                                System.out.println("4.display no of element");
				 System.out.println("5.exit");
                                int z= scan.nextInt();
                                if(z == 1)
                                {
                                        int x = scan.nextInt();
                                        q.add(x);
                                }
                                if(z == 2)
                                {
                                        q.remove();

                                }
                                if(z == 3)
                                {
                                        q.displayAllElements();

                                }
                                if(z == 5)
                                {

                                        return;
                                }
                                if(z == 4)
                                {

                                q.displayStatistics();

                                }
                        }



		}
		if(i == 3)
		return;



        }



}



class Cell
{
        private Cell next;
        private Object element;

        public Cell(Object element)
        {
                this.element = element;
                this.next = null;
        }

        public Cell(Object element, Cell next)
        {

                this.element = element;
                this.next=next;


        }
        public Object getElement()
        {
                return this.element;


        }
        public void setElement(Object element)
        {

                this.element = element;


        }
        public Cell getNext()
        {

                return this.next;

        }
        public void setNext(Cell next)
        {
                this.next = next;

        }




}

interface Debuggable
{

        public abstract void displayAllElements();


}
abstract class AbstractDataType implements Debuggable
{
        int element;

        protected Cell head=null;
        protected static int tne;
        protected int noe;
        public void displayAllElements()
        {

                Cell move1 = head;
                while(move1 != null)
                {
                        System.out.print(" ->"+move1.getElement());
                        move1 = move1.getNext();



                }



        }




        public void displayStatistics()
        {
                System.out.println("totalNumberOfElements  :"+tne);
                System.out.println("numberOfElement  :"+noe);
        }

        protected abstract void display();

        protected abstract void add(Object element);

        protected abstract Object remove();

}

class Stack1 extends AbstractDataType
{
        protected void display()
        {

                Cell temp1 = head;
                while(temp1.getNext() != null)


                        System.out.println(" --->"+temp1.getElement());
                temp1 = temp1.getNext();
        }



        protected void add(Object element)
        {

                tne++;
                noe++;

                if(head == null) {
                        Cell temp3 = new Cell(element);
                        head=temp3;

                }
                else
                {
                        Cell temp = head;
                        while(temp.getNext() != null)
                        {
                                temp = temp.getNext();


                        }
                        Cell temp2 = new Cell(element,null);
                        temp.setNext(temp2);



                }



        }

        protected Object remove()
        {
                if(head == null)
                        return null;

                tne--;
                noe--;
                Cell del = head;
                while(del.getNext().getNext() != null)
                {
                del = del.getNext();

                }

      
                del.setNext(null);
        return element;

        }


}



class  Queue extends AbstractDataType
{
        protected void display()
        {

                Cell temp1 = head;
                while(temp1.getNext() != null)


                        System.out.println(" --->"+temp1.getElement());
                temp1 = temp1.getNext();
        }



        protected void add(Object element)
        {

                tne++;
                noe++;

                if(head == null) {
                        Cell temp3 = new Cell(element);
                        head=temp3;

                }
                else
                {
                        Cell temp = head;
                        while(temp.getNext() != null)
                        {
                                temp = temp.getNext();


                        }
                        Cell temp2 = new Cell(element,null);
                        temp.setNext(temp2);



                }



        }

        protected Object remove()
        {
                if(head == null)
                        return null;

                tne--;
                noe--;
              

          Object element = head.getElement();
             head = head.getNext();
           
        return element;

        }


}


