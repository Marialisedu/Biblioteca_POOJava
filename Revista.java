//Maria Eduarda da Silva Lima RA: 2614561

public class Revista extends Item {
    private String tipo;

    public Revista() {
    }

    public Revista(String nome, String tipo) {
        setNome(nome);
        this.tipo = tipo;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }
}