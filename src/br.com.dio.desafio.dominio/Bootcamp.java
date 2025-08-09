package br.com.dio.desafio.dominio;

public class Bootcamp {
	private String name;
	private String description;
	private LocalDate initialDate;
	private LocalDate finalDate;
	private List<Mentorship> mentorships = new ArrayList<>();
	private List<Course> courses = new ArrayList<>();
	private List<Dev> devs = new ArrayList<>();
}
