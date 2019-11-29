package modelo;

import java.util.LinkedList;

public class Seguranca extends Pessoa {
	private GabineteSeguranca gabinete;
	private LinkedList<Horario> horariosAtendimento;

	public Seguranca(String nome, long numero, GabineteSeguranca gabinete) {
		super(nome, numero);
		setGabinete(gabinete);
	}

	public void abrirGabinete(){

	}

	public void fecharGabinete(){

	}

	public void abrir(GabineteSeguranca gabinete){

	}

	public void fechar(GabineteSeguranca gabinete){

	}

	public void abrir(GabineteProfessor gabinete){

	}

	public void fechar(GabineteProfessor gabinete){

	}

	public void desassociarGabinete(){
		//TODO: IMPLEMENTAR
	}

	public void adicionar(Horario horario){

	}

	public void remover(Horario horario){

	}



	/*
	* G N S
	 */

	public GabineteSeguranca getGabinete() {
		return gabinete;
	}

	public LinkedList<Horario> getHorariosAtendimento() {
		return new LinkedList<>(horariosAtendimento);
	}

	public void setGabinete(GabineteSeguranca gabinete) {
		this.gabinete = gabinete;
	}
}
