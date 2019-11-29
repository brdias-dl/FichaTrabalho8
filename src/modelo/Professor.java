package modelo;

import java.util.LinkedList;

public class Professor extends PessoaComAulas {
	private GabineteProfessor gabinete;
	private LinkedList<Horario> horariosAtendimento;

	public Professor(String nome, long numero) {
		super(nome, numero);
	}

	@Override
	protected void associar(Aula aula) {
		aula.setProfessor(this);
	}

	@Override
	protected void desassociar(Aula aula) {
		aula.dessassociarProfessor();
	}

	@Override
	protected void escreverSumario(Aula aula) {
		aula.adicionarLinhaSumario(aula.getNome());
		aula.adicionarLinhaSumario(String.valueOf(aula.getNumero()));
		assinarSumario(aula);
		for (Aluno a : aula.getAlunos()) {
			a.preencherSumario(aula);
		}
	}

	public void abrirGabinete(){

	}

	public void fecharGabinete(){

	}

	public void abrir(Sala sala){

	}

	public void fechar(Sala sala){

	}

	public void  desassociarGabinete(){

	}

	public void adicionar(Horario horario){

	}

	public void remover(Horario horario){

	}

	/*
	*getter n setter
	 */

	public GabineteProfessor getGabinete() {
		return gabinete;
	}

	public LinkedList<Horario> getHorariosAtendimento() {
		return new LinkedList<>(horariosAtendimento);
	}

	public void setGabinete(GabineteProfessor gabinete) {
		this.gabinete = gabinete;
	}

}
