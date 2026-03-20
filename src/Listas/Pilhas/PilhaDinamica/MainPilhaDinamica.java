package Listas.Pilhas.PilhaDinamica;

public class MainPilhaDinamica {

    public static void main(String[] args) {
     PilhaDinamica pilha = new PilhaDinamica();
     pilha.empilhar("A");
     pilha.empilhar("B");
     pilha.empilhar("C");
     pilha.empilhar("D");
     pilha.exibirElementos();
     System.out.println("===========================================");
     pilha.desempilhar();
     pilha.desempilhar();
     pilha.exibirElementos();

    }
}
