package br.unesp.rc.trabalho01_grupo10.modelo;

/**
 *
 * @authors Fauzi Asbahr, João Victor Gomes de Oliveira e Vitor Marchini Rolisola
 */

public class Midia {
    String nome;
    String artista;
    float preco;
    String codBarras;
    
    public Midia(String nome, String artista, float preco, String codBarras) {
        this.nome = nome;
        this.artista = artista;
        this.preco = preco;
        this.codBarras = codBarras;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getArtista() {
        return artista;
    }

    public void setArtista(String artista) {
        this.artista = artista;
    }

    public float getPreco() {
        return preco;
    }

    public void setPreco(float preco) {
        this.preco = preco;
    }

    public String getCodBarras() {
        return codBarras;
    }

    public void setCodBarras(String codBarras) {
        this.codBarras = codBarras;
    }

    @Override
    public String toString() {
        return "nome=" + nome + ", preco=" + preco;
    }
}
