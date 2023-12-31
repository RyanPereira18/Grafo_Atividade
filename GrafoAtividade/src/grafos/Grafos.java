/*
   MODELO PARA AULA
 */
package grafos;

import java.util.List;
import java.util.Scanner;


public class Grafos {

     static int menuMetodos(){
        Scanner scanner = new Scanner(System.in);
        int op;
        System.out.println("1-Adicionar Vertice");
        System.out.println("2-Adicionar Aresta");
        System.out.println("3-Imprime Grafo");
        System.out.println("4-Alcance Grafo");
        System.out.println("5-Busca em Profundidade [DFS]");
        System.out.println("6-Busca em Largura [BFS]");
        System.out.println("0-Sair");
        op = scanner.nextInt();
        return op;
    }

    public static void main(String[] args) {
        Graph grafo = new Graph();
        Scanner scanner = new Scanner(System.in);
        int op=0;
         grafo.carregarGrafo();
        do{
        op = menuMetodos();
        switch(op){
            case 1: System.out.println("Vertice:");
                    String valor=scanner.nextLine();
                    grafo.adicionarVertice(valor);
            break;
            case 2: System.out.println("Adjacencias:");
                    String origem=scanner.nextLine();
                    String destino=scanner.nextLine();
                    System.out.println("Peso:");
                    int peso = scanner.nextInt();
                    scanner.nextLine();
                    grafo.adicionarAresta(origem, destino, peso);
                    grafo.imprimirGrafo();
            break;
            case 3:
                    grafo.imprimirGrafo();
            break;
            case 4: System.out.println("Vertices");
                    System.out.println("Origem:");
                     origem=scanner.nextLine();
                     System.out.println("Destino:");
                     destino=scanner.nextLine();
                     if(grafo.alcance(origem, destino)==true)
                         System.out.println("Existe caminho");
                     else
                         System.out.println("Não existe caminho");
            break;         
             case 5: System.out.println("DFS");
                    System.out.println("Origem:");
                    origem=scanner.nextLine();
                    System.out.println(grafo.buscaProfundidade(origem));
            break;        
            case 0: System.out.println("Saindo");
                    grafo.salvarGrafo();
            break;
        }// fim switch
        }while(op!=0);    
    }
    
}
