package br.unesp.rc.trabalho01_grupo10.menu;
import br.unesp.rc.trabalho01_grupo10.repositorio.CatalogoCantor;
import br.unesp.rc.trabalho01_grupo10.repositorio.CatalogoBanda;
import br.unesp.rc.trabalho01_grupo10.repositorio.CatalogoMidia;
        
import java.util.Scanner;

/**
 *
 * @authors Fauzi Asbahr, João Victor Gomes de Oliveira e Vitor Marchini Rolisola
 */

public class Menu {

    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
        
        int opcao = 0;
        
        do{
        System.out.println(" - - - - - Catálogo de Mídias - - - - -\n");
        
        System.out.println("1 - Cadastrar    2 - Consultar");
        //System.out.println("2 - Consultar");
        System.out.println("3 - Excluir    4 - Listar todos");
        //System.out.println("4 - Listar todos");
        System.out.println("        5 - Sair");
        
        System.out.println("Opção: ");
        opcao = input.nextInt();
        
        }while (opcao != 5);
        
        //Cantor cantor01 = new Cantor("Fulano", 2);
        //System.out.println(cantor01);
        //Cd cd01 = new Cd("nome", "artista", 20, "123456", 9);
        //System.out.println(cd01);
        
        System.out.println("\nObrigado e até logo!!");
    }

}