public class Pilha
{
	private int n;
	private Pagina vetor[];
	private int topo;
	
	public Pilha()
	{
		n = 10;
		vetor = new Pagina[n];
		topo = -1;
	}
	
	public Pilha(int tamanho)
	{
		n = tamanho;
		vetor = new Pagina[tamanho];
		topo = -1;
	}
	
	public boolean vazia()
	{
		return topo == -1 ? true : false;
	}
	
	public boolean cheia()
	{
		return topo == n - 1 ? true : false;
	}
	
	public void voltarPagina()
	{
		Pagina c = null;
		
		if (!this.vazia())
		{	
			topo--;
			System.out.println("retornando a pagina anterior");
		}
		else
		{
			System.out.println("Não há mais nenhuma pagina");
		}
	}
	
	public boolean clicarEmNovaPagina(Pagina pagina)
	{
		if (!this.cheia())
		{	
			vetor[++topo] = pagina;
			return true;
		}
		else
		{
			return false;
		}
	}
	
	public String paginaAtual()
	{
		Pagina elemento = null;

		if(!this.vazia())
		{
			elemento = vetor[topo];         
		}
		else
		{
			System.out.println("Pilha vazia.");
		}

		return elemento.retornaNome();
	}
}