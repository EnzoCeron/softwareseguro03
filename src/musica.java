public class musica {
    private String titulo;
    private String compositor;
    private float duracao;

    public musica(String titulo, String compositor, float duracao) {
        this.titulo = titulo;
        this.compositor = compositor;
        this.duracao = duracao;
    }

    public String getTitulo() {
        return titulo;
    }

    public String getCompositor() {
        return compositor;
    }

    public float getDuracao() {
        return duracao;
    }
}
