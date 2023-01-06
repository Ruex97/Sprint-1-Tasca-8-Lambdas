package exercice5;

public class App {

	public static void main(String[] args) {
		PiCalculation piCalculation = () -> 3.1415;
		
		double pi = piCalculation.getPiValue();
		
		System.out.println(pi);

	}

}

