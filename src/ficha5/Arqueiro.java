package ficha5;

public class Arqueiro extends Soldado {


    public Arqueiro(String nome) {
        super(nome);
    }

    @Override
    public void atacar() {
        dispararArco();
    }

    private void dispararArco() {
        System.out.println("O arqueiro " + nome + " disparou o arco!");
    }
}
