package model;

public class Livro {
    private int id;
    private String titulo;
    private String autor;
    private String dataPublicacao;
    private String categoria;

    public Livro() {
    }

    public Livro(int id, String titulo, String autor, String dataPublicacao, String categoria) {
        this.id = id;
        this.titulo = titulo;
        this.autor = autor;
        this.dataPublicacao = dataPublicacao;
        this.categoria = categoria;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public String getDataPublicacao() {
        return dataPublicacao;
    }

    public void setDataPublicacao(String dataPublicacao) {
        this.dataPublicacao = dataPublicacao;
    }

    public String getCategoria() {
        return categoria;
    }

    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }

    @Override
    public String toString() {
        return "Livro{" +
                "id=" + id +
                ", titulo='" + titulo + '\'' +
                ", autor='" + autor + '\'' +
                ", dataPublicacao='" + dataPublicacao + '\'' +
                ", categoria='" + categoria + '\'' +
                '}';
    }
}

