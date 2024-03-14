import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        // Cria um álbum
        album album1 = new album(2019, "We Love You Tecca", new ArrayList<musica>());
        // Cria as musicas
        musica song1 = new musica("Ransom", 2.11, "Lil Tecca");

        musica song2 = new musica("Shots", 1.49, "Lil Tecca");

        musica song3 = new musica("Sidenote", 2.00, "Lil Tecca");

        musica song4 = new musica("Did it Again", 1.54, "Lil Tecca");

        musica song5 = new musica("Out of Luck", 2.11, "Lil Tecca");

        musica song6 = new musica("Left, Right", 2.11, "Lil Tecca");

        musica song7 = new musica("Bossanova", 2.11, "Lil Tecca");

        musica song8 = new musica("Amigo", 2.11, "Lil Tecca");
        
        // Add the song to the album
        album1.musicas.add(song1);
        album1.musicas.add(song2);
        album1.musicas.add(song3);
        album1.musicas.add(song4);
        album1.musicas.add(song5);
        album1.musicas.add(song6);
        album1.musicas.add(song7);
        album1.musicas.add(song8);
    }
}