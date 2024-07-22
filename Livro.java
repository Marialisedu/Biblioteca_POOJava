//Maria Eduarda da Silva Lima RA: 2614561

public class Livro extends Item {
    private String genero;

    public Livro() {
    }

    public Livro(String nome, String genero) {
        setNome(nome);
        this.genero = genero;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }
}