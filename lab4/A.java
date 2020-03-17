import java.util.Scanner;

public class A
{

public static void main(String[] args)
{
Scanner scan = new Scanner(System.in);
int i;

System.out.println("1) SportsPerson \n 2) Cricketer \n 3) Batsman\n 4) Bowler \n 5) WicketKeeper \n 6) Footballer \n 7) Striker \n 8) Defender \n 9) Goalkee");

System.out.println(" enter your choice \n");
i=scan.nextInt();
scan.nextLine();
 switch (i) { 
        case 1: 
	SportsPerson sp = new SportsPerson();
           sp.inputSportsPerson();
           	System.out.println("\n");
	        sp.displaySportPerson();
            break; 
        case 2: 
		Cricketer cri = new Cricketer();
		cri.inputCricketer();
		System.out.println("\n");
		cri.diplayCricketer();
           
            break; 
        case 3: 
	Batsman vk = new Batsman();
		vk.inputBatsman();
			System.out.println("\n");
		vk.displayBatsman();
		
           
            break; 
        case 4: 

            Bowler bumrah = new Bowler();
		bumrah.inputBowler();
			System.out.println("\n");
		bumrah.displayBowler();
            break; 
        case 5: 
            WicketKeeper dhoni =new WicketKeeper();
		dhoni.inputWK();
			System.out.println("\n");
		dhoni.displayWK();
            break; 
        case 6: 
          Footballer mesi = new Footballer();
		mesi.inputFootballer();
			System.out.println("\n");
		mesi.displayFootballer();
            break; 
        case 7: 
            Striker cr = new Striker();
		cr.inputStriker();
			System.out.println("\n");
		cr.displayStriker();
            break;
	 case 8:
	Defender df = new Defender();
		df.inputDefender();
			System.out.println("\n");
		df.displayDefender();
		break;
	 case 9:
	GoalKeeper goal = new GoalKeeper();
			goal.inputGK();
				System.out.println("\n");
			goal.displayGK();
		break;
        default: 
           
            break; 
        } 


}


}











class SportsPerson
{
	Scanner scan = new Scanner(System.in);
	protected String name;
	
	protected String address;

	public void displaySportPerson()
	{
		System.out.println("\n");
	System.out.println(" name :\n"+name +"address \n"+address);


	}
	public void inputSportsPerson() 
	{
	
	System.out.println("enter name :");
	name = scan.nextLine();
	System.out.println("enter address : ");
	address = scan.nextLine();
	
	
	}

	
}

class Cricketer extends SportsPerson
{
	
	static String type =  "Cricketer";
	protected int matchPlayed;
	protected int catches;

	public void diplayCricketer()
	{
displaySportPerson();
	System.out.println("\n");	

System.out.println("type :\n"+type+"match played :"+matchPlayed+"catches :\n"+catches);




	}

	public void inputCricketer()
	{
	
	inputSportsPerson();
	System.out.println("enter match played :");
	matchPlayed = scan.nextInt();
	System.out.println("enter no catche:");
	catches = scan.nextInt();


	}



}

class Batsman extends Cricketer
{

	protected int runs;
	protected double highest;

	public void displayBatsman()
	{
diplayCricketer();
	System.out.println("\n");
System.out.println("runs : \n"+runs+"highest :\n"+highest);


	}
	public void inputBatsman()
	{
	inputCricketer();
	System.out.println("enter run:");
	runs =  scan.nextInt();
	
	System.out.println("enter highest :");
	highest = scan.nextLong();


	} 

}
class Bowler extends Cricketer
{

	protected int wickets;
	protected double strikeRate;
 
 
	public void displayBowler()
	{
diplayCricketer();
	System.out.println("\n");
System.out.println("wicket :\n"+wickets+"strike rate :\n"+strikeRate);


	}	
	public void inputBowler()
	{
	inputCricketer();
	System.out.println("enter wicket:");
	wickets =  scan.nextInt();
	System.out.println("enter strike rate:");
	strikeRate = scan.nextLong();


	}



}

class WicketKeeper extends Bowler
{
	protected int stumpings;
	 public void displayWK()
	{
displayBowler();
	System.out.println("\n");

System.out.println("stumpings :\n"+stumpings);
	}
	public void inputWK() 
	{
	inputBowler();
	System.out.println("enter stumping :");
	stumpings =  scan.nextInt();

	}





}

class Footballer extends  SportsPerson
{

	static String type ="Footballerr";
	protected int matchesPlaye;
	protected int catches;
	protected int goals;
 	protected int tackles;

 
	public void displayFootballer() 
	{
displaySportPerson();
	System.out.println("\n");

System.out.println("type :\n"+type+"matchplayed : \n"+matchesPlaye+" catches : \n"+catches+"goals :\n"+goals+"tackles :\n"+tackles);


	}
	public  void inputFootballer()
	{	System.out.println("enter match played in football:");
		matchesPlaye =  scan.nextInt();
	System.out.println("enter goal :");
			goals =  scan.nextInt();
	System.out.println("enter tackles :");
			tackles =  scan.nextInt();

	}



}

class Striker  extends Footballer
{
	protected int goalsScored;
	protected int assist;

 
	public void displayStriker()
	{
 displayFootballer();
 	System.out.println("\n");
System.out.println("goalScored :\n"+goalsScored+"assist :\n"+assist);
	}
	public void inputStriker()
	{
	inputFootballer();
	System.out.println("enter  goalScored:");
		goalsScored =  scan.nextInt();
	System.out.println("enter assist :");
		assist =  scan.nextInt();


	}

}
class Defender extends Footballer
{
	 protected int tackle;
	protected int headers;
 
	public void displayDefender()
	{
 displayFootballer();
 	System.out.println("\n");
System.out.println("tackles :\n"+tackle+"headers : \n"+headers);


	}
	public void inputDefender()
	{
	inputFootballer();
	System.out.println("enter tackles :");
		tackle =  scan.nextInt();
	System.out.println("enter headers :");
		headers =  scan.nextInt();



	}





}
class GoalKeeper extends Striker
{

	protected int saves;
	protected int cleanSheets; 
 
	public void displayGK()
	{
displayStriker();
	System.out.println("\n");
System.out.println("saves :\n"+saves+"clean sheets :\n"+cleanSheets);

	}
	public void inputGK()
	{
	inputStriker();
	System.out.println("enter save :");
		saves =  scan.nextInt();
	System.out.println("entercleanSheets :");
		cleanSheets =  scan.nextInt();

	}


}










