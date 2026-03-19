package Listas.Pilhas.PilhaSimples;

public class MainPilhaSimples {
    public static void main(String[] args) {
        PilhaSimples pilha = new PilhaSimples(5);
        pilha.empilhar("batata");
        pilha.empilhar("cenoura");
        pilha.empilhar("arroz");
        pilha.empilhar("feijão");
        pilha.empilhar("carne");
        pilha.exibir();
    }
}
