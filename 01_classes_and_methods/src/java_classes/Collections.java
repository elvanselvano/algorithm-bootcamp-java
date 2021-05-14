package java_classes;

import java.util.ArrayList;
import java.util.Collection;
import java.util.PriorityQueue;
import java.util.Vector;

public class Collections {
	
	public static void main(String[] args) {
//		ArrayList, Vector, dll.
		
//		Collections umum di bahasa PHP, Python, Ruby dll.
		
//		Collection<String> collections = new ArrayList<String>();
//		Collection<String> collections2 = new Vector<>();
//		Collection<String> collections3 = new PriorityQueue<>();
//		
//		ArrayList<String> AL = new ArrayList<>();
		
		
//		collections.add("Budi");
//		collections.add("Darnell");
//		collections.isEmpty(); // cek apakah collection kosong
//		collections.remove("Budi");
//		collections.size(); // ukuran list
//		
		// indexof engga ada di Collection
//		AL.indexOf("Darnell"); 
//		AL.remove(0);
//		AL.set(0, "Cecep");

//		Define objects
		Fruit f1 = new Fruit("Mangga", 2000);
		Fruit f2 = new Fruit("Apel", 4000);
		
//		ArrayList of Objects
		ArrayList<Fruit> fruits = new ArrayList<>();
		fruits.add(f1);
		fruits.add(f2);
		
//		for(Fruit fruit : fruits) {
//			System.out.println(fruit.toString());
//		}	

		System.out.println(fruits);
	}

}
