package modelo;

import java.util.LinkedList;

public class GabineteSeguranca {
	private String nome;
	private LinkedList<Seguranca> segurancas;
	private boolean aberta;

	public GabineteSeguranca(String nome, boolean aberta) {
		this.nome = nome;
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


	public String getNome() {
		return nome;
	}

	public LinkedList<Seguranca> getSeguranca() {
		return new LinkedList<>(segurancas);
	}

	public boolean isAberta() {
		return aberta;
	}
}
