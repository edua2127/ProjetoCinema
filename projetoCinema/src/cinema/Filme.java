package cinema;
import java.util.ArrayList;
import java.util.List;

public class Filme {
    CategoriaDeFilme categoria = new CategoriaDeFilme();
    String Sessao;
    double nota;

    public double getNota() {
        return nota;
    }

    public void avaliarFilme(double nota) {
        this.nota = nota;
    }

    List<String>atores = new ArrayList<String>();

    public CategoriaDeFilme getCategoria() {
        return categoria;
    }

    public void setCategoria(CategoriaDeFilme categoria) {
        this.categoria = categoria;
    }

    public String getSessao() {
        return Sessao;
    }

    public void setSessao(String sessao) {
        Sessao = sessao;
    }

    public List<String> getAtores() {
        return atores;
    }

    public void setAtores(List<String> atores) {
        this.atores = atores;
    }

    @Override
    public String toString() {
        return "Filme: " +
                "\ncategoria=" + categoria +
                "\nSessao='" + Sessao + '\'' +
                "\natores=" + atores + "\nnota do filme: " + nota;

    }
}
