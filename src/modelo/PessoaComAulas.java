package modelo;

import java.util.LinkedList;

public abstract class PessoaComAulas extends Pessoa {
	protected LinkedList<Aula> aulas;

	public PessoaComAulas(String nome, long numero) {
		super(nome, numero);
		this.aulas = new LinkedList<Aula>();
	}

	protected abstract void associar(Aula aula);

	public void adicionar(Aula aula) {
		if (aula == null || aulas.contains(aula)) {
			return;
		}
		aulas.add(aula);
		associar(aula);
	}

	protected abstract void desassociar(Aula aula);

	public void remover(Aula aula) {
		if (!aulas.contains(aula)) {
			return;
		}
		aulas.remove(aula);
		desassociar(aula);
	}

	protected abstract void escreverSumario(Aula aula);

	public void preencherSumario(Aula aula) {
		if (!aulas.contains(aula)) {
			return;
		}

		escreverSumario(aula);
	}

	public LinkedList<Aula> getAulas() {
		return new LinkedList<>(aulas);
	}

	public LinkedList<Aula> getAulas(Horario horario) {
		LinkedList<Aula> listaAuxiliar = new LinkedList<>();
		for (Aula elementoAula : aulas) {
			if (elementoAula.getHorario().isSobre(horario)) {
				listaAuxiliar.add(elementoAula);
			}
		}

		return listaAuxiliar;
	}

	protected void assinarSumario(Aula aula){
		aula.adicionarLinhaSumario(nome);
	}
}
