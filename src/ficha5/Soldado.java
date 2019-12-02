package ficha5;

public abstract class Soldado {

    protected String nome;

    public Soldado(String nome) {
        this.nome = nome;
    }

    public abstract void atacar();
}
