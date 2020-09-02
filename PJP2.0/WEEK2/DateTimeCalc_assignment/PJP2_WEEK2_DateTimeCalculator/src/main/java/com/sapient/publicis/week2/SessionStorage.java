package com.sapient.publicis.week2;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.List;

public class SessionStorage {

	private static List<SessionObj> sessionList = new ArrayList<SessionObj>();

	public static void writeSession(SessionObj obj) {
		try {
			File f = new File("E:\\object.ser"); 
			
	        if (f.exists())
	        {
	        	FileInputStream fileIn = new FileInputStream("E:\\object.ser");
				ObjectInputStream in = new ObjectInputStream(fileIn);
				
				sessionList = (List<SessionObj>) in.readObject();
				in.close();
				fileIn.close();	        
	        }
	        
	        if(sessionList.size()>100)
	        	sessionList.remove(0);
	        
	        sessionList.add(obj);
	        
	        FileOutputStream fileOut = new FileOutputStream("E:\\object.ser");
			ObjectOutputStream out = new ObjectOutputStream(fileOut);
			
			out.writeObject(sessionList);
			out.close();
			fileOut.close();
		} 
		catch (Exception i) {
			i.printStackTrace();
		}
	}

	public static void readSessions() throws IOException, ClassNotFoundException 
	{
		FileInputStream fileIn = new FileInputStream("E:\\object.ser");
		ObjectInputStream in = new ObjectInputStream(fileIn);
		sessionList = (List<SessionObj>) in.readObject();
		System.out.println(sessionList);
		in.close();
		fileIn.close();
	}
	
	public static void clearSessions() throws IOException
	{
		File f = new File("E:\\object.ser"); 
		
        if (f.exists())
        {
        	FileOutputStream fileOut = new FileOutputStream("E:\\object.ser");
			ObjectOutputStream out = new ObjectOutputStream(fileOut);
			sessionList.clear();
			out.writeObject(sessionList);
			out.close();
			fileOut.close();       
        }
	}
	
	public static void main(String[] args) throws ClassNotFoundException, IOException {
		readSessions();
		clearSessions();
	}
}
