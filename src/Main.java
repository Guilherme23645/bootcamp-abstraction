import br.com.dio.desafio.dominio.Course;
import br.com.dio.desafio.dominio.Mentorship;
import br.com.dio.desafio.dominio.Bootcamp;
import br.com.dio.desafio.dominio.Dev;
import java.time.LocalDate;

public class Main {
	public static void main(String[] args) {
		Course course1 = new Course();
		course1.setTitle("Java");
		course1.setDescription("This is a Java Course");
		course1.setHourLoad(100);

		Course course2 = new Course();
		course2.setTitle("Python");
		course2.setDescription("This is a Python Course");
		course2.setHourLoad(75);

		Mentorship mentorship = new Mentorship();
		mentorship.setTitle("JS Mentorship");
		mentorship.setDescription("This is a JS Mentorship");
		mentorship.setDate(LocalDate.now());

		/*System.out.println(course1);
		System.out.println(course2);
		System.out.println(mentorship);*/

		Bootcamp bootcamp = new Bootcamp();
		bootcamp.setName("Bootcamp Java Developer");
		bootcamp.setDescription("Every tool you need to become a Java Developer");
		bootcamp.getContents().add(course1);
		bootcamp.getContents().add(course2);
		bootcamp.getContents().add(mentorship);

		Dev dev1 = new Dev();
		dev1.setName("Alice");
		dev1.enrollBootcamp(bootcamp);
		System.out.println(dev1.getName());
		System.out.println();
		System.out.println("Enrolled contents"+dev1.getEnrolledContents());
		dev1.progress();
		System.out.println("Enrolled contents"+dev1.getEnrolledContents());
		System.out.println("Finished contents"+dev1.getFinishedContents());
		System.out.println("Total XP: "+dev1.calcTotalXp());
		System.out.println();

		System.out.println("========================================");

		System.out.println();
		Dev dev2 = new Dev();
		dev2.setName("Bob");
		dev2.enrollBootcamp(bootcamp);
		System.out.println(dev2.getName());
		System.out.println();
		System.out.println("Enrolled contents"+dev2.getEnrolledContents());
		dev2.progress();
		System.out.println("Enrolled contents"+dev2.getEnrolledContents());
		System.out.println("Finished contents"+dev2.getFinishedContents());
		System.out.println("Total XP: "+dev2.calcTotalXp());
	}
}
