package Listas.Nos;

/**
 * Classe que trabalha a implementação dos Nós duplamente encadeados, que basicamente
 * Apenas adiciona um Nó que aponta para o elemento Anterior da Lista
 * @author João Szczypior
 */
public class NoDuplamenteEncadeado {
    Integer conteudo;
    NoDuplamenteEncadeado proximo;
    NoDuplamenteEncadeado anterior;

    NoDuplamenteEncadeado(Integer conteudo){
        this.conteudo = conteudo;
        this.proximo = null;
        this.anterior = null;
    }

    public Integer getConteudo() {
        return conteudo;
    }

    public void setConteudo(Integer conteudo) {
        this.conteudo = conteudo;
    }

    public NoDuplamenteEncadeado getProximo() {
        return proximo;
    }

    public void setProximo(NoDuplamenteEncadeado proximo) {
        this.proximo = proximo;
    }

    public NoDuplamenteEncadeado getAnterior() {
        return anterior;
    }

    public void setAnterior(NoDuplamenteEncadeado anterior) {
        this.anterior = anterior;
    }
}
