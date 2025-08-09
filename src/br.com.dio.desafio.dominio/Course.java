package br.com.dio.desafio.dominio;

public class Course {
	private String title;
	private String description;
	private int hourLoad;

	public Course() {

	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public int getHourLoad() {
		return hourLoad;
	}

	public void setHourLoad(int hourLoad) {
		this.hourLoad = hourLoad;
	}

	@Override
	public String toString() {
		return "Course{"+
			"title='"+title+'\''+
			", description='"+description+'\''+
			", hourLoad='"+hourLoad+'\''+
			'}';
	}
}
