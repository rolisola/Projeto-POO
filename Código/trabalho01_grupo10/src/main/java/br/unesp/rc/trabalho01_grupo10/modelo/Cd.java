package br.unesp.rc.trabalho01_grupo10.modelo;

/**
 *
 * @authors Fauzi Asbahr, João Victor Gomes de Oliveira e Vitor Marchini Rolisola
 */

public class Cd extends Midia {
    int numFaixas;

    public Cd(String nome, String artista, float preco, String codBarras, int numFaixas) {
        super(nome, artista, preco, codBarras);
        this.numFaixas = numFaixas;
    }

    public int getNumFaixas() {
        return numFaixas;
    }

    public void setNumFaixas(int numFaixas) {
        this.numFaixas = numFaixas;
    }

    @Override
    public String toString() {
        return "Cd{" + super.toString() + ", numFaixas=" + numFaixas + '}';
    }
}


