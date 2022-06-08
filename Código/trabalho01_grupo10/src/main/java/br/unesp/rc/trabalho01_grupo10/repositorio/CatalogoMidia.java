package br.unesp.rc.trabalho01_grupo10.repositorio;

import br.unesp.rc.trabalho01_grupo10.modelo.Cd;
import br.unesp.rc.trabalho01_grupo10.modelo.Dvd;
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
    private static List<Cd> catalogoCd = new ArrayList<>();
    private static List<Dvd> catalogoDvd = new ArrayList<>();

    public CatalogoMidia() {
    }
    
    public static void cadastrar(Cd cd){
        for(Cd aux : catalogoCd) {
            if(aux.getNome().equals(cd.getNome()) || aux.getCodBarras().equals(cd.getCodBarras())) {
                System.out.println("Cd \"" + aux.getNome() + "\" já existente!");
                igual = 1;
                break;
            }
        }
        
        if(igual == 0) {
            catalogoCd.add(cd);
        }
        igual = 0;
    }
    
    public static void cadastrar(Dvd dvd){
        for(Dvd aux : catalogoDvd) {
            if(aux.getNome().equals(dvd.getNome()) || aux.getCodBarras().equals(dvd.getCodBarras())) {
                System.out.println("Dvd \"" + aux.getNome() + "\" já existente!");
                igual = 1;
                break;
            }
        }
        
        if(igual == 0) {
            catalogoDvd.add(dvd);
        }
        igual = 0;
    }
    
    public static void consultarCd(String nome) { 
        for(Cd aux : catalogoCd) {
            if(aux.getNome().equals(nome)) {
                System.out.println(aux);
            }
        }
    }
    
    public static void consultarPosicaoCd(String nome) { 
        cont = 0;
                
        for(Cd aux : catalogoCd) {
            cont++;
            if(aux.getNome().equals(nome)) {
                System.out.println("Nome: " + nome);
                System.out.println("Posição: " + cont);
            }
        }
    }
    
    public static void consultarDvd(String nome) { 
        for(Dvd aux : catalogoDvd) {
            if(aux.getNome().equals(nome)) {
                System.out.println(aux);
            }
        }
    }
    
    public static void consultarPosicaoDvd(String nome) { 
        cont = 0;
                
        for(Dvd aux : catalogoDvd) {
            cont++;
            if(aux.getNome().equals(nome)) {
                System.out.println("Nome: " + nome);
                System.out.println("Posição: " + cont);
            }
        }
    }
    
    public static void excluirCd(String nome) {
        Iterator iteratorCd = catalogoCd.iterator();
        
        while(iteratorCd.hasNext()) {
            Cd cdAux = (Cd) iteratorCd.next();
            
            if(cdAux.getNome().equals(nome)) {
                iteratorCd.remove();
                System.out.println("Cd \"" + nome + "\" excluído!");
            }
        }
    }
    
    public static void excluirDvd(String nome) {
        Iterator iteratorDvd = catalogoDvd.iterator();
        
        while(iteratorDvd.hasNext()) {
            Dvd dvdAux = (Dvd) iteratorDvd.next();
            
            if(dvdAux.getNome().equals(nome)) {
                iteratorDvd.remove();
                System.out.println("Dvd \"" + nome + "\" excluído!");
            }
        }
    }
    
    public static void listar() {
        System.out.println("\n\tCDs");
        for(Cd aux : catalogoCd) {
            System.out.println(aux);
        }
        
        System.out.println("\n\tDVDs");
        for(Dvd aux : catalogoDvd) {
            System.out.println(aux);
        }
    }
}