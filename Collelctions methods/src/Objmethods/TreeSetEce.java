package Objmethods;

import java.util.TreeSet;

public class TreeSetEce 
{
	public static void main(String[] args) 
	{
		TreeSet ts = new TreeSet();
		ts.add(123);
		ts.add(234);
		ts.add(789);
		ts.add(1);
		//ts.add("erm");
		ts.add(789);
		ts.add(789);
		System.out.println(ts);
	}

}
