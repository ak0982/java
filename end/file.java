import java.io.*;
public class file {

	public static void main(String[] args) 
	{
	
		System.out.println("hi.....");
		
//		int[][] twoD_arr = new int[10][20];

		File f1 = new File("Input.txt");
		int ch;
		FileReader  fr= null;
		FileWriter fw = null;
		
		
		try
		{
			
			
			
		 fr = new FileReader(f1);
		
		 
		 ch = fr.read();
		
		 System.out.println(f1.getParent());
		 System.out.println(f1.getPath());
		 System.out.println(f1.getFreeSpace());
		 System.out.println(f1.getAbsolutePath());
		while(ch != -1)
		{int[][] twoD_arr = new int[10][20];
			
			ch = fr.read();
			 fw.write(ch);
			 

		}
		
		}
		catch(Exception e)
		{
			
		}
		finally
		{
			
			try {
				fr.close();
				fw.close();
			} catch (IOException e) {
				
				e.printStackTrace();
			}
		}

	}

	private static File File(String string) {
		
		return null;
	}

}

