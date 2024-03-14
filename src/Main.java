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
        
        // Adiciona as musicas ao álbum
        album1.getMusicas().add(song1);
        album1.getMusicas().add(song2);
        album1.getMusicas().add(song3);
        album1.getMusicas().add(song4);
        album1.getMusicas().add(song5);
        album1.getMusicas().add(song6);
        album1.getMusicas().add(song7);
        album1.getMusicas().add(song8);

        // Imprime as musicas do álbum
        System.out.println("Álbum: " + album1.getNome() + " - Ano de lançamento: " + album1.getAno_lancamento());
        for (musica song : album1.getMusicas()) {
            System.out.println("Nome: " + song.getNome() + " - Duração: " + song.getDuracao() + " - Compositor: " + song.getCompositor());
        }
    }
}