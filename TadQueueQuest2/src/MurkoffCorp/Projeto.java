package MurkoffCorp;

public class Projeto {
    private String ideia;
    private String titulo;

    public Projeto(String ideia, String titulo) {
        this.ideia = ideia;
        this.titulo = titulo;
    }

    public Projeto(String titulo) {
        this.titulo = titulo;
    }

    public String getIdeia() {
        return ideia;
    }

    public void setIdeia(String ideia) {
        this.ideia = ideia;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }
    

    @Override
    public String toString() {
        return "Projeto [ideia= " + ideia + ", titulo= " + titulo + "]";
    }

    @Override
    public boolean equals(Object obj) {
        if (obj instanceof Projeto) {
            Projeto title = (Projeto) obj;
            return this.titulo.equals(title.titulo);
        }
        return false;
    }
}
