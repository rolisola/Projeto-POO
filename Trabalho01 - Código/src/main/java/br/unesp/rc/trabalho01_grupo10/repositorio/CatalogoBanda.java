package br.unesp.rc.trabalho01_grupo10.repositorio;

import br.unesp.rc.trabalho01_grupo10.Banda;
import java.util.List;

/**
 *
 * @authors Fauzi Asbahr, João Victor Gomes de Oliveira e Vitor Marchini Rolisola
 */

public class CatalogoBanda {
    List<Banda> catalogoBanda;

    public CatalogoBanda() {
    }
    
    void Cadastrar(Banda banda){
        catalogoBanda.add(banda);
    }
    
}
