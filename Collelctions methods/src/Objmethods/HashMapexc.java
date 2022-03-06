package Objmethods;

import java.util.HashMap;

public class HashMapexc 
{
	public static void main(String[] args) 
	{
		HashMap hm= new HashMap();
		
		hm.put("madhu","ravi");
		hm.put("madhu", "ravi");
		hm.put(4, "dghu");
		hm.put(null,"huj");
		//System.out.println(hm.put("null", "madhuik"));
		hm.put("null", 7);
		System.out.println(hm);
		System.out.println(hm.values());
	}

}
