package raBi;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;

public class HashSet_Demo1 
{

	public static void main(String[] args) 
	{
		Set<String> s=new HashSet<String>();
		s.add("Dhanbad");
		s.add("Ranchi");
		s.add("Bokaro");
		s.add("Jamshedpur");
		s.add("Tata");
		
		System.out.println(s);
		System.out.println("-----------------------------------------");
		Set<String> l=new LinkedHashSet<String>(s);
		l.add("Jharkhand");
		l.add("Bengal");
		l.add("Delhi");
		l.add("karnataka");
		l.add("Mumbai");
		
		System.out.println(l);
		System.out.println("------------------------------------------");
		
		Set<String> m=new LinkedHashSet<String>();
		m.add("Hindi");
		m.add("English");
		m.add("Kannada");
		m.add("Telugu");
		m.add("Tamil");
		m.add("Marathi");
		m.add("Bengali");
		
		System.out.println(m);
		
		System.out.println("-------------------------------------------");
		
		Set<String> p=new HashSet<String>();
		p.add("Hindi");
		p.add("English");
		p.add("Kannada");
		p.add("Telugu");
		p.add("Tamil");
		p.add("Marathi");
		p.add("Bengali");
		
		System.out.println(p);
		
	}

}
