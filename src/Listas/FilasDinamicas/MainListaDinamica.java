package Listas.FilasDinamicas;


import Listas.ListasDinamicas.ListaDinamica;

public class MainListaDinamica {
    public static void main(String[] args) {
        ListaDinamica lista = new ListaDinamica();

        String[] elementosIniciais = {"Ana", "Carlos", "Ana", "Pedro"};
        System.out.println("Adicionados: " + lista.adicionarVarios(elementosIniciais));

        System.out.println("Tamanho atual: " + lista.contar());
        System.out.println("Elemento no indice 1: " + lista.obter(1));

        System.out.println("Inseriu 'Maria' no indice 2: " + lista.inserir(2, "Maria"));

        lista.exibir();

        System.out.println("Ocorrencias de 'Ana': " + lista.contarOcorrencias("Ana"));
        System.out.println("Ultimo indice de 'Ana': " + lista.ultimoIndiceDe("Ana"));

        System.out.println("Removido indice 3: " + lista.removerPorIndice(3));

        System.out.println("Substituicoes de 'Ana' por 'Joao': " + lista.substituir("Ana", "Joao"));

        System.out.println("Total de 'Joao' removidos: " + lista.removerTodas("Joao"));

        lista.limpar();
        System.out.println("Tamanho apos limpar: " + lista.contar());
    }
}
