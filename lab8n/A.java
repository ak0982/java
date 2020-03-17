//package threadproject;
import java.io.*; 
import java.util.Scanner;


public class A 
{

	public static void main(String[] args)throws IOException  
	{

		thread1 t = new thread1();
		t.start();
		thread2 tt = new thread2();
		tt.start();
		thread3 ttt = new thread3();
		ttt.start();
		thread4 tttt = new thread4();
		tttt.start();


	}

}
class thread1 extends Thread
{
	public void run()
	{
		String line; 

		int countWord = 0; 
		int characterCount = 0; 
		int paragraphCount = 1; 
		try {
			File file = new File("poem.txt");
			FileInputStream fileStream = new FileInputStream(file); 
			InputStreamReader input = new InputStreamReader(fileStream); 
			BufferedReader reader = new BufferedReader(input); 

			while((line = reader.readLine()) != null) 
			{ 
				if(line.equals("")) 
				{ 
					paragraphCount++; 
				} 
				if(!(line.equals(""))) 
				{ 

					characterCount += line.length(); 


					String[] wordList = line.split("\\s+"); 

					countWord += wordList.length; 
				}


			}
			System.out.println("Total word count = " + countWord); 
		} catch (IOException e) {

			e.printStackTrace();
		}
	}

}



class thread2 extends Thread
{
	public void run()
	{




		try(FileInputStream f = new FileInputStream("poem.txt"))
		{

			System.out.println("total avaliable byte is " + f.available());
			int size = f.available();
			int n = size/40;
			int count1 =0;
			for(int i=0;i<size;i++)
			{

				char cc  = (char)f.read();
				if(cc == 'a' || cc == 'e' ||cc == 'i' ||cc == 'o' || cc == 'u'|| cc =='A' ||cc == 'E' || cc == 'I'|| cc == 'O'|| cc == 'U')
					count1++;

			}
			System.out.println("total no of vowel is "+count1);	
		}
		catch(IOException e)
		{
			System.out.println(e);
		}
	}

}


class thread3 extends Thread
{
	public void run()
	{




		String line; 

		int count = 0;
		int c=0;
		File file = new File("poem.txt"); 

		Scanner input;
		try {
			input = new Scanner(file);
			input.useDelimiter("[^a-zA-Z]+");

			while (input.hasNext()) {
				String a = input.next();

				String  b = "";
				c++;

				int n = a.length();
				for(int i = n - 1; i >= 0; i--)
				{
					b = b + a.charAt(i);
				}
				if(a.equalsIgnoreCase(b))
				{
					System.out.println(a);
					count = count + 1;
				}


			}
			System.out.println("palindrom  count: " + count);

		} catch (FileNotFoundException e) {

			e.printStackTrace();
		} 

	}


}


class thread4 extends Thread
{
	public void run()
	{

		int[] freq = new int[26];
		String str1 = "abcdefghijklmnopqrstuvwxyz";
		char str[] = new char[26];
		str1.getChars(0,26,str,0);

		try(FileInputStream f = new FileInputStream("words.txt"))
		{
			int size = f.available();
			for(int i=0;i<size;i++)
			{

				char cc  = (char)f.read();

				switch(cc)
				{
					case 'a':freq[0]++;
						 break;
					case 'A':freq[0]++;
						 break;
					case 'B':freq[1]++;
						 break;
					case 'b':freq[1]++;
						 break;
					case 'c':freq[2]++;
						 break;
					case 'C':freq[2]++;
						 break;
					case 'd':freq[3]++;
						 break;
					case 'D':freq[3]++;
						 break;
					case 'e':freq[4]++;
						 break;
					case 'E':freq[4]++;
						 break;
					case 'f':freq[5]++;
						 break;
					case 'F':freq[5]++;
						 break;
					case 'G':freq[6]++;
						 break;
					case 'g':freq[6]++;
						 break;
					case 'H':freq[7]++;
						 break;
					case 'h':freq[7]++;
						 break;
					case 'i':freq[8]++;
						 break;
					case 'I':freq[8]++;
						 break;
					case 'J':freq[9]++;
						 break;
					case 'j':freq[9]++;
						 break;
					case 'K':freq[10]++;
						 break;
					case 'k':freq[10]++;
						 break;
					case 'L':freq[11]++;
						 break;
					case 'l':freq[11]++;
						 break;
					case 'm':freq[12]++;
						 break;
					case 'M':freq[12]++;
						 break;
					case 'N':freq[13]++;
						 break;
					case 'n':freq[13]++;
						 break;
					case 'O':freq[14]++;
						 break;
					case 'o':freq[14]++;
						 break;

					case 'P':freq[15]++;
						 break;
					case 'p':freq[15]++;
						 break;
					case 'Q':freq[16]++;
						 break;
					case 'q':freq[16]++;
						 break;
					case 'r':freq[17]++;
						 break;

					case 'R':freq[17]++;
						 break;
					case 's':freq[18]++;
						 break;
					case 'S':freq[18]++;
						 break;
					case 'T':freq[19]++;
						 break;
					case 't':freq[19]++;
						 break;
					case 'U':freq[20]++;
						 break;
					case 'u':freq[20]++;
						 break;
					case 'V':freq[21]++;
						 break;
					case 'v':freq[21]++;
						 break;

					case 'w':freq[22]++;
						 break;
					case 'W':freq[22]++;
						 break;
					case 'x':freq[23]++;
						 break;
					case 'X':freq[23]++;
						 break;
					case 'Y':freq[24]++;
						 break;
					case 'y':freq[24]++;
						 break;
					case 'Z':freq[25]++;
						 break;
					case 'z':freq[25]++;
						 break;

					default :
						 break;

				}






			}
			for(int i=0;i<25;i++)
			{
				System.out.println(str[i]+"  "+freq[i]);


			}




		}

		catch(IOException e)
		{
			System.out.println(e);
		}






	}


}










