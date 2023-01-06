package exercice4;

import java.util.ArrayList;

public class App {

	public static void main(String[] args) {
		ArrayList<String> Months = new ArrayList<>();
		Months.add("January");
		Months.add("February");
		Months.add("March");
		Months.add("April");
		Months.add("May");
		Months.add("June");
		Months.add("July");
		Months.add("August");
		Months.add("September");
		Months.add("October");
		Months.add("November");
		Months.add("December");
		
		Months.forEach(App::printMonth);
		
		

	}
	
	public static void printMonth(String month) {
		System.out.println(month);
		
	}

}