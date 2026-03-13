package Listas.ListasSimples;

public class MainListaSimples {
    public static void main(String[] args) {
        ListaSimples lista = new ListaSimples(5);

        lista.adicionarElemento("Gato");
        lista.adicionarElemento("Cachorro");
        lista.adicionarElemento("Gato");

        System.out.println("\n--- Adicionando vários de uma vez ---");
        String[] maisBichos = {"Papagaio", "Peixe", "Tartaruga"};
        lista.adicionarVarios(maisBichos);
        lista.exibirElementos();

        System.out.println("\n--- Inserindo no índice 2 ---");
        lista.inserir(2, "Coelho");

        System.out.println("\n--- Pegando elemento do índice 3 ---");
        lista.obter(3);

        System.out.println("\n--- Contando quantos elementos tem ---");
        lista.contar();

        System.out.println("\n--- Quantas vezes 'Gato' aparece? ---");
        lista.contarOcorrencias("Gato");

        System.out.println("\n--- Qual o último índice de 'Gato'? ---");
        lista.ultimoIndiceDe("Gato");

        System.out.println("\n--- Trocando 'Gato' por 'Leão' ---");
        lista.substituir("Gato", "Leão");

        System.out.println("\n--- Apagando o índice 1 ---");
        lista.removerPorIndice(1);
        lista.exibirElementos();

        System.out.println("\n--- Apagando todos os 'Leão' ---");
        lista.removerTodas("Leão");
        lista.exibirElementos();

        System.out.println("\n--- Esvaziando tudo ---");
        lista.limpar();
    }
}
