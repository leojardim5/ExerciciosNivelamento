package Ex1;

import java.util.List;

public class Questao1 {
    public static List<Integer> gerarSequencia(List<Integer> listaSequencia) {

        Integer i = 0;
        while (listaSequencia.size() < 100) {
            Integer nextNum = listaSequencia.get(i) + listaSequencia.get(i + 1);
            listaSequencia.add(nextNum);
            i++;
        }
        System.out.println("Tamanho da lista: " + listaSequencia.size());
        return listaSequencia;
    }
}
