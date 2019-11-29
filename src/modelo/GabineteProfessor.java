package modelo;

import java.util.LinkedList;

public class GabineteProfessor {
	private String nome;
	private LinkedList<Professor> professores;
	private boolean aberta;

	public GabineteProfessor(String nome, boolean aberta) {
		this.nome = nome;
		this.aberta = aberta;
		professores = new LinkedList<>();
	}

	public void abrir(){

	}

	public void fechar(){

	}

	public void adicionar(Professor professor){

	}


	public void remover(Professor professor){

	}



	/*
	*GETTERS N SETTERS
	 */

	public String getNome() {
		return nome;
	}

	public LinkedList<Professor> getProfessores() {
		return new LinkedList<>(professores);
	}

	public boolean isAberta() {
		return aberta;
	}
}
