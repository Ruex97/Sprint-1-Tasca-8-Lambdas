package exercice4;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class App {

	public static void main(String[] args) {
			
		List<Object> myList = new ArrayList<Object>();
		
		myList.add("Messi");
		myList.add("Lightbulb");
		myList.add(7);
		myList.add("Leo");
		myList.add(3.14);
		myList.add("Tuna");
		myList.add(25000);
		myList.add("Ice cream");
		
		
		// --- Sorted by: ---
		// Alphabetically by the first character
		
		System.out.println("1- Sorted alphabetically only by first character: \n");
		myList.sort(Comparator.comparing(s -> s.toString().charAt(0)));
		myList.forEach(System.out::println);
		
		// Strings with letter e goes first
		
		System.out.println("\n2- Sorted by placing first Strings with character 'e' \n");
		
		List<Object> withEList = myList.stream().filter(s -> s.toString().contains("e")).toList();	
		List<Object> withoutEList = myList.stream().filter(s -> !s.toString().contains("e")).toList();
		
		List<Object> eSortedList = Stream.concat(withEList.stream(), withoutEList.stream())
	            .collect(Collectors.toList());
		
		eSortedList.forEach(System.out::println); 
		
		// Elements with an A are modified. A = 4
		
		System.out.println("\n3- Swaping a by 4 \n");

		myList.forEach(s -> System.out.println(s.toString().replace('a', '4')));
		
		
		System.out.println("\n4- Printing only numeric elements \n");
		
		
		List<Object> numericList = myList.stream()
				.filter(n -> n instanceof Number)
				.collect(Collectors.toList());	
		

		numericList.forEach(System.out::println);
		/** Ordena-les per:
		 * Mostra només els elements que són numèrics. (Encara que estiguin guardats com Strings).   */

	}

}
