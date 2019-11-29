package modelo;

import java.util.LinkedList;

public class Sala extends Divisao {
	private LinkedList<Aula> aulas;

	public Sala(String nome, boolean aberta) {
		super(nome, aberta);
		this.aulas = new LinkedList<>();

	}

	public void adicionar(Aula aula) {
		if (aula == null || aulas.contains((aula))) {
			return;
		}
		aulas.add(aula);
		aula.setSala(this);
	}

	public void remover(Aula aula) {
		if (!aulas.contains(aula)) {
			return;
		}
		aulas.remove(aula);
		aula.desassociarSala();
	}


	/*
	 * G N S
	 */


	public LinkedList<Aula> getAulas() {
		return new LinkedList<>(aulas);
	}

	public String getNome() {
		return nome;
	}


	public LinkedList<Aula> getAulas(Horario horario) {
		LinkedList<Aula> listaAuxiliar = new LinkedList<>();

		for (Aula a : aulas) {
			if (a.getHorario().isSobre(horario)) {
				listaAuxiliar.add(a);
			}
		}
		return new LinkedList<>(aulas);
	}

}
