package secao19_ex01;

import java.util.ArrayList;
import java.util.List;

public class Curso {
	
	private String name;
	private Instrutor instrutor;
	
	private List<Usuario> usuarios = new ArrayList<>();
	
	public Curso() {
		
	}
	
	public Curso(String name, Instrutor instrutor) {
		this.name = name;
		this.instrutor = instrutor;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Instrutor getInstrutor() {
		return instrutor;
	}

	public void setInstrutor(Instrutor instrutor) {
		this.instrutor = instrutor;
	}
	
	public List<Usuario> getUsuarios(){
		return this.usuarios;
	}
	

}
