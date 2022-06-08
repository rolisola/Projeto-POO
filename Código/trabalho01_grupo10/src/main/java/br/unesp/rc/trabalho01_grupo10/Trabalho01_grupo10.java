package br.unesp.rc.trabalho01_grupo10;
import br.unesp.rc.trabalho01_grupo10.modelo.Banda;
import br.unesp.rc.trabalho01_grupo10.modelo.Cantor;
import br.unesp.rc.trabalho01_grupo10.modelo.Cd;
import br.unesp.rc.trabalho01_grupo10.modelo.Dvd;
import br.unesp.rc.trabalho01_grupo10.modelo.Midia;
import br.unesp.rc.trabalho01_grupo10.repositorio.CatalogoCantor;
import br.unesp.rc.trabalho01_grupo10.repositorio.CatalogoBanda;
import br.unesp.rc.trabalho01_grupo10.repositorio.CatalogoMidia;
        
import java.util.Scanner;

/**
 *
 * @authors Fauzi Asbahr, João Victor Gomes de Oliveira e Vitor Marchini Rolisola
 */

public class Trabalho01_grupo10 {

    public static void main(String[] args) {
        int opcao = 0;
        Scanner input = new Scanner(System.in);
        
        // Criando cantores, bandas e mídias (CDs e DVDs)
        Cantor cantor01 = new Cantor("Fulano", 2);
        Cantor cantor02 = new Cantor("Ciclano", 3);
        Cantor cantor03 = new Cantor("Beltrano", 4);
        Cantor cantor04 = new Cantor("Fulana", 4);
        Cantor cantor05 = new Cantor("Beltrano", 4);
        
        Banda banda01 = new Banda("Fulano e seus amigos", 4);
        Banda banda02 = new Banda("Ciclano e seus amigos", 5);
        Banda banda03 = new Banda("Beltrano e seus amigos", 7);
        Banda banda04 = new Banda("Fulana e suas amigas", 10);
        Banda banda05 = new Banda("Fulana e suas amigas", 10);
        
        Cd cd01 = new Cd("Cd do Fulano", "Fulano", 10, "000001", 13);
        Cd cd02 = new Cd("Cd da Fulana", "Fulana", 15, "000010", 18);
        Cd cd03 = new Cd("Cd do Ciclano e seus amigos", "Ciclano e seus amigos", 8, "000011", 9);
        Cd cd04 = new Cd("Cd do Fulano", "Fulano", 10, "000001", 13);
        
        Dvd dvd01 = new Dvd("Dvd do Beltrano", "Beltrano", 30, "100001", 39);
        Dvd dvd02 = new Dvd("Dvd da Fulana e suas amigas", "Fulana e suas amigas", 35, "100010", 54);
        Dvd dvd03 = new Dvd("Dvd do Ciclano", "Ciclano", 28, "100011", 27);
        Dvd dvd04 = new Dvd("Dvd do Beltrano", "Beltrano", 30, "100001", 39);
        
        // Menu
        do {
            System.out.println("==========================");
            System.out.println("=== Catálogo de Mídias ===");
            System.out.println("==========================\n");
            System.out.println("1 - Cadastrar");
            System.out.println("2 - Consultar");
            System.out.println("3 - Consultar Posição");
            System.out.println("4 - Excluir");
            System.out.println("5 - Listar todos");
            System.out.println("6 - Sair");

            System.out.println("Opção: ");
            opcao = input.nextInt();
            
            switch(opcao) {
                case 1:
                    System.out.println("=== Cadastrando... ===");
                    CatalogoCantor.cadastrar(cantor01);
                    CatalogoCantor.cadastrar(cantor02);
                    CatalogoCantor.cadastrar(cantor03);
                    CatalogoCantor.cadastrar(cantor04);
                    CatalogoCantor.cadastrar(cantor05);
                    
                    CatalogoBanda.cadastrar(banda01);
                    CatalogoBanda.cadastrar(banda02);
                    CatalogoBanda.cadastrar(banda03);
                    CatalogoBanda.cadastrar(banda04);
                    CatalogoBanda.cadastrar(banda05);
                    
                    CatalogoMidia.cadastrar(cd01);
                    CatalogoMidia.cadastrar(cd02);
                    CatalogoMidia.cadastrar(cd03);
                    CatalogoMidia.cadastrar(cd04);
                    
                    CatalogoMidia.cadastrar(dvd01);
                    CatalogoMidia.cadastrar(dvd02);
                    CatalogoMidia.cadastrar(dvd03);
                    CatalogoMidia.cadastrar(dvd04);
                    System.out.println("=== Cadastros realizados! ===");
                    break;
                case 2: 
                    System.out.println("=== Consultando... ===");
                    CatalogoCantor.consultar(cantor04.getNome());
                    CatalogoBanda.consultar(banda03.getNome());
                    CatalogoMidia.consultarCd(cd02.getNome());
                    CatalogoMidia.consultarDvd(dvd01.getNome());
                    System.out.println("=== Consultas realizadas! ===");
                    break;
                case 3: 
                    System.out.println("=== Consultando Posição... ===");
                    CatalogoMidia.consultarPosicaoCd(cd02.getNome());
                    CatalogoMidia.consultarPosicaoCd(cd03.getNome());
                    CatalogoMidia.consultarPosicaoDvd(dvd01.getNome());
                    CatalogoMidia.consultarPosicaoDvd(dvd02.getNome());
                    System.out.println("=== Consultas realizadas! ===");
                    break;
                case 4: 
                    System.out.println("=== Excluindo... ===");
                    CatalogoCantor.excluir(cantor04.getNome());
                    CatalogoBanda.excluir(banda03.getNome());
                    CatalogoMidia.excluirCd(cd02.getNome());
                    CatalogoMidia.excluirDvd(dvd01.getNome());
                    System.out.println("=== Exclusões realizadas! ===");
                    break;
                case 5:
                    System.out.println("=== Listando... ===");
                    CatalogoCantor.listar();
                    CatalogoBanda.listar();
                    CatalogoMidia.listar();
                    System.out.println("=== Listagem realizada! ===");
                    break;
                case 6:
                    System.out.println("\nObrigado e até logo!!!");
                    break;
                default:
                    System.out.println("Opção inválida! - Tente novamente\n");
            }
        } while (opcao != 6);
    }
}