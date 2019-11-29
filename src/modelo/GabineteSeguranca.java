package modelo;

import java.util.LinkedList;

public class GabineteSeguranca extends Descritor {
	private LinkedList<Seguranca> segurancas;
	private boolean aberta;

	public GabineteSeguranca(String nome, boolean aberta) {
		super(nome);
		this.aberta = aberta;
		this.segurancas = new LinkedList<>();
	}

	public void abrir(){

	}

	public void fechar(){

	}

	public void adicionar(Seguranca segurancar){

	}


	public void remover(Seguranca seguranca){

	}

	/*
	* G N S
	 */

	public LinkedList<Seguranca> getSeguranca() {
		return new LinkedList<>(segurancas);
	}

	public boolean isAberta() {
		return aberta;
	}
}
