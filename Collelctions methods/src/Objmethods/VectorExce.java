package Objmethods;

import java.util.Vector;

public class VectorExce 
{
	public static void main(String[] args) 
	{
		Vector vc = new Vector();
		vc.add("Madhusudan");
		vc.add("madhu");
		vc.add(1);
		vc.add(3);
		System.out.println(vc);
		vc.forEach((n)->System.out.println(n));
		
	}

}
