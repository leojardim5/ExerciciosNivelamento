package Ex8;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Integer> lotesDesorganizados = new ArrayList<Integer>();
        lotesDesorganizados.add(35);
        lotesDesorganizados.add(33);
        lotesDesorganizados.add(42);
        lotesDesorganizados.add(10);
        lotesDesorganizados.add(14);
        lotesDesorganizados.add(19);
        lotesDesorganizados.add(27);
        lotesDesorganizados.add(44);
        lotesDesorganizados.add(26);
        lotesDesorganizados.add(31);
        Questao8.organizarLotes(lotesDesorganizados);

        System.out.println("Resposta Questão 8: " + lotesDesorganizados);

    }
}
