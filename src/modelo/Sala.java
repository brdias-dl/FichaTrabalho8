package modelo;

import java.util.LinkedList;

public class Sala extends Divisao {
	private LinkedList<Aula> aulas;

	public Sala(String nome, boolean aberta) {
		super(nome, aberta);
		aulas = new LinkedList<>();
	}

	public void adicionar(Aula aula){
		if(aula == null || aulas.contains(aula)){
			return;
		}
		aulas.add(aula);
		aula.setSala(this);
	}

	public void remover(Aula aula){
		if(!aulas.contains(aula)) {
			return;
		}
		aulas.remove(aula);
	}

	public LinkedList<Aula> getAulas() {
		return new LinkedList<>(aulas);
	}

	public LinkedList<Aula> getAulas(Horario horario) {
		LinkedList<Aula> listaAuxiliar = new LinkedList<>();

		for (Aula aula: aulas) {
			if (aula.getHorario().isSobre(horario)){
				listaAuxiliar.add(aula);
			}
		}

		return listaAuxiliar;
	}

}


