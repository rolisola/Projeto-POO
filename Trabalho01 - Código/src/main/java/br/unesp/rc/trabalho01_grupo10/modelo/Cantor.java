package br.unesp.rc.trabalho01_grupo10.modelo;

/**
 *
 * @authors Fauzi Asbahr, João Victor Gomes de Oliveira e Vitor Marchini Rolisola
 */

public class Cantor {
    String nome;
    int tempoCarreira;

    public Cantor(String nome, int tempoCarreira) {
        this.nome = nome;
        this.tempoCarreira = tempoCarreira;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getTempoCarreira() {
        return tempoCarreira;
    }

    public void setTempoCarreira(int tempoCarreira) {
        this.tempoCarreira = tempoCarreira;
    }

    @Override
    public String toString() {
        return "Cantor{" + "nome=" + nome + ", tempoCarreira=" + tempoCarreira + '}';
    }
    
    
}
