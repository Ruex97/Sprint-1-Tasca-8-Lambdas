package exercice2;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class App {

	public static void main(String[] args) {
		List<String> myList = new ArrayList<String>();
		myList.add("Hello");
		myList.add("World");
		myList.add("My");
		myList.add("Name");
		myList.add("Is");
		myList.add("Pol");
			
			
		List<String> filteredList = myList.stream().filter((s) -> s.length() >= 5 && s.contains("o"))
											  .collect(Collectors.toList());
			
		System.out.println(filteredList);

		}

}
