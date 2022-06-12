package br.unesp.rc.trabalho01_grupo10.repositorio;

import br.unesp.rc.trabalho01_grupo10.modelo.Cantor;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 *
 * @authors Fauzi Asbahr, João Victor Gomes de Oliveira e Vitor Marchini Rolisola
 */

public class CatalogoCantor {
    private static int igual = 0;
    private static List<Cantor> catalogoCantor = new ArrayList<>();

    public CatalogoCantor() {
    }
    
    public static void cadastrar(Cantor cantor){
        for(Cantor c : catalogoCantor) {
            if(c.getNome().equals(cantor.getNome())) {
                System.out.println("Artista \"" + c.getNome() + "\" já existe!");
                igual = 1;
                break;
            }
        }
        
        if(igual == 0) {
            catalogoCantor.add(cantor);
        }
        
        igual = 0;
    }
    
    public static void consultar(String nome) { 
        for(Cantor c : catalogoCantor) {
            if(c.getNome().equals(nome)) {
                System.out.println(c);
                igual = 1;
                break;
            }
        }
        
        if(igual == 0) {
            System.out.println("Artista \"" + nome + "\" não encontrado!");
        }
        
        igual = 0;
    }
    
    public static void excluir(String nome) {
        Iterator iteratorCantor = catalogoCantor.iterator();
        
        while(iteratorCantor.hasNext()) {
            Cantor cantorAux = (Cantor) iteratorCantor.next();
            
            if(cantorAux.getNome().equals(nome)) {
                iteratorCantor.remove();
                System.out.println("Artista \"" + nome + "\" excluído!");
                igual = 1;
                break;
            }
        }
        
        if(igual == 0) {
            System.out.println("Artista \"" + nome + "\" não encontrado!");
        }
        
        igual = 0;
    }
    
    public static void listar() {
        System.out.println("\n\tCantores");
        for(Cantor c : catalogoCantor) {
            System.out.println(c);
        }
    } 
}
