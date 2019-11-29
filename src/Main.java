import Ficha5.Arqueiro;
import Ficha5.Infataria;
import Ficha5.Soldado;
import modelo.*;

import java.util.LinkedList;

public class Main {

	public Main() {
		testarFicha8();
	}

	public static void main(String[] args) {
		new Main();
	}

	private void testarAula() {
		Professor p = new Professor("Marisa", 1);
		Aluno aluno = new Aluno("Bruno", 2);
		Aula a = new Aula("Artur", 3, new Horario(DiaSemana.QUARTA_FEIRA, 1, 1));

		LinkedList<Identificador> identificadores = new LinkedList<>();
		identificadores.add(p);
		identificadores.add(aluno);
		identificadores.add(a);

		for (Identificador identificador: identificadores) {
			if (identificador instanceof Pessoa){
				System.out.println(identificador);
			}
			System.out.println(identificador.getClass());
		}


	}

	private void testarFicha5() {
		Arqueiro arqueiro = new Arqueiro("Nabiça");
		Infataria infantaria = new Infataria("Nubile");

		arqueiro.atacar();
		infantaria.atacar();
	}

	private void testarFicha8(){

	}
}
