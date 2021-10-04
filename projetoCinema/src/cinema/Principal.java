package cinema;

public class Principal {
    public static void main(String[] args) {

        Filme f1 = new Filme();
        f1.getCategoria().genero.add("terror");
        f1.getCategoria().genero.add("acao");
        f1.setSessao("18:30");
        f1.avaliarFilme(4.5);
        f1.getAtores().add("eduardo de souza magalhaes");
        f1.getAtores().add("Pedro henrique da Costa");
        f1.getCategoria().setCategoriaDuracao("curta metragem");
        System.out.println(f1);




    }
}
