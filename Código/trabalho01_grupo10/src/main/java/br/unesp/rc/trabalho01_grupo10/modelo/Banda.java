package br.unesp.rc.trabalho01_grupo10.modelo;

/**
 *
 * @authors Fauzi Asbahr, João Victor Gomes de Oliveira e Vitor Marchini Rolisola
 */

public class Banda {
    String nome;
    int numIntegrantes;

    public Banda(String nome, int numIntegrantes) {
        this.nome = nome;
        this.numIntegrantes = numIntegrantes;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getNumIntegrantes() {
        return numIntegrantes;
    }

    public void setNumIntegrantes(int numIntegrantes) {
        this.numIntegrantes = numIntegrantes;
    }

    @Override
    public String toString() {
        return "Banda{" + "nome=" + nome + ", numIntegrantes=" + numIntegrantes + '}';
    }
    
    
}
