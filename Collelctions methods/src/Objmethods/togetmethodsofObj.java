package Objmethods;

import java.io.BufferedWriter;
import java.util.Hashtable;
import java.util.List;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

public class togetmethodsofObj extends Object
{
	public static void main(String args[]) throws IOException
	{
		List lt =new ArrayList();
	Collections nk;
		System.out.println("start");
		String n1m;
		Class nm=null;
		try {
			nm = Class.forName("java.lang.String");
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		Method m[]=nm.getMethods();
		
		
            try {
			File st= new File("C:/Users/madhusudan jingade/Desktop/madhu/java/Collection Methods/String.txt");
		FileWriter FT= new FileWriter(st);
		BufferedWriter  FT1 = new BufferedWriter(FT);
			Display(m,FT1);
			FT1.close();
            } catch (FileNotFoundException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
            
            
		}
		
		
	
	
	static String Display(Method m[],BufferedWriter fT1) throws IOException
	{
		String Name=null;
		for(int i = 0; i < m.length; i++) {
		System.out.println(m[i]);
		fT1.write(i+1+ "==>"+m[i].toString());
		fT1.newLine();
		}
		//System.out.println("Madhu" +Name);
		
		
		return Name;
	}

}
