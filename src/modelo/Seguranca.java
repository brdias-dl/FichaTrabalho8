package modelo;

import java.util.LinkedList;

public class Seguranca extends Pessoa {
	private GabineteSeguranca gabinete;
	private LinkedList<Horario> horariosAtendimento;

	public Seguranca(String nome, long numero, GabineteSeguranca gabinete) {
		super(nome, numero);
		setGabinete(gabinete);
		horariosAtendimento = new LinkedList<>();
	}

	public void abrir(Divisao gabinete){

	}

	public void fechar(Divisao gabinete){

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
		if (gabinete == null || this.gabinete == gabinete){
			return;
		}
		if(this.gabinete != null) {
			this.gabinete.remover(this);
		}
		this.gabinete = gabinete;
	}
}
