import java.io.*;
import java.io.Exception;
import java.util.Scanner;
public class  Shop {
        public static void main (String[] args) {

            Scanner scan = new Scanner(System.in);
                int size =4;
                Items [] iarr =new Items[size];
                iarr[0]= new Items(0,"TV",10000,3,2);
                iarr[1]=new  Items(1,"MOUSE",1000,7,3);
                iarr[2]=new Items(2,"HEADPHONE",2000,1,6);
                iarr[3]=new Items(3,"MOBILE",5000,5,1);
                   iarr[0].toString();
                User user = new User("TV",10000);
                    while(true){
                    System.out.println("enter your choice ");

                    System.out.println("1. Display Items \n2. Buy Item \n3. Exit");
                    int i =scan.nextInt();
                    switch(i)
                    {
                        case 1: System.out.println(iarr[0]);
                                System.out.println( iarr[1]);
                                 System.out.println(iarr[2]);
                                  System.out.println(iarr[3]);
                                break;
                        case 2:System.out.println("enter item code ");
                                int k = scan.nextInt();
                                try{
                                if(k >= 0 && k<= 3)
                                {

                                }
                                else
                                {
                                        throw new Itemnotfound(" invalid choice");
                                }
                                }
                                catch()
                                {


                                }
                                System.out.println("enter the quentity of that item");
                                int z = scan.nextInt();
                                try{
                                if(z >0 && z<=iarr[k].stockRemaining)
                                {


                                }
                                else
                                {
                                        throw new ItemLimit("lack of item you can not buy the item");
                                }
                                }
                                catch()
                                {


                                }
                                double cb = iarr[k].unitPrice * z;
                                try{
                                if(user.budget >= cb )
                                        {iarr[k].stockRemaining = iarr[k].stockRemaining - z;
                                user.budget = user.budget - cb;
                                        System.out.println(user.budget);
  //                              }
   /*                             else
                                {
                                throw new OverBudget("current amount is less than the desire amount");
                                }
                                }
                                catch(OverBudget e)
                                {
                                System.out.println(e);
                                }
*/

                               break;
                        case 3 :
                                System.out.println("THANK YOU");
                            return;
                    }


                    }



        }
}

/*class OverBudget extends Exception
{
OverBudget(String s)
{

super(s);
}


}
*/
 class Items
 {
      int itemCode;
      String itemName;
      double unitPrice;
      int stockRemaining;
      int itemLimit;
     public Items(int itemCode, String itemName, double unitPrice, int stockRemaining, int itemLimit)
     {
         this.itemCode = itemCode;
         this.itemName =itemName;
         this.unitPrice = unitPrice;
         this.stockRemaining = stockRemaining;
         this.itemLimit = itemLimit;


     }
     public String toString()
     {

        return "itemCode-->" +itemCode+"  itemName-->"+itemName+"  unitPrice-->"+unitPrice+"  stockRemaining-->"+stockRemaining+" itemLimi--> "+itemLimit;
     }


 }

  class User
  {
      String name;
      double budget;

      public User(String name, double budget)
      {
          this.name = name;
          this.budget = budget;
      }

  }

