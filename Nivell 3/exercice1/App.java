package exercice1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collector;
import java.util.stream.Collectors;

public class App {

	public static void main(String[] args) {
		
		List<Student> classroom = new ArrayList<>();
		classroom.add(new Student("Paula", "Java", 4, 17));
		classroom.add(new Student("Anabel", "Java", 8, 38));
		classroom.add(new Student("John", "Java", 9, 40));
		classroom.add(new Student("Peter", "Java", 6, 22));
		classroom.add(new Student("Ana", "PHP", 7, 15));
		classroom.add(new Student("Xavi", "PHP", 10, 31));
		classroom.add(new Student("Marc", "PHP", 3, 33));
		classroom.add(new Student("Aina", "Javascript", 7, 19));
		classroom.add(new Student("Elena", "Javascript", 6, 25));
		classroom.add(new Student("Joel", "Javascript", 2, 35));
		
		List<Student> aNamedStudents, approvedStudents, JavaStudents;
		
		
		// Show name and age of each student
		System.out.println("1. All Students names and ages \n");
		classroom.forEach(s -> System.out.println("Name: " + s.getName() + " Age: " + s.getAge()));
		
		// Filter the students that starts with A. Move them to another list and print that list
		System.out.println("\n2. Students with letter A\n");
		
		aNamedStudents = classroom.stream()
				.filter(s -> s.getName().startsWith("A"))
				.toList();
		aNamedStudents.forEach(s -> System.out.println("Name: " + s.getName()));
		
		// Filter the students with mark equal or higher than 5.
		System.out.println("\n3. Mark equal or greater then 5\n");
	
		approvedStudents = classroom.stream()
				.filter(s -> s.getMark() >= 5)
				.collect(Collectors.toList());
		
		approvedStudents.forEach(s -> System.out.println("Name: " + s.getName()));
		
		
		// Filter the students with mark equal or higher than 5, and aren't from PHP^
		System.out.println("\n4. Mark equal or greater then 5, excluding PHP\n");
		
		approvedStudents = classroom.stream()
				.filter(s -> s.getMark() >= 5 && !s.getCourse().equalsIgnoreCase("PHP"))
				.collect(Collectors.toList());
		approvedStudents.forEach(s -> System.out.println("Name: " + s.getName()));
		
		//Show all the Java students with 18+
		System.out.println("\n5. Java students with age 18+\n");
		
		JavaStudents = classroom.stream()
				.filter(s -> s.getAge() >= 18 && s.getCourse().equalsIgnoreCase("Java"))
				.collect(Collectors.toList());
		JavaStudents.forEach(s -> System.out.println("Name: " + s.getName()));

		
		/* 
		Filtra la llista per tots els alumnes que el seu nom comença per ‘a’. Assigna a aquests alumnes a una altra  llista i  mostra per pantalla la nova llista (tot  amb lambdes). 
		Filtra i mostra per pantalla els alumnes que tenen una nota de 5 o superior. 
		Filtra i mostra per pantalla els alumnes que tenen un nota de 5 o més, i que no són de PHP.  
		Mostra tots els alumnes que fan JAVA i són majors d’edat.*/

	}

}
