package modelo;

import java.util.LinkedList;

public class Aula extends Identificador {
	private Horario horario;
	private String sumario;
	private Professor professor;
	private LinkedList<Aluno> alunos;
	private Sala sala;

	public Aula(String nome, long numero, Horario horario) {
		this(nome, numero, horario, null, new LinkedList<>());
	}

	public Aula(String nome, long numero, Horario horario, Professor professor, LinkedList<Aluno> alunos) {
		super(nome, numero);
		this.horario = horario;
		this.sumario = "";
		setProfessor(professor);
		this.alunos = new LinkedList<>();
		for (Aluno a : alunos) {
			adicionar(a);
		}
	}

	public void adicionar(Aluno aluno) {
		if (aluno == null || alunos.contains(aluno)) {
			return;
		}
		alunos.add(aluno);
		aluno.adicionar(this);
	}


	public void adicionarLinhaSumario(String linha) {
		StringBuilder sb = new StringBuilder(sumario);
		sb.append(linha).append('\n');
		sumario = sb.toString();
	}

	public String getSumario() {
		return sumario;
	}

	public Professor getProfessor() {
		return professor;
	}

	public LinkedList<Aluno> getAlunos() {
		return new LinkedList<>(alunos);
	}

	public void setProfessor(Professor professor) {

		if (professor == null || this.professor == professor) {
			return;
		}

		dessassociarProfessor();


		this.professor = professor;
		this.professor.adicionar(this);
	}

	public void dessassociarProfessor() {
		if (professor == null) {
			return;
		}

		this.professor.remover(this);
		this.professor = null;
	}

	public void remover(Aluno aluno) {
		// remove () -> protegido quanto aos null
		if (alunos.contains(aluno)) {
			return;
		}
		alunos.remove(aluno);
		aluno.remover(this);
	}

	public void desassociarSala(){
		//TODO: Implementar
	}

	public Horario getHorario() {
		return horario;
	}

	public Sala getSala() {
		return sala;
	}

	public void setSala(Sala sala) {
		this.sala = sala;
	}
}