package br.unesp.rc.trabalho01_grupo10.repositorio;

import br.unesp.rc.trabalho01_grupo10.modelo.Midia;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 *
 * @authors Fauzi Asbahr, João Victor Gomes de Oliveira e Vitor Marchini Rolisola
 */

public class CatalogoMidia {
    private static int igual = 0;
    private static int cont;
    private static List<Midia> catalogoMidia = new ArrayList<>();

    public CatalogoMidia() {
    }
    
    public static void cadastrar(Midia midia){
        for(Midia aux : catalogoMidia) {
            if(aux.getNome().equals(midia.getNome()) || aux.equals(midia)) {
                System.out.println("Mídia \"" + midia.getNome() + "\" já existe!");
                igual = 1;
                break;
            }
        }
        
        if(igual == 0) {
            catalogoMidia.add(midia);
        }
        
        igual = 0;
    }
    
    public static void consultar(Midia midia) { 
        for(Midia aux : catalogoMidia) {
            if(aux.equals(midia)) {
                System.out.println(aux);
                igual = 1;
                break;
            }
        }
        
        if(igual == 0) {
            System.out.println("Mídia \"" + midia.getNome() + "\" não encontrada!");
        }
        
        igual = 0;
    }
    
    public static void consultarPosicao(Midia midia) { 
        cont = 0;
                
        for(Midia aux : catalogoMidia) {
            cont++;
            if(aux.equals(midia)) {
                System.out.println("Nome: " + midia.getNome());
                System.out.println("Posição: " + cont);
                igual = 1;
                break;
            }
        }
        
        if(igual == 0) {
            System.out.println("Mídia \"" + midia.getNome() + "\" não encontrada!");
        }
        
        igual = 0;
    }
    
    public static void excluir(Midia midia) {
        Iterator iterator = catalogoMidia.iterator();
        
        while(iterator.hasNext()) {
            Midia aux = (Midia) iterator.next();
            
            if(aux.equals(midia)) {
                iterator.remove();
                System.out.println("Mídia \"" + midia.getNome() + "\" excluído!");
                igual = 1;
                break;
            }
        }
        
        if(igual == 0) {
            System.out.println("Mídia \"" + midia.getNome() + "\" não encontrada!");
        }
        
        igual = 0;
    }
    
    public static void listar() {
        System.out.println("\n\tMídias");
        
        for(Midia aux : catalogoMidia) {
            System.out.println(aux);
        }
    }
}