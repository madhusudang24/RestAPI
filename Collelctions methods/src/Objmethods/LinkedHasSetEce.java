package Objmethods;

import java.util.LinkedHashSet;

public class LinkedHasSetEce 
{
public static void main(String[] args) 
{
	LinkedHashSet lh = new LinkedHashSet() ;
/*	lh.add("Madhu");
	lh.add("sumanag");
	lh.add("sumana");
	lh.add("sumanag");
	lh.add(1234);
	lh.add(1234);
	lh.add("sumanag");
	*/
	lh.add(new obj(3,"naveen","ghdf"));
	lh.add(new obj(1,"Madhu","abcd"));
	lh.add(new obj(2,"suresh","bcda"));
	lh.add(new obj(3,"naveen","ghdf"));
	lh.add(new obj(3,"naveen","ghdf1"));
	System.out.println(lh);
	}

}
class obj
{
	int num;
	String name;
	String code;
	obj(int num,String name,String code)
	{
	this.num=num;
	this.name=name;
	this.code=code;
	}
	public boolean equals(Object o)
	{
		obj ob= (obj) o;
		return this.hashCode()==ob.hashCode();
	}
	public int hashCode()
	{
		return name.hashCode();
		
	}
	public String toString()
	{
		return this.num+" "+this.name+" "+this.code;
	}
	
}
