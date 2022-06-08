package br.unesp.rc.trabalho01_grupo10.modelo;

/**
 *
 * @authors Fauzi Asbahr, João Victor Gomes de Oliveira e Vitor Marchini Rolisola
 */

public class Dvd extends Midia {
    int numDuracao;

    public Dvd(String nome, String artista, float preco, String codBarras, int numDuracao) {
        super(nome, artista, preco, codBarras);
        this.numDuracao = numDuracao;
    }

    public int getNumDuracao() {
        return numDuracao;
    }

    public void setNumDuracao(int numDuracao) {
        this.numDuracao = numDuracao;
    }

    @Override
    public String toString() {
        return "Dvd{" + super.toString() + "numDuracao=" + numDuracao + '}';
    }
}
