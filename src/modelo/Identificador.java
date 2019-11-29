package modelo;

import java.util.LinkedList;

public class Identificador {
	protected String nome;
	protected long numero;

	public Identificador(String nome, long numero) {
		this.nome = nome;
		this.numero = numero;
	}

	public String getNome() {
		return this.nome;
	}

	public long getNumero() {
		return numero;
	}

	public void setNumero(long numero) {
		this.numero = numero;
	}

}
