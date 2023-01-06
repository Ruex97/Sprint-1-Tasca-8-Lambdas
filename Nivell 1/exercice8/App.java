package exercice8;

public class App {
	
	public static void main(String args[]) {
		
		ReverseString reversed = s -> {
            return new StringBuilder(s).reverse().toString();
        };
		
		String input = "My name is Xavi";
		String output = reversed.reverse(input);
		
		System.out.println(output);
		
	}
	
	
	
	
	
	
}


