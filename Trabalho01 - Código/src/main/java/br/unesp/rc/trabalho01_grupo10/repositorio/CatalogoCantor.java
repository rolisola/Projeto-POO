package br.unesp.rc.trabalho01_grupo10.repositorio;

import br.unesp.rc.trabalho01_grupo10.Cantor;
import java.util.List;

/**
 *
 * @authors Fauzi Asbahr, João Victor Gomes de Oliveira e Vitor Marchini Rolisola
 */

public class CatalogoCantor {
    List<Cantor> catalogoCantor;

    public CatalogoCantor() {
    }
    
    void Cadastrar(Cantor cantor){
        catalogoCantor.add(cantor);
    }
    
    List<Cantor> listaCantor(){
        
    
    }
    
    
    
}
