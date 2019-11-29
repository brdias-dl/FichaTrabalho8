package modelo;

import java.util.LinkedList;

public class Seguranca {
	private String nome;
	private long numero;
	private GabineteSeguranca gabinete;
	private LinkedList<Horario> horariosAtendimento;

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

	public long getNumero() {
		return numero;
	}

	public void setNumero(long numero) {
		this.numero = numero;
	}

	public String getNome() {
		return nome;
	}

	public GabineteSeguranca getGabinete() {
		return gabinete;
	}

	public LinkedList<Horario> getHorariosAtendimento() {
		return new LinkedList<>(horariosAtendimento);
	}
}
