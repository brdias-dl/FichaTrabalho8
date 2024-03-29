package modelo;

import java.util.LinkedList;

public class GabineteProfessor extends Divisao {
    private LinkedList<Professor> professores;

    public GabineteProfessor(String nome, boolean aberta) {
        super(nome, aberta);
        this.professores = new LinkedList<>();
    }

    public void adicionar(Professor professor){
        if (professor == null || professores.contains(professor)) {
            return;
        }
        professores.add(professor);
        professor.setGabinete(this);
    }

    public void remover(Professor professor){
        if (!professores.contains(professor)) {
            return;
        }
        professores.remove(professor);
        professor.desassociarGabinete();
    }

    /*
     * Getters and Setters
     */

    public LinkedList<Professor> getProfessores() {
        return new LinkedList<>(professores);
    }

}
