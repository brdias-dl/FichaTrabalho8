import ficha5.Arqueiro;
import ficha5.Infantaria;
import ficha5.Soldado;
import modelo.*;

import java.util.Arrays;
import java.util.LinkedList;

public class Main {


    public Main () {
        testarAula();
        //testarFicha5();
    }

    private void testarAula () {
        System.out.println("Testing the System:\n");

        GabineteProfessor gabineteProfessor1 = new GabineteProfessor("DS.2.47", false);
        GabineteProfessor gabineteProfessor2 = new GabineteProfessor("DS.2.48", false);

        Professor professor1 = new Professor("Marisa", 1, gabineteProfessor1);
        Professor professor2 = new Professor("Roberto", 2, gabineteProfessor2);
        Sala sala1 = new Sala("Sala Brightstart 1", false);
        Sala sala2 = new Sala("Sala Brightstart 2", true);

        Horario horario1 = new Horario(DiaSemana.QUARTA_FEIRA, 9, 2);
        Horario horario2 = new Horario(DiaSemana.SEXTA_FEIRA, 14, 3);

        Aula aula1 = new Aula("TP - Programação Orientada aos Objetos", 123456789, horario1, sala1);
        Aula aula2 = new Aula("PL - Programação Orientada aos Objetos", 987654321, horario2, sala2);
        Aluno aluno1 = new Aluno("João", 100200301);
        Aluno aluno2 = new Aluno("David", 100200302);

        aula1.setProfessor(professor1);
        aula2.setProfessor(professor2);

        aula2.setProfessor(professor1);

        aula2.desassociarProfessor();

        aula1.adicionar(aluno1);
        aluno1.adicionar(aula1);
        aluno2.adicionar(aula1);

        professor1.preencherSumario(aula1);
        professor2.preencherSumario(aula2);

        System.out.println(aula1.getSumario());

        Professor professor3 = new Professor("Vítor Távora", 3, gabineteProfessor2);

        LinkedList<Aluno> alunos = new LinkedList<>();
        alunos.add(aluno1);
        alunos.add(aluno2);

        Horario horario3 = new Horario(DiaSemana.TERCA_FEIRA, 10, 3);

        Aula aula3 = new Aula("TP - Fundamentos de Programação", 123456777, horario3, sala1, professor3, alunos);

        professor3.preencherSumario(aula3);

        System.out.println(aula3.getSumario());

        LinkedList<Aula> aulasAluno1QuartaManha = aluno1.getAulas(
                new Horario(DiaSemana.QUARTA_FEIRA, 9, 4));

        LinkedList<Aula> aulasAluno1SegundaTarde = aluno1.getAulas(
                new Horario(DiaSemana.SEGUNDA_FEIRA, 14, 4));

        aula3.remover(aluno1);
        aluno1.adicionar(aula3);

        String nomeProfessor1 = professor1.getNome();

        /*
         * Testar Enum DiaSemana
         */

        System.out.println(DiaSemana.DOMINGO);
        System.out.println(DiaSemana.DOMINGO.ordinal());
        System.out.println(Arrays.toString(DiaSemana.values()));
        System.out.println(DiaSemana.values().length);
    }

    private void testarFicha5() {
        Infantaria infantaria = new Infantaria("Afonso");
        Arqueiro arqueiro = new Arqueiro("Robin");

        infantaria.atacar();
        arqueiro.atacar();
    }

    public static void main(String[] args) {
	    new Main();
    }


}
