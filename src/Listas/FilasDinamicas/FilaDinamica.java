package Listas.FilasDinamicas;

import Listas.Nos.NoString;

public class FilaDinamica {
    NoString inicio;

    public FilaDinamica() {
        this.inicio = new NoString(null);
    }

    public void enfileirar(String elemento) {
        if(estaVazio()) {
            System.out.println("Elemento " + elemento + " adicionado a Fila.");
            this.inicio.setConteudo(elemento);
        } else {
            NoString novoNo = new NoString(elemento);
            NoString aux = this.inicio;
            while(aux != null) {
                if(aux.getProx() == null) {
                    System.out.println("Elemento " + elemento + " adicionado a Fila.");
                    aux.setProx(novoNo);
                    return;
                }
                aux = aux.getProx();
            }
        }
    }

    public void exibir(){
        if(!estaVazio()) {
            NoString aux = this.inicio;
            while(aux != null) {
                System.out.println(aux.getConteudo());
                aux = aux.getProx();
            }
        }
    }

    private boolean estaVazio() {
        if(this.inicio.getConteudo() == null) {
            System.out.println("A Fila está vazia.");
            return true;
        } else {
            return false;
        }
    }

    public void desenfileirar() {
        if(!estaVazio()) {
            if(this.inicio.getProx() == null) {
                this.inicio.setConteudo(null);
            } else {
                this.inicio = this.inicio.getProx();
            }
        }
    }
}