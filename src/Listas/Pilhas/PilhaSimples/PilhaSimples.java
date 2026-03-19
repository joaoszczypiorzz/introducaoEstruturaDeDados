package Listas.Pilhas.PilhaSimples;

public class PilhaSimples {
    String [] pilha;

    //Constructor da Classe:
    public PilhaSimples(int tamanho){
        this.pilha = new String[tamanho];
    }

    public void exibir(){
        for(int i = 0; i < this.pilha.length; i++){
            System.out.println("Pilha[" + i + "] = " + this.pilha[i]);
        }
    }

    public void empilhar(String elemento){
        if(estaVazio()){
            this.pilha[this.pilha.length - 1] = elemento;
            System.out.println("Elemento: " + elemento + " empilhado com sucesso!");

        } else if(!estaCheio()){
            for(int i = this.pilha.length - 1; i > 0 ; i--){
                int contAuxiliar = i - 1;
                if(this.pilha[contAuxiliar] == null){
                    this.pilha[contAuxiliar] = elemento;
                    System.out.println("Elemento: " + elemento + " empilhado com sucesso!");
                    return;
                }
            }
        }
    }

    private boolean estaVazio(){
        for(int i = 0; i < this.pilha.length; i++){
            if(this.pilha[this.pilha.length - 1] == null){
                return true;
            }
        }
        return false;
    }

    private boolean estaCheio(){
        for(int i = 0; i < this.pilha.length; i++){
            if(this.pilha[0] != null){ //Se a primeira posição contiver um elemento
                System.out.println("A Pilha está cheia!");
                return true;
            }
        }
        return false;
    }
}
