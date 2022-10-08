package Ex1;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        List<Integer> listaInicial = new ArrayList<>();
        listaInicial.add(1);
        listaInicial.add(7);
        listaInicial.add(2);
        listaInicial.add(9);
        System.out.println("Resposta da Questão 1: " + Questao1.gerarSequencia(listaInicial));

    }
}
