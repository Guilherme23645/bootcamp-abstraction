package br.com.dio.desafio.dominio;

public class Course extends Content {
	private int hourLoad;

	public Course() {

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
			"title='"+getTitle()+'\''+
			", description='"+getDescription()+'\''+
			", hourLoad='"+getHourLoad()+'\''+
			'}';
	}

	@Override
	public double calcXp() {
		return STANDARD_XP * hourLoad;
	}
}
