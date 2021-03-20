package raBi;

import java.util.Vector;

public class Vector_Demo 
{

	public static void main(String[] args) 
	{
		Vector<String> v=new Vector<String>();
		
		//capacity
		System.out.println(v.capacity());
		
		v.addElement("Rabi Ranjan Kumar");

		v.addElement("Rabi Patel");
		v.addElement("rabi ranjan");
		System.out.println(v);
		
		v.removeElement("rabi ranjan");
		System.out.println(v);
		
		v.removeElementAt(1);
		System.out.println(v);
		
		v.removeAllElements();
		System.out.println("after removing all elements "+v);
		
		v.addElement("Rabi Ranjan Kumar");

		v.addElement("Rabi Patel");
		v.addElement("rabi ranjan");
		v.addElement("Rabi Ranjan Kumar");

		v.addElement("Rabi Patel");
		v.addElement("rabi ranjan");
		v.addElement("Rabi Ranjan Kumar");

		v.addElement("Rabi Patel");
		v.addElement("rabi ranjan");
		v.addElement("Rabi Ranjan Kumar");

		v.addElement("Rabi Patel");
		v.addElement("rabi ranjan");
		System.out.println(v.capacity()); //here new capacity=current capacity*2;
		
	}

}
