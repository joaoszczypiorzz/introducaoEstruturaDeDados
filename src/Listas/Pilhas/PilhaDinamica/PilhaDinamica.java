package Listas.Pilhas.PilhaDinamica;
import Listas.Nos.NoString; //importando package do No

public class PilhaDinamica {
    NoString topo; //variavel para saber qual o topo da Pilha
    int tamanho; //variavel para sabermos o tamanho da Lista


    public PilhaDinamica(){
        this.tamanho = 0;
        this.topo = null;
    }

    private boolean estaVazio(){
        if(this.topo == null){
            return true;
        }
        return false;
    }

    public void empilhar(String elemento){
        NoString no = new NoString(elemento);
        no.setProx(topo);
        this.topo = no;
        tamanho++;
    }

    public String desempilhar(){
        if(estaVazio()){
            System.out.println("Pilha está vazia!");
            return null;
        }
        String saida = topo.getConteudo();
        this.topo = topo.getProx();
        System.out.println("Elemento: " + saida + " desempilhado com sucesso!");
        return saida;
    }

    public void exibirElementos(){
        NoString auxiliar = this.topo;  //auxiliar para não mexer nos elementos alocados diretamente
        if(!estaVazio()){
            while (auxiliar != null){ //enquanto auxiliar não for null
                System.out.println(auxiliar.getConteudo());
                auxiliar = auxiliar.getProx();
            }
        }
    }
}
