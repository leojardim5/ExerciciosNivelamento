package filaCircularSimples;

public class Player{

    protected int tamanho;
	protected Musica [] vetor;	
	protected int ini;	
	protected int n;		
	
	public Player(int tam)
	{
		tamanho = tam;
		vetor = new Musica[tamanho];
		ini = 0;
		n = 0;
	}
	
	public boolean vazia()
	{
		return (n == 0);
	}
	
	public boolean cheia()
	{
		return (n == tamanho);
	}

	public void ouvirMusica()
	{
        Musica musica = null;

		if (!this.vazia())
		{
			musica = vetor[ini];
			ini = (ini + 1) % tamanho;
			n--;
		} 

        System.out.println("Ouvindo "+ musica.getNome());
	}
	
	public boolean adicionaMusica(Musica musica)
	{
	  int fim;
	  
	  if ( !cheia() ) {
	    fim = (ini + n) % tamanho;
	    vetor[fim] = musica;
	    n++;
	    return true;
	  } 
	  else
	    return false;
	}
}
