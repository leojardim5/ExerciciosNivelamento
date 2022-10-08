package Ex8;

import java.util.List;

public class Questao8 {
    public static void organizarLotes(List<Integer> listaLotes) {
        ordenacaoRapida(listaLotes, 0, listaLotes.size() - 1);
    }

    public static void ordenacaoRapida(List<Integer> lista, Integer esquerda, Integer direita) {
        Integer pivot = esquerda;
        Integer i = esquerda;
        Integer j = esquerda;
        Integer auxiliar = esquerda;

        for (i = esquerda + 1; i <= direita; i++) {
            j = i;
            if (lista.get(j) < lista.get(pivot)) {
                auxiliar = lista.get(j);
                while (j > pivot) {
                    lista.set(j, lista.get(j - 1));
                    j--;
                }
                lista.set(j, auxiliar);
                pivot++;
            }
        }
        if (pivot + 1 <= direita) {
            ordenacaoRapida(lista, pivot + 1, direita);
        }
        if (pivot - 1 >= esquerda) {
            ordenacaoRapida(lista, esquerda, pivot - 1);
        }

    }
}
