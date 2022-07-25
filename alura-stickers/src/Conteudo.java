public class Conteudo {

    private final String titulo;
    private final String urlImagem;

    public Conteudo(String titulo, String urlImagem) {
        //deste objeto para o parametro
        this.titulo = titulo;
        this.urlImagem = urlImagem;
    }

    public String getTitulo() {
        return titulo;
    }
    public String getUrlImagem() {
        return urlImagem;
    }


}
