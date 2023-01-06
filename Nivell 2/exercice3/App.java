package exercice3;

public class App {

	public static void main(String[] args) {
		
	    Operation add = (x, y) -> x + y;
	    Operation subtract = (x, y) -> x - y;
	    Operation multiply = (x, y) -> x * y;
	    Operation divide = (x, y) -> x / y;

	    System.out.println(add.operation(5, 3)); 
		System.out.println(subtract.operation(5, 3)); 
		System.out.println(multiply.operation(5, 3)); 
		System.out.println(divide.operation(5, 3)); 
	 }
		

		/* Crea una Functional Interface que contingui un mètode anomenat operacio(). Aquest mètode ha de retornar un float.
		 * Injecta a la interfície creada mitjançant una lambda, el cos del mètode, de manera que es pugui transformar 
		 * l’operació amb una suma, una resta, una multiplicació i una divisió.
		 */
		
	

}
