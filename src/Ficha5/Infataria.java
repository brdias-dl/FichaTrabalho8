package Ficha5;

public class Infataria extends Soldado {

	public Infataria(String nome) {
		super(nome);
	}

	@Override
	public void atacar() {
		brandirEspada();
	}

	public void brandirEspada() {
		System.out.println("O membro da Infantaria " + nome + " brandiu a espada!");
	}
}
