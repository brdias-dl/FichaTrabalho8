package modelo;

public class Aluno extends Pessoa {


	public Aluno(String nome, long numero) {
		super(nome, numero);
	}

	@Override
	protected void associar(Aula aula) {
		aula.adicionar(this);
	}

	public void adicionar(Aula aula) {
		super.adicionar(aula);
	}

	@Override
	public void desassociar(Aula aula) {
		aula.remover(this);
	}


	public void remover(Aula aula) {
		super.remover(aula);
	}

	@Override
	protected void escreverSumario(Aula aula) {
		super.assinarSumario(aula);
	}
}