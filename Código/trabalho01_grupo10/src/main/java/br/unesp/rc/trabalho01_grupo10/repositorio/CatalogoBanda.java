package br.unesp.rc.trabalho01_grupo10.repositorio;

import br.unesp.rc.trabalho01_grupo10.modelo.Banda;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 *
 * @authors Fauzi Asbahr, João Victor Gomes de Oliveira e Vitor Marchini Rolisola
 */

public class CatalogoBanda {
    private static int igual = 0;
    private static List<Banda> catalogoBanda = new ArrayList<>();


    public CatalogoBanda() {
    }
    
    public static void cadastrar(Banda banda){
        for(Banda b : catalogoBanda) {
            if(b.getNome().equals(banda.getNome())) {
                System.out.println("Banda \"" + b.getNome() + "\" já existente!");
                igual = 1;
                break;
            }
        }
        
        if(igual == 0) {
            catalogoBanda.add(banda);
        }
        igual = 0;
    }
    
    public static void consultar(String nome) { 
        for(Banda b : catalogoBanda) {
            if(b.getNome().equals(nome)) {
                System.out.println(b);
            }
        }
    }
    
    public static void excluir(String nome) {
        Iterator iteratorBanda = catalogoBanda.iterator();
        
        while(iteratorBanda.hasNext()) {
            Banda bandaAux = (Banda) iteratorBanda.next();
            
            if(bandaAux.getNome().equals(nome)) {
                iteratorBanda.remove();
                System.out.println("Cantor \"" + nome + "\" excluído!");
            }
        }
    }
    
    public static void listar() {
        System.out.println("\n\tBandas");
        for(Banda b : catalogoBanda) {
            System.out.println(b);
        }
    }
}
