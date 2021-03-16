package secao19_ex01;

import java.util.ArrayList;
import java.util.List;

public class Instrutor {
	
	public String name;
	
	public List<Curso> cursos = new ArrayList<>();
	
	
	public Instrutor() {
		
	}

	public Instrutor(String name) {
		this.name = name;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public List<Curso> getCursos() {
		return cursos;
	}

	
	

}
