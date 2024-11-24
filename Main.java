public class Main {
    public static void main(String[] args) {
        // Criando um grafo com 5 vértices
        Grafo grafo = new Grafo(5);

        // Adicionando as arestas ao grafo
        grafo.addEdge(0, 1);
        grafo.addEdge(0, 4);
        grafo.addEdge(1, 2);
        grafo.addEdge(1, 3);
        grafo.addEdge(1, 4);
        grafo.addEdge(2, 3);
        grafo.addEdge(3, 4);

        // Exibindo a representação do grafo
        System.out.println(grafo.toString());

        // Realizando a busca em largura a partir do vértice 0
        BuscaLargura bfs = new BuscaLargura(grafo);
        bfs.bfs(0); // Inicia a busca em largura a partir do vértice 0
    }
}
