package modelo;

import java.util.LinkedList;

public class Aula extends Identificador {
    private String sumario;
    private Professor professor;
    private LinkedList<Aluno> alunos;
    private Horario horario;
    private Sala sala;

    public Aula(String nome, long numero, Horario horario, Sala sala) {
        this(nome, numero, horario, sala, null, new LinkedList<>());
    }

    public Aula(String nome, long numero, Horario horario, Sala sala, Professor professor, LinkedList<Aluno> alunos) {
        super(nome, numero);
        this.sumario = "";
        setProfessor(professor);
        this.alunos = new LinkedList<>();
        for (Aluno a : alunos) {
            adicionar(a);
        }
        this.horario = horario;
        setSala(sala);
    }

    public void adicionar(Aluno aluno) {
        if (aluno == null || alunos.contains(aluno)) {
            return;
        }
        alunos.add(aluno);
        aluno.adicionar(this);
    }

    public void adicionarLinhaSumario(String linha) {
        StringBuilder sb = new StringBuilder(sumario);
        sb.append(linha).append('\n');
        sumario = sb.toString();
    }

    public void desassociarProfessor() {
        if (this.professor == null) {
            return;
        }

        this.professor.remover(this);
        this.professor = null;
    }

    public void remover(Aluno aluno) {
        // remove() -> protegido quanto aos null
        if (!alunos.contains(aluno)) {
            return;
        }
        alunos.remove(aluno);
        aluno.remover(this);
    }

    public void desassociarSala() {
        if (sala == null) {
            return;
        }
        sala.remover(this);
        sala = null;
    }

    /*
     * Getters and Setters
     */

    public String getSumario() {
        return sumario;
    }

    public Professor getProfessor() {
        return professor;
    }

    public LinkedList<Aluno> getAlunos() {
        return new LinkedList<>(alunos);
    }

    public void setProfessor(Professor professor) {
        if (professor == null || this.professor == professor) {
            return;
        }

        desassociarProfessor();

        this.professor = professor;
        this.professor.adicionar(this);
    }

    public Horario getHorario() {
        return horario;
    }

    public Sala getSala() {
        return sala;
    }

    public void setSala(Sala sala) {
        if (sala == null || this.sala == sala) {
            return;
        }

        if (this.sala != null) {
            this.sala.remover(this);
        }

        this.sala = sala;
        sala.adicionar(this);
    }
}
