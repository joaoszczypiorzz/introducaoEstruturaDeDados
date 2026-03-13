package Listas.Nos;

public class NoString {
    String conteudo;
    NoString prox;

    public NoString(String conteudo) {
        this.conteudo = conteudo;
        this.prox = null;
    }

    public NoString getProx() {
        return prox;
    }

    public void setProx(NoString prox) {
        this.prox = prox;
    }

    public String getConteudo() {
        return this.conteudo;
    }

    public void setConteudo(String conteudo) {
        this.conteudo = conteudo;
    }
}