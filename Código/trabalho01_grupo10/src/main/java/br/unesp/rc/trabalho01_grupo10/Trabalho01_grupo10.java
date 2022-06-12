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

// IMPORTANTE: O nome da classe está fora do padrão adotado pelas aulas e, como 
//             tivemos um problema ao refatorar, decidimos mantê-lo assim.
// PS:         O correto seria "Trabalho01Grupo10".
public class Trabalho01_grupo10 {

    public static void main(String[] args) {
        int opcao = 0;
        Scanner input = new Scanner(System.in);
        
        // Criando cantores, bandas e mídias (CDs e DVDs)
        Cantor cantor01 = new Cantor("Fulano", 2);
        Cantor cantor02 = new Cantor("Ciclano", 3);
        Cantor cantor03 = new Cantor("Beltrano", 4);
        Cantor cantor04 = new Cantor("Fulana", 4);
        Cantor cantor05 = new Cantor("Beltrano", 4); //"nome" igual cantor03
        
        Banda banda01 = new Banda("Fulano e seus amigos", 4);
        Banda banda02 = new Banda("Ciclano e seus amigos", 5);
        Banda banda03 = new Banda("Beltrano e seus amigos", 7);
        Banda banda04 = new Banda("Fulana e suas amigas", 10);
        Banda banda05 = new Banda("Fulana e suas amigas", 10); //"nome "igual banda05
        
        Cd cd01 = new Cd("Cd do Fulano", "Fulano", 10, "000001", 13);
        Cd cd02 = new Cd("Cd da Fulana", "Fulana", 15, "000010", 18);
        Cd cd03 = new Cd("Cd do Ciclano e seus amigos", "Ciclano e seus amigos", 8, "000011", 9);
        Cd cd04 = new Cd("Cd do Beltrano", "Beltrano", 10, "000001", 13); //"codBarras" igual cd01
        
        Dvd dvd01 = new Dvd("Dvd do Beltrano", "Beltrano", 30, "100001", 39);
        Dvd dvd02 = new Dvd("Dvd da Fulana e suas amigas", "Fulana e suas amigas", 35, "100010", 54);
        Dvd dvd03 = new Dvd("Dvd do Ciclano", "Ciclano", 28, "100011", 27);
        Dvd dvd04 = new Dvd("Dvd do Beltrano", "Beltrano", 30, "100100", 39); //"nome" igual dvd01
        
        Midia midiaCd01 = cd01;
        Midia midiaCd02 = cd02;
        Midia midiaCd03 = cd03;
        Midia midiaCd04 = cd04;
        
        Midia midiaDvd01 = dvd01;
        Midia midiaDvd02 = dvd02;
        Midia midiaDvd03 = dvd03;
        Midia midiaDvd04 = dvd04;
        
        // Menu
        do {
            System.out.println("\n==========================");
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
                    
                    CatalogoMidia.cadastrar(midiaCd01);
                    CatalogoMidia.cadastrar(midiaCd02);
                    CatalogoMidia.cadastrar(midiaCd03);
                    CatalogoMidia.cadastrar(midiaCd04);
                    
                    CatalogoMidia.cadastrar(midiaDvd01);
                    CatalogoMidia.cadastrar(midiaDvd02);
                    CatalogoMidia.cadastrar(midiaDvd03);
                    CatalogoMidia.cadastrar(midiaDvd04);
                    System.out.println("=== Cadastros realizados! ===");
                    break;
                case 2: 
                    System.out.println("=== Consultando... ===");
                    CatalogoCantor.consultar(cantor04.getNome());
                    CatalogoBanda.consultar(banda03.getNome());
                    CatalogoMidia.consultar(midiaCd02);
                    CatalogoMidia.consultar(midiaDvd01);
                    System.out.println("=== Consultas realizadas! ===");
                    break;
                case 3: 
                    System.out.println("=== Consultando Posição... ===");
                    CatalogoMidia.consultarPosicao(midiaCd02);
                    CatalogoMidia.consultarPosicao(midiaCd03);
                    CatalogoMidia.consultarPosicao(midiaDvd01);
                    CatalogoMidia.consultarPosicao(midiaDvd02);
                    System.out.println("=== Consultas realizadas! ===");
                    break;
                case 4: 
                    System.out.println("=== Excluindo... ===");
                    CatalogoCantor.excluir(cantor04.getNome());
                    CatalogoBanda.excluir(banda03.getNome());
                    CatalogoMidia.excluir(midiaCd02);
                    CatalogoMidia.excluir(midiaDvd01);
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