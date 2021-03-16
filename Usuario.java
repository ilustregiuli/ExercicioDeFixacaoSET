package secao19_ex01;

import java.util.ArrayList;
import java.util.List;

public class Usuario {
	

	private int idUser;
	
	private List<Curso> cursos = new ArrayList<>();
	
	public Usuario() {
		
	}
	
	public Usuario(int idUser) {
		this.idUser = idUser;
	}
	
	
	public void setIdUser(int idUser) {
		this.idUser = idUser;
	}
	
	
	public int getIdUser() {
		return this.idUser;
	}

	public List<Curso> getCursos() {
		return cursos;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + idUser;
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Usuario other = (Usuario) obj;
		if (idUser != other.idUser)
			return false;
		return true;
	}

	

}
