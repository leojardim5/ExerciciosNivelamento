public class Main {
    public static void main(String args[]){

    Pagina pagina_1 = new Pagina("pagina 1");
    Pagina pagina_2 = new Pagina("pagina 2");
    Pagina pagina_3 = new Pagina("pagina 3");
    
    Pilha pilha = new Pilha();

    pilha.clicarEmNovaPagina(pagina_1);
    pilha.clicarEmNovaPagina(pagina_2);
    pilha.clicarEmNovaPagina(pagina_3);
    

    System.out.println(pilha.paginaAtual());

    pilha.voltarPagina();

    System.out.println(pilha.paginaAtual());
    }
}
