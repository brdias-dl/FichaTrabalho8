package modelo;

import java.util.LinkedList;

public class Professor extends PessoaComAulas {
	private GabineteProfessor gabinete;
	private LinkedList<Horario> horariosAtendimento;

	public Professor(String nome, long numero, GabineteProfessor gabinete ) {
		super(nome, numero);
		setGabinete(gabinete);
		this.horariosAtendimento = new LinkedList<>();
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

	public void abrirGabinete() {
		if (gabinete == null || gabinete.isAberta()){
			return;
		}
		gabinete.abrir();
	}

	public void fecharGabinete(){
		if(gabinete == null || !gabinete.isAberta()){
			return;
		}
		gabinete.fechar();
	}

	public void abrir(Sala sala){

	}

	public void fechar(Sala sala){

	}

	public void  desassociarGabinete(){
		if (gabinete == null){
			return;
		}

		gabinete.remover(this);
		gabinete = null;
	}

	public void adicionar(Horario horario){
		if(horariosAtendimento.contains(horario)){
			return;
		}
		horariosAtendimento.add(horario);
	}

	public void remover(Horario horario){
		horariosAtendimento.remove(horario);
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
		if (gabinete == null || this.gabinete == gabinete) {
			return;
		}
		if (this.gabinete != null){
			this.gabinete.remover(this);
		}
		this.gabinete = gabinete;
		gabinete.adicionar(this);
	}

}
