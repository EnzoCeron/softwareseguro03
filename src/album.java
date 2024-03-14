import java.util.ArrayList;

public class album {
    private int ano_lancamento;
    private String nome;
    private ArrayList<musica> musicas;
   

    public album(int ano_lancamento, String nome, ArrayList<musica> musicas) {
        this.ano_lancamento = ano_lancamento;
        this.nome = nome;
        this.musicas = musicas;
    }
}