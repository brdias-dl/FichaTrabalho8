package modelo;

import java.util.LinkedList;

public class Seguranca extends Pessoa {
    private GabineteSeguranca gabinete;
    private LinkedList<Horario> horariosAtendimento;

    public Seguranca(String nome, long numero, GabineteSeguranca gabinete) {
        super(nome, numero);
        setGabinete(gabinete);
        horariosAtendimento = new LinkedList<>();
    }

    public void abrirGabinete() {
        if (gabinete == null || gabinete.isAberta()) {
            return;
        }
        gabinete.abrir();
    }

    public void fecharGabinete() {
        if (gabinete == null || !gabinete.isAberta()) {
            return;
        }
        gabinete.fechar();
    }

    public void abrir(Divisao divisao){
        if (divisao == null || divisao.isAberta()) {
            return;
        }
        divisao.abrir();
    }

    public void fechar(Divisao divisao){
        if (divisao == null || !divisao.isAberta()) {
            return;
        }
        divisao.fechar();
    }

    public void desassociarGabinete() {
        if (gabinete == null) {
            return;
        }
        gabinete.remover(this);
        gabinete = null;
    }

    public void adicionar(Horario horario) {
        if (horariosAtendimento.contains(horario)) {
            return;
        }
        horariosAtendimento.add(horario);
    }

    public void remover(Horario horario) {
        horariosAtendimento.remove(horario);
    }

    /*
     * Getters and Setters
     */

    public GabineteSeguranca getGabinete() {
        return gabinete;
    }

    public void setGabinete(GabineteSeguranca gabinete) {
        if (gabinete == null || this.gabinete == gabinete) {
            return;
        }

        if (this.gabinete != null) {
            this.gabinete.remover(this);
        }

        this.gabinete = gabinete;
        gabinete.adicionar(this);
    }

    public LinkedList<Horario> getHorariosAtendimento() {
        return new LinkedList<>(horariosAtendimento);
    }
}
