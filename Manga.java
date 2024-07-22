//Maria Eduarda da Silva Lima RA: 2614561

public class Manga extends Item {
    private String estilo;

    public Manga() {
    }

    public Manga(String nome, String estilo) {
        setNome(nome);
        this.estilo = estilo;
    }

    public String getEstilo() {
        return estilo;
    }

    public void setEstilo(String estilo) {
        this.estilo = estilo;
    }
}
