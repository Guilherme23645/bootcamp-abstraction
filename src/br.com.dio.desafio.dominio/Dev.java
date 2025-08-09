package br.com.dio.desafio.dominio;

import java.util.Set;
import java.util.LinkedHashSet;
import java.util.Objects;


public class Dev {
	private String name;
	private Set<Content> enrolledContents = new LinkedHashSet<>();
	private Set<Content> finishedContents = new LinkedHashSet<>();
	
	public void enrollBootcamp(Bootcamp bootcamp) {
		
	}

	public void progress() {
	
	}

	public void calcXp() {

	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Set<Content> getEnrolledContents() {
		return enrolledContents;
	}

	public void setEnrolledContents(Set<Content> enrolledContents) {
		this.enrolledContents = enrolledContents;
	}

	public Set<Content> getFinishedContents() {
		return finishedContents;
	}

	public void setFinishedContents(Set<Content> finishedContents) {
		this.finishedContents = finishedContents;
	}

	@Override
	public boolean equals(Object o) {
		if (this == o) return true;
		if (o == null || getClass() != o.getClass()) return false;
		Dev dev = (Dev) o;
		return Objects.equals(name, dev.name) && Objects.equals(enrolledContents, dev.enrolledContents) && Objects.equals(finishedContents, dev.finishedContents);
	}

	@Override
	public int hashCode() {
		return Objects.hash(name, enrolledContents, finishedContents);
	}
}


















