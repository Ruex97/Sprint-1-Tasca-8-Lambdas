package exercice1;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class App {

	public static void main(String[] args) {
		// Crea una llista de cadenes amb noms propis. 
		
		List<String> myList = new ArrayList<>();
		
		myList.add("Xavi");
		myList.add("Ana");
		myList.add("amelia");
		myList.add("Ada");
		myList.add("Carlos");
		myList.add("anA");
		
		
		System.out.println(filter3CharStringsStartingWithA(myList));
		
	}
	
	/**
	 * 
	 * @param myList
	 * @return Strings with 3 chars that starts with 'A'
	 */
	public static List<String> filter3CharStringsStartingWithA (List<String> myList){
		
		List<String> filteredList = 
				myList.stream().filter(s -> s.startsWith("A") && s.length() == 3).collect(Collectors.toList());	
		
		return filteredList;
		
	}

}
