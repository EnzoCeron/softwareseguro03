public class musica {
    private String nome;
    private double duracao;
    private String compositor;

    public musica(String nome, double duracao, String compositor) {
        this.nome = nome;
        this.duracao = duracao;
        this.compositor = compositor;
    }
    public String getCompositor() {
        return compositor;
    }
    public double getDuracao() {
        return duracao;
    }
    public String getNome() {
        return nome;
    }
}
