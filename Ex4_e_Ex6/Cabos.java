import java.util.List;
import java.util.PriorityQueue;

//Exercício 04

public class Cabos {
    private PriorityQueue<Integer> filaCabos;

    //recebe uma lista de cabos pelo seu comprimento
    public Cabos (List<Integer> listaCabos){
        filaCabos = new PriorityQueue<>();

        for (Integer cabo : listaCabos){
            this.filaCabos.add(cabo);
        }
    }

    public PriorityQueue<Integer> getFilaCabos() {
        return filaCabos;
    }

    public Integer menorCustoDeConexao (int distanciaConexao){
        Integer somaCabos  = filaCabos.poll();
        if (distanciaConexao <= somaCabos)
            return 0;
        while (distanciaConexao > somaCabos){
            if (filaCabos.size() == 0){
                System.out.println("Cabos esgotados");
                return -1;
            }
            somaCabos += filaCabos.poll();
        }
        return somaCabos;
    }
}
