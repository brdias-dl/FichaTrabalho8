package modelo;

import java.util.LinkedList;

public class Sala extends Descritor{
	private String nome;
	private LinkedList<Aula> aulas;
	private boolean aberta;

	public Sala(String nome, boolean aberta) {
		super(nome);
		this.aberta = aberta;
		aulas = new LinkedList<>();
	}

	public void abrir(){

	}

	public void fechar(){

	}

	public void adicionarAula(){

	}

	public void removerAula(){

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


