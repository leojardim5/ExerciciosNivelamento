package filaCircularSimples;
import java.util.Scanner;

public class Main
{
	public static void main(String args[])
	{
		Player playlistSpotify = new Player(100);
		Musica fulminante = new Musica("Fulminante");
		Musica sinais = new Musica("Sinais");
		Musica ate_que_durou = new Musica("Até que Durou");
		

		playlistSpotify.adicionaMusica(fulminante);
		playlistSpotify.adicionaMusica(ate_que_durou);
		playlistSpotify.adicionaMusica(sinais);

		playlistSpotify.ouvirMusica();
		playlistSpotify.ouvirMusica();
		playlistSpotify.ouvirMusica();
		

	}
}
