import java.lang.Object;
import java.util.*;
import java.util.Scanner;

public class Main
{
	public static void main(String args[])
	{
		Stack stack = new Stack();

		stack.add(12);
		stack.add(13);
		stack.add(14);
		stack.display();

	}

}


 class Cell
{
	private Cell next;
	private Object element;

	public Cell(Object element)
	{
		this.element = element;

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
/*	{
		Cell move = head;
		while(move != null)
		{

			System.out.print(" ->"+move.element);
				move = move.getNext();

		}


	}*/


}
 abstract class AbstractDataType implements Debuggable
{
	int element;
	protected Cell head = new Cell(element,head);
	protected static int totalNumberOfElements;
	protected int numberOfElements;
	public void displayAllElements()
	{

	Cell move1 = head;
	while(move1 != null)
	{
	System.out.print(" ->"+move1.element);
	move1 = move1.getNext();



	}



	}




	public void displayStatistics()
	{
		System.out.println("totalNumberOfElements  :"+totalNumberOfElements);
		System.out.println("numberOfElement  :"+numberOfElement);
	}

	protected abstract void display();

	protected abstract void add(Object element);

	protected abstract Object remove();

}

 class Stack extends AbstractDataType
{
	protected void display()
	{

	Cell temp1 = head;
	while(temp1.getNext() != null)
	{

	System.out.println(" --->"+temp1.getElement);
	temp1 = temp1.getNext();
	}


	}
	protected void add(Object element)
	{
	

	if(head == null)
	head.setElement(element);
	else
	{
	Cell temp = head;
	while(temp.getNext() != null)
	{
	temp = temp.getNext(); 
	

	}
	Cell temp2 = new Cell(element,temp.getNext());
	temp2.setElement(element);


	}



	}

	protected Object remove()
	{
	if(head == null)
	return null;

	Object element = head.getElement();
	head = head.getNext();
	return element;

	}


}
/*public class Queue
{

	protected void display()
	{


	}
	protected void add(Object element)
	{



	}

	protected Object remove()
	{


	} 

}


*/
