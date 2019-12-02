package ficha9;

public class Cavaleiro extends Pessoa {
	private String espada;
	
	public Cavaleiro(String nome) {
		super(nome);
		this.espada = espada;
	}

	@Override
	public void atacar() {
		System.err.println("AAAAAAAAAA!");
	}
}
