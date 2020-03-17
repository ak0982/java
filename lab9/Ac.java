//package com.soc;

import java.net.*; 
import java.io.*; 
  
public class Ac
{ 
    
    private Socket socket            = null; 
    private DataInputStream  input   = null; 
    private DataOutputStream out     = null; 
  
  
    public Ac(String address, int port) 
    { 
      
        try
        { 
            socket = new Socket(address, port); 
            System.out.println("Connected"); 
  
         
            input  = new DataInputStream(System.in); 
  
          
            out    = new DataOutputStream(socket.getOutputStream()); 
        } 
        catch(UnknownHostException u) 
        { 
            System.out.println(u); 
        } 
        catch(IOException i) 
        { 
            System.out.println(i); 
        } 
  
  
        String line = ""; 
  
     
        while (!line.equals("kill client")) 
        { 
            try
            { 
                line = input.readLine();
//		if(line.equals("kill client"))
//			return;
 
                out.writeUTF(line); 
            } 
            catch(IOException i) 
            { 
                System.out.println(i); 
            } 
        } 
  
     
        try
        { 
            input.close(); 
            out.close(); 
            socket.close(); 
        } 
        catch(IOException i) 
        { 
            System.out.println(i); 
        } 
    } 
  
    public static void main(String args[]) 
    { 
        Ac client = new Ac("localhost",9999); 
    } 
} 

