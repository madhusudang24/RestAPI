package Objmethods;

import java.util.PriorityQueue;

public class PriorityQueueExce 
{
	public static void main(String[] args) 
	{
		PriorityQueue pq=new PriorityQueue();
		System.out.println(pq.size());
		/*pq.add(90);
		pq.add(908);
		pq.add(908);
		pq.add(7890);
		pq.add(0);
		System.out.println(pq);*/
		pq.add(new num(900,"madhu"));
		pq.add(new num(90,"suresh"));
		pq.add(new num(890,"naveen"));
		pq.add(new num(778,"gyht"));
		System.out.println(pq);
		
		
		
	}

}
class num implements Comparable
{
	int n;
	String num2;
	num(int n,String num)
	{
		this.n=n;
		num2=num;
		
	}
	@Override
	public int compareTo(Object o) {
		// TODO Auto-generated method stub
		
		return this.n-((num)o).n;
	}
	public String toString() 
	{
		return n+" --> "+num2;
		
	}
	
}
