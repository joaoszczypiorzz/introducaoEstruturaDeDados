package Listas.ListasSimples;

public class MainListaSimples {
    public static void main(String[] args) {
        ListaSimples listaSimples = new ListaSimples(5);
        listaSimples.adicionarElemento(null);
        listaSimples.adicionarElemento("Arroz");
        listaSimples.adicionarElemento("Peixe");
        listaSimples.adicionarElemento("Peixe");
        listaSimples.adicionarElemento("Arroz");
        listaSimples.exibirElementos();
        listaSimples.ultimoIndiceDe("Arroz");
    }
}
