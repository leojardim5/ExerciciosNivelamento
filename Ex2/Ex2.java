package nivelamento;

import java.util.Collections;
import java.util.LinkedList;

public class Ex2 {

	public static void main(String[] args) {

		// Questão 2

		LinkedList<Integer> lista = new LinkedList<>();

		lista.add(1);
		lista.add(5);
		lista.add(4);
		lista.add(3);
		lista.add(2);
		lista.add(6);
		lista.add(7);

		System.out.println("Lista não ordenada: " + lista);

		Collections.sort(lista);

		System.out.println("Lista ordenada: " + lista);

	}
}
