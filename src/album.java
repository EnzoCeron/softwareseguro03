public class album {
    private String genero;
    private String artista;
    private int ano;
    private String nome;
    private String musicas;

    public album(String genero, String artista, int ano, String nome, String musicas) {
        this.genero = genero;
        this.artista = artista;
        this.ano = ano;
        this.nome = nome;
        this.musicas = musicas;
    }

    public String getGenero() {
        return genero;
    }

    public String getArtista() {
        return artista;
    }

    public int getAno() {
        return ano;
    }

    public String getNome() {
        return nome;
    }

    public String getMusicas() {
        return musicas;
    }
}
