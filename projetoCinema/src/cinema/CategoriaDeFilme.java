package cinema;

import java.util.ArrayList;
import java.util.List;

public class CategoriaDeFilme {

    List<String> genero = new ArrayList<String>();

    String categoriaDuracao;

    public CategoriaDeFilme() {
    }

    public List<String> getGenero() {
        return genero;
    }

    public void setGenero(List<String> categoria) {
        this.genero = categoria;
    }

    public String getCategoriaDuracao() {
        return categoriaDuracao;
    }

    public void setCategoriaDuracao(String categoriaDuracao) {
        this.categoriaDuracao = categoriaDuracao;
    }

    @Override
    public String toString() {
        return "CategoriaDeFilme{" +
                "genero=" + genero +
                ", categoriaDuracao='" + categoriaDuracao + '\'' +
                '}';
    }
}
