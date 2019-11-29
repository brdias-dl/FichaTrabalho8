package modelo;

public class Divisao extends Descritor {
	protected boolean aberta;

	public Divisao(String nome, boolean aberta) {
		super(nome);
		this.aberta = aberta;
	}

	public void abrir(){

	}

	public void fechar(){

	}

	public boolean isAberta() {
		return aberta;
	}
}
