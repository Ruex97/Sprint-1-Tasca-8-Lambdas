package exercice6;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class App {

	public static void main(String[] args) {
		
		List<Object> myList = new ArrayList<Object>();
		
		myList.add("Messi");
		myList.add("Lightbulb");
		myList.add(7);
		myList.add("Messi");
		myList.add(3.14);
		myList.add("Tuna");
		myList.add(25000);
		myList.add("coffee");
		
		// First I filter the list to only sort the Strings
		
		List<Object> stringList = myList.stream()
			    .filter(s -> s instanceof String)
			    .collect(Collectors.toList());
		
		stringList.sort(Comparator.comparing(s -> ((String) s).length()));
	
		stringList.forEach(System.out::println);
			
		

	}
	
	//Why this doesn't work?
	
	/*Collections.sort(myList, (o1, o2) -> {
			int k = 0;
			if (o1 instanceof String && o2 instanceof String) {
				k = ((String) o1).length() - ((String) o2).length();	
			} 
			return k;
			
			});
	
		
		for (Object element: myList) {
			System.out.println(element);
		}*/

}
	
	


