package Listas.ListasDinamicas;

import Listas.Interface.ListaOperacoes;
import Listas.Nos.NoString;

public class ListaDinamica implements ListaOperacoes {
    NoString inicio;

    public ListaDinamica() {
        this.inicio = null;
    }

    @Override
    public int removerTodas(String elemento) {
        int count = 0;
        while (inicio != null && ((inicio.getConteudo() == null && elemento == null) || (inicio.getConteudo() != null && inicio.getConteudo().equals(elemento)))) {
            inicio = inicio.getProx();
            count++;
        }

        if (inicio == null) {
            return count;
        }

        NoString aux = inicio;
        while (aux.getProx() != null) {
            if ((aux.getProx().getConteudo() == null && elemento == null) || (aux.getProx().getConteudo() != null && aux.getProx().getConteudo().equals(elemento))) {
                aux.setProx(aux.getProx().getProx());
                count++;
            } else {
                aux = aux.getProx();
            }
        }
        return count;
    }

    @Override
    public int contar() {
        int count = 0;
        NoString aux = inicio;
        while (aux != null) {
            count++;
            aux = aux.getProx();
        }
        return count;
    }

    @Override
    public int adicionarVarios(String[] elementos) {
        if (elementos == null || elementos.length == 0) {
            return 0;
        }

        int count = 0;
        for (String elemento : elementos) {
            NoString novoNo = new NoString(elemento);
            if (inicio == null) {
                inicio = novoNo;
            } else {
                NoString aux = inicio;
                while (aux.getProx() != null) {
                    aux = aux.getProx();
                }
                aux.setProx(novoNo);
            }
            count++;
        }
        return count;
    }

    @Override
    public String obter(int indice) {
        if (indice < 0) {
            return null;
        }

        NoString aux = inicio;
        int atual = 0;
        while (aux != null) {
            if (atual == indice) {
                return aux.getConteudo();
            }
            atual++;
            aux = aux.getProx();
        }
        return null;
    }

    @Override
    public boolean inserir(int indice, String elemento) {
        if (indice < 0) {
            return false;
        }

        NoString novoNo = new NoString(elemento);

        if (indice == 0) {
            novoNo.setProx(inicio);
            inicio = novoNo;
            return true;
        }

        NoString aux = inicio;
        int atual = 0;
        while (aux != null && atual < indice - 1) {
            aux = aux.getProx();
            atual++;
        }

        if (aux == null) {
            return false;
        }

        novoNo.setProx(aux.getProx());
        aux.setProx(novoNo);
        return true;
    }

    @Override
    public String removerPorIndice(int indice) {
        if (indice < 0 || inicio == null) {
            return null;
        }

        if (indice == 0) {
            String removido = inicio.getConteudo();
            inicio = inicio.getProx();
            return removido;
        }

        NoString aux = inicio;
        int atual = 0;
        while (aux.getProx() != null && atual < indice - 1) {
            aux = aux.getProx();
            atual++;
        }

        if (aux.getProx() == null) {
            return null;
        }

        String removido = aux.getProx().getConteudo();
        aux.setProx(aux.getProx().getProx());
        return removido;
    }

    @Override
    public void limpar() {
        inicio = null;
    }

    @Override
    public int ultimoIndiceDe(String elemento) {
        int ultimo = -1;
        int atual = 0;
        NoString aux = inicio;
        while (aux != null) {
            if ((aux.getConteudo() == null && elemento == null) || (aux.getConteudo() != null && aux.getConteudo().equals(elemento))) {
                ultimo = atual;
            }
            atual++;
            aux = aux.getProx();
        }
        return ultimo;
    }

    @Override
    public int contarOcorrencias(String elemento) {
        int count = 0;
        NoString aux = inicio;
        while (aux != null) {
            if ((aux.getConteudo() == null && elemento == null) || (aux.getConteudo() != null && aux.getConteudo().equals(elemento))) {
                count++;
            }
            aux = aux.getProx();
        }
        return count;
    }

    @Override
    public int substituir(String antigo, String novo) {
        int count = 0;
        NoString aux = inicio;
        while (aux != null) {
            if ((aux.getConteudo() == null && antigo == null) || (aux.getConteudo() != null && aux.getConteudo().equals(antigo))) {
                aux.setConteudo(novo);
                count++;
            }
            aux = aux.getProx();
        }
        return count;
    }

    public void exibir() {
        NoString aux = this.inicio;
        while(aux != null) {
            System.out.println(aux.getConteudo());
            aux = aux.getProx();
        }
    }
}