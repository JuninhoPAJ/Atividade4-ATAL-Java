public class BuscaLargura {
    private Grafo grafo;

    public BuscaLargura(Grafo grafo) {
        this.grafo = grafo;
    }

    public void bfs(int startVertex) {
        boolean[] visited = new boolean[grafo.getNumVertices()]; // Marca os vértices visitados
        int[] queue = new int[grafo.getNumVertices()];           // Fila para BFS
        int front = 0, rear = 0;

        // Marca o vértice inicial como visitado e adiciona à fila
        visited[startVertex] = true;
        queue[rear++] = startVertex;

        System.out.println("Busca em largura a partir do vértice " + startVertex + ":");

        while (front != rear) {
            // Remove o elemento da frente da fila
            int currentVertex = queue[front++];
            System.out.print(currentVertex + " ");

            // Verifica todos os vizinhos do vértice atual
            for (int i = 0; i < grafo.getNumVertices(); i++) {
                if (grafo.getAdjacencyMatrix()[currentVertex][i] == 1 && !visited[i]) {
                    visited[i] = true;
                    queue[rear++] = i; // Adiciona o vizinho à fila
                }
            }
        }
        System.out.println();
    }
}

    

