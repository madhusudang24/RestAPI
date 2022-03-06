package Objmethods;

import java.util.HashSet;

public class HashSetExce 
{
	public static void main(String[] args) 
	{
		HashSet hs= new HashSet();
		/*hs.add("madhu");
		hs.add("mjkl");
		hs.add(12);
		hs.add(7789);
		hs.add(12);
		hs.add("madhu");*/
		hs.add(new num1(1,"abhi","abcd"));
		hs.add(new num1(3,"suman","bcde"));
		hs.add(new num1(4,"ravi","efgh"));
		hs.add(new num1(6,"netra","lkju"));
		hs.add(new num1(3,"suman","bcde"));
		hs.add(new num1(1,"madhu","abcd"));
		hs.add(new num1(1,"madhu","abcd"));
		hs.add(new num1(1,"madhu","abcd"));
		hs.add(new num1(1,"a","b"));
		hs.add(new num1(2,"netra","lkju"));
		System.out.println(hs);
		
	}

}
class num1
{
	int n;
	String name;
	String code;
	num1(int n,String name,String code)
	{
		this.n=n;
		this.name=name;
		this.code=code;
	}
	public int hashCode()
	{
		return name.hashCode();
		
	}
	public boolean equals(Object o)
	{
		num1 nm = (num1)o;
		return this.hashCode()==nm.hashCode() ;
		
	}
	public String toString()
	{
		return n+name+code+hashCode()+"\n";
	}
	
	
}
