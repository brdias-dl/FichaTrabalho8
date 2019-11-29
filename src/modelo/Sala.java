package modelo;

import java.util.LinkedList;

public class Sala {
	private String nome;
	private LinkedList<Aula> aulas;
	private boolean aberta;

	public void abrir() {

	}

	public void fechar() {

	}

	public void adicionarAula() {

	}

	public void removerAula() {

	}


	public String getNome() {
		return nome;
	}

	public LinkedList<Aula> getAulas() {
		return new LinkedList<>(aulas);
	}

	public LinkedList<Aula> getAulas(Horario horario) {
		//TODO: Implementar
		return new LinkedList<>(aulas);
	}

	public boolean isAberta() {
		return aberta;
	}

}


