import br.com.dio.desafio.dominio.Course;
import br.com.dio.desafio.dominio.Mentorship;
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

		System.out.println(course1);
		System.out.println(course2);
		System.out.println(mentorship);
	}
}
