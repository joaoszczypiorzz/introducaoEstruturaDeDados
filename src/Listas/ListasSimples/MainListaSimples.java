package Listas.ListasSimples;

public class MainListaSimples {
    public static void main(String[] args) {
        ListaSimples listaSimples = new ListaSimples(5);
        listaSimples.adicionarElemento("Arroz");
        listaSimples.adicionarElemento("seila");
        listaSimples.adicionarElemento("Batata");
        listaSimples.adicionarElemento("Arroz2");
        listaSimples.adicionarElemento("Feijão2");
        listaSimples.exibirElementos();
        listaSimples.removerTodas("Arroz");
    }
}
