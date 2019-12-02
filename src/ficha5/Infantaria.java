package ficha5;

public class Infantaria extends Soldado {

    public Infantaria(String nome) {
        super(nome);
    }

    @Override
    public void atacar() {
        brandirEspada();
    }

    private void brandirEspada() {
        System.out.println("O membro da infantaria " + nome + " brandiu a espada!");
    }
}
