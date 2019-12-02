package ficha9;

public class Cozinheiro extends Pessoa {
	private String utensilio;

	public Cozinheiro(String nome, String utensilio) {
		super(nome);
		this.utensilio = utensilio;
	}

	@Override
	public void atacar() {
		System.err.println("MAMA MIAAAAAAAAAAAA!");
	}
}
