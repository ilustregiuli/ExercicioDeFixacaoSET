package secao19_ex01;


import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class App {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		Instrutor alex = new Instrutor("Alex Kidd");
		Curso curso_A = new Curso("A",alex);
		Curso curso_B = new Curso("B",alex);
		Curso curso_C = new Curso("C",alex);
		
		alex.cursos.add(curso_A);
		alex.cursos.add(curso_B);
		alex.cursos.add(curso_C);
		
		System.out.println("Cursos do professor Alex Kidd: ");
		for(Curso curso : alex.getCursos()) {
			System.out.println(curso.getName());
		}
		
		Set<Usuario> alunosAlex = new HashSet<>();
		
		System.out.println("*****************Quantos alunos no curso " +alex.getCursos().get(0).getName() + "?");
		int alunosA = sc.nextInt();
		for(int i = 0; i < alunosA; i++) {
			System.out.println("Digite o código do aluno: ");
			int cod = sc.nextInt();
			alunosAlex.add(new Usuario(cod));
		}
			
		System.out.println("*****************Quantos alunos no curso " +alex.getCursos().get(1).getName() + "?");
		int alunosB = sc.nextInt();
		for(int i = 0; i < alunosB; i++) {
			System.out.println("Digite o código do aluno: ");
			int cod = sc.nextInt();
			alunosAlex.add(new Usuario(cod));
		}
		
		System.out.println("*****************Quantos alunos no curso " +alex.getCursos().get(2).getName() + "?");
		int alunosC = sc.nextInt();
		for(int i = 0; i < alunosC; i++) {
			System.out.println("Digite o código do aluno: ");
			int cod = sc.nextInt();
			alunosAlex.add(new Usuario(cod));
		}
		
		System.out.println("Total de alunos do Professor Alex Kidd: ");
		System.out.println(alunosAlex.size());
		
		sc.close();

	}

}
