package test.example;

import java.util.ArrayList;
import java.util.Iterator;

public class ArrayListDemo1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ArrayList<String> Vegetable=new ArrayList<String>();
		
		Vegetable.add("Potato");
		Vegetable.add("Green Peas");
		Vegetable.add("Spring Onion");
		Vegetable.add("Broccoli");
		
		System.out.println("Vegetable list are:"+Vegetable);
		
		//Traversing list through Iterator
		Iterator itr=Vegetable.iterator();
		while(itr.hasNext()){
			System.out.println(itr.next());
		}
		
		//To  get element for specific position
		
		String str=Vegetable.get(0);
		System.out.println("The first is:"+str);
		
		//Modify the list at specific Position
		Vegetable.set(1, "Green Peas");
		System.out.println(Vegetable);
		
		// Add list at specific position
		
		Vegetable.add(2,"Brinjal");
	   System.out.println(Vegetable);
	   
	   // Remove list at Specific position
	   Vegetable.remove(1);
	   System.out.println(Vegetable);
	
	}

}
