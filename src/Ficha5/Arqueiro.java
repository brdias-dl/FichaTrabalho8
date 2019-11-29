package Ficha5;

public class Arqueiro extends Soldado {

	public Arqueiro(String nome) {
		super(nome);
	}

	@Override
	public void atacar() {
		dispararArco();
	}

	public void dispararArco() {
		System.out.println("O arqueiro " + nome + " disparou o arco!");
	}
}
