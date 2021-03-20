package raBi;

import java.util.Set;
import java.util.TreeMap;

public class Treemap_comp_player implements Comparable<Treemap_comp_player>
{
	int jn; //joursey number
	String name;
	
	Treemap_comp_player(int jn, String name)
	{
		this.name=name;
		this.jn=jn;
	}
	@Override
	public String toString() 
	{
		return this.name +" "+this.jn;
	}
	
	@Override
	public int compareTo(Treemap_comp_player play)
	{
		//return this.name.compareToIgnoreCase(play.name);  //ascending order based on name
		
		Integer JN=this.jn;
		return JN.compareTo(play.jn); //ascending order based on jn
		//return JN.compareTo(play.jn) *-1; //descending order based on jn
	}

	public static void main(String[] args) 
	{
		Treemap_comp_player p1=new Treemap_comp_player(7,"dhoni");
		Treemap_comp_player p2=new Treemap_comp_player(12,"kohli");
		Treemap_comp_player p3=new Treemap_comp_player(10,"rohit");
		Treemap_comp_player p4=new Treemap_comp_player(15,"raina");
		Treemap_comp_player p5=new Treemap_comp_player(18,"hardik");
		Treemap_comp_player p6=new Treemap_comp_player(7,"dhoni");
		
		TreeMap<Treemap_comp_player, String> map=new TreeMap<Treemap_comp_player, String>();
		map.put(p1, "csk");
		map.put(p2, "rcb");
		map.put(p3, "mi");
		map.put(p4, "csk");
		map.put(p5, "mi");
		map.put(p6, "csk");
		
		
		Set<Treemap_comp_player> allkeys=map.keySet();
		
		for (Treemap_comp_player pl : allkeys)
		{
			System.out.println(pl);
		}
		
	}
	

}
