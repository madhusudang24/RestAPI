package Objmethods;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class ArrayListExecution 
{
	/*public static void main(String args[])
	{
		ArrayList Ar= new ArrayList();
		/*Ar.add("Madhusudan.g");
		Ar.add(1);
		Ar.add(122.90);
		Ar.add(3,"mh");
		Ar.remove(2);
		Ar.remove("mh");
		Ar.get(0);
	    Object hm=Ar.clone();
		System.out.println(((ArrayList)hm).indexOf("Madhusudan.g"));
		Ar.add("kl");
		Ar.add("2444");
		Ar.add("ertf");
		Ar.add("8u8");
		Ar.add("kmji");
		Ar.forEach((n)-> System.out.println(n));
		Ar.add(2);
		Ar.add(3);
		Ar.add(4);
		Ar.add(7);
		Ar.add(9);
		ArrayList Ar1= new ArrayList();
		Ar1.add(2);
		Ar1.add(778);
		Ar1.add(90);
		Ar1.add("nayana");
	Ar1.add("netra");
		System.out.println(Ar.containsAll(Ar1));
		Ar.forEach((n)-> System.out.println(n));
		System.out.println(Ar.parallelStream());
		System.out.println(Ar);
	}*/
 public static void main(String[] args) 
 {
	 List lt = new ArrayList();
	 //System.out.println(lt.size());
	 for(int i=1 ;i<=6;i++)
	 {
		 lt.add(i);
		 
	 }
	 lt.remove(2);
	// System.out.println(lt.hashCode());
	 for(int i=11 ;i<=14;i++)
	 {
		 lt.add(i);
		 
	 }
	 lt.remove(1);
	 
	// System.out.println(lt.hashCode());
	 Iterator it = lt.iterator();
	 
	 while(it.hasNext()) {
		 //System.out.print(it.next()+",");
		 if((int)it.next()==5)
		 {
			 it.remove();
		 }
		 System.out.print(it.next()+",");
	 }
	 Iterator it1 =lt.iterator();
	 while(it1.hasNext())
	 {
		 System.out.print(it1.next()+",");
	 }
	
}

}
