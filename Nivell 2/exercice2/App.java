package exercice2;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class App {

	public static void main(String[] args) {
		
		    List<Integer> numbers = new ArrayList<>();
		    numbers.add(3);
		    numbers.add(55);
		    numbers.add(44);
		    numbers.add(72);
		    numbers.add(21);
		    
		    String result = getString(numbers);
		    
		    System.out.println(result);  
		  }

		  
	
	public static String getString(List<Integer> numbers) {
		  return numbers.stream()  // creates a Stream of the elements in the list
		      .map(n -> n % 2 == 0 ? "e" + n : "o" + n)  // applies a lambda expression to each element
		      .collect(Collectors.joining(", "));  // joins the elements into a single string separated by ", "
		}

	

	/*Explanation for myself: The numbers.stream() creates a Stream of the elements in the numbers list.
	 * The map method applies the lambda expression to each element of the stream. 
	 * The lambda expression takes an integer n as input and returns a string. If n is even, it returns "e" concatenated 
	 * with n as a string. If n is odd, it returns "o" concatenated with n as a string.
	 * In Java, the ? : operator is known as the ternary operator. It is a shorthand way of writing an if-else statement.
	 * If condition is true, the operator returns expression1. If condition is false, it returns expression2. */
	
	

	}


