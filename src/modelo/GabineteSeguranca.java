package modelo;

import java.util.LinkedList;

public class GabineteSeguranca {
	private String nome;
	private LinkedList<Seguranca> seguranca;
	private boolean aberta;

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


	public String getNome() {
		return nome;
	}

	public LinkedList<Seguranca> getSeguranca() {
		return new LinkedList<>(seguranca);
	}

	public boolean isAberta() {
		return aberta;
	}
}
