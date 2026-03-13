package Listas.ListasSimples;

import Listas.Interface.ListaOperacoes;

import java.util.InputMismatchException;

public class ListaSimples implements ListaOperacoes {
    String[] lista;

    public ListaSimples(int tamanho) {
        this.lista = new String[tamanho];
    }

    public void exibirElementos() {
        for (int i = 0; i < this.lista.length; i++) {
            System.out.println("Lista[" + i + "] = " + this.lista[i]);
        }
    }

    public void adicionarElemento(String elemento) {
        if (!estaCheia()) {
            this.lista[encontrarPosicaoVazia()] = elemento;
            System.out.println("Elemento " + elemento + " adicionado com sucesso!");
        }
    }


    private boolean estaCheia() {
        for (int i = 0; i < this.lista.length; i++) {
            if (this.lista[i] == null) {
                return false;
            }
        }
        System.out.println("A lista está cheia!");
        return true;
    }

    private boolean estaVazio() {
        for (int i = 0; i < this.lista.length; i++) {
            if (this.lista[i] != null) {
                return false;
            }
        }
        System.out.println("A lista está vazia!");
        return true;
    }

    private int encontrarPosicaoVazia() {
        int i;
        for (i = 0; i < this.lista.length; i++) {
            if (this.lista[i] == null) {
                return i;
            }
        }
        return i;
    }

    public void removerElemento(String elemento) {
        if (!estaVazio()) {
            if (this.buscarElemento(elemento) >= 0) {
                this.lista[this.buscarElemento(elemento)] = null;
                System.out.println("Elemento " + elemento + " removido com sucesso!");
            }
        }
    }
    //busca apenas um elemento
    public int buscarElemento(String elemento){
        int i;
        if (!estaVazio()) {
            for (i = 0; i < this.lista.length; i++) {
                if (this.lista[i].equals(elemento)) {
                    return i;
                }
            }
        }
        System.out.println("Elemento não encontrado na lista.");
        return -1;
    }

    public void alterarElemento(String elementoASerAlterado, String alteracao) {
        if(buscarElemento(elementoASerAlterado) >= 0) {
            this.lista[buscarElemento(elementoASerAlterado)] = alteracao;
            System.out.println("Elemento " + elementoASerAlterado + " alterado com sucesso para " + alteracao);
        }
    }

    public int quantidadeElementos() {
        int cont = 0;
        if(!estaVazio()) {
            for (int i = 0; i < this.lista.length; i++) {
                if(this.lista[i] != null) {
                    cont++;
                }
            }
            return cont;
        }
        return -1;
    }

    /**
     * Remove todas as ocorrencias do elemento inputado pelo usuário, e no final exibe mensagem ao usuário
     * @param elemento Elemento que deverá ter todas as ocorrências removidas.
     * @return A quantidade de elementos removidos da Lista
     */
    @Override
    public int removerTodas(String elemento) {
        int qtdRemocoes = 0;
        if(!estaVazio()){
            try{
                for(int i = 0; i < this.lista.length; i++){
                    if(this.lista[i].equals(elemento)){
                        this.lista[i] = null;
                        qtdRemocoes++;
                    }
                }
            }catch (NullPointerException e){ //Não para o programa com comparações de Valores nulos no lista[i]

            }
            if(qtdRemocoes == 0){
                System.out.println("Elemento: " + elemento + " não encontrado na lista");
            } else {
                System.out.println("O elemento: " + elemento + " Foi removido da lista " + "\nQuantidade de remoções: " + qtdRemocoes);
            }
        }
        return qtdRemocoes;

    }

    @Override
    public int contar() {
        int contador = 0;
        if(!estaVazio()){
            for(int i = 0; i < this.lista.length ; i++){
                if(this.lista[i]!= null){
                    contador++;
                }
            }
        }
        System.out.println("Número de Elementos presentes na lista: " + contador);
        return contador;
    }

    @Override
    public int adicionarVarios(String[] elementos) {
        int adicionados = 0;
        int capacidadeTotal = this.lista.length;
        if(!estaVazio()) {
            for (int i = 0; i < elementos.length; i++) {
                if (this.quantidadeElementos() < capacidadeTotal) {

                    this.lista[this.quantidadeElementos()] = elementos[i];
                    adicionados++;

                } else {
                    break;
                }
            }
        }
        return adicionados;
    }

    @Override
    public String obter(int indice) {
        try{
            if(indice < 0 || indice >= this.lista.length){
                throw new ArrayIndexOutOfBoundsException("Indice infomado Inválido!");
            }
        }catch (ArrayIndexOutOfBoundsException e){
            System.out.println(e.getMessage());
            return null;
        }
        String elementoEncontrado = "";
        if(!estaVazio()){
            for(int i = 0; i < this.lista.length ; i++){
                if(this.lista[i] == this.lista[indice]){
                    if(this.lista[i] == null){
                        System.out.println("Indice informado está vazio!");
                        break;
                    } else {
                        elementoEncontrado = this.lista[i];
                        System.out.println("Elemento: " + elementoEncontrado + " Encontrado para o indice: " + indice);
                        break;
                    }
                }
            }
        }
        return elementoEncontrado;
    }

    @Override
    public boolean inserir(int indice, String elemento) {
        String [] novoVetor = new String [quantidadeElementos() + 1];
        if(!estaVazio()){
            int contAux = 0; //contador auxiliar para percorrer a lista original
            for(int i = 0;i < novoVetor.length;i++){
                if(this.lista[contAux] == null){
                    novoVetor[i] = null;
                }else if(i == indice){
                    novoVetor[i] = elemento;
                } else{
                    novoVetor[i] = this.lista[contAux];
                    contAux++;
                }
            }
            for(int i = 0;i < novoVetor.length;i++){
                System.out.println("Lista[" + i + "] = " + novoVetor[i]);
            }
            return true;
        }
        return false;

    }

    @Override
    public String removerPorIndice(int indice) {
        String elementoRemovido = this.lista[indice]; //guarda o elemento que vai ser removido
        if(!estaVazio()){
            if (indice < 0 || indice >= quantidadeElementos()) {
                return null;
            }
            for (int i = indice; i < quantidadeElementos() - 1; i++) { //deslocando elementos para a direita
                this.lista[i] = this.lista[i + 1];
            }
            this.lista[quantidadeElementos() - 1] = null; //Limpa a posição duplicada
        }
        return elementoRemovido;
    }

    @Override
    public void limpar() {
        for(int i = 0; i < this.lista.length ; i++){
            lista[i] = null;
        }
        exibirElementos();
    }

    @Override
    public int ultimoIndiceDe(String elemento) {
        int ultimoIndice = 0;
        if(!estaVazio() || buscarElemento(elemento)!= -1){
            for(int i = 0; i < this.lista.length; i++){
                if(this.lista[i] == null){
                    continue;
                }else if(this.lista[i].equals(elemento)){
                    ultimoIndice = i;
                }
            }
        }
        if(buscarElemento(elemento)!= -1){
            System.out.println("Ultimo indice: " + ultimoIndice + " para o elemento " + elemento);
            return ultimoIndice;
        }
        return -1;
    }

    @Override
    public int contarOcorrencias(String elemento) {
        int contador = 0;
        if(!estaVazio() || buscarElemento(elemento)!=-1){
            for(int i = 0; i < this.lista.length; i ++){
                if(this.lista[i] == null){
                    continue;
                }else if(this.lista[i].equals(elemento)){
                    contador++;
                }
            }
        }
        if(contador != 0){
            System.out.println("Numero de ocorrencias: " + contador + " do elemento: " + elemento + " na lista");
            return contador;
        }
        System.out.println("Elemento não encontrado na lista!");
        return -1;
    }

    @Override
    public int substituir(String antigo, String novo) {
        int qtdSubstituicoes = 0;
        if(!estaVazio()){
            for(int i = 0 ; i < this.lista.length; i++){
                if(this.lista[i] == null){
                    continue;
                } else if(this.lista[i].equals(antigo)){
                    this.lista[i] = novo;
                    qtdSubstituicoes++;
                }
            }
        }
        if(qtdSubstituicoes != 0){
            System.out.println("Substituições realizadas: " + qtdSubstituicoes);
            System.out.println("Array Novo: ");
            exibirElementos();
        }
        System.out.println("Input informado não existente na lista");
        return 0;
    }
}
