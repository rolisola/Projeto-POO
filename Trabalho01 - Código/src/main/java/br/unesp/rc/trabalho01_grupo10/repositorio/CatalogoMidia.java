package br.unesp.rc.trabalho01_grupo10.repositorio;

import br.unesp.rc.trabalho01_grupo10.Midia;
import java.util.List;

/**
 *
 * @authors Fauzi Asbahr, João Victor Gomes de Oliveira e Vitor Marchini Rolisola
 */

public class CatalogoMidia {
    List<Midia> catalogoMidia;

    public CatalogoMidia() {
    }
    
    void Cadastrar(Midia midia){
        catalogoMidia.add(midia);
    }
}
