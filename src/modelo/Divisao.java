package modelo;

public class Divisao extends Descritor {
    protected boolean aberta;

    public Divisao(String nome, boolean aberta) {
        super(nome);
        this.aberta = aberta;
    }

    public void abrir(){
        this.aberta = true;
    }

    public void fechar(){
        this.aberta = false;
    }

    /*
     * Getter and Setters
     */

    public boolean isAberta() {
        return aberta;
    }
}
