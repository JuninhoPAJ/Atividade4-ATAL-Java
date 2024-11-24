public class Grafo {
    private int numVertices;
    private int[][] adjacencyMatrix; // Matriz de adjacência

    public Grafo(int numVertices) {
        this.numVertices = numVertices;
        this.adjacencyMatrix = new int[numVertices][numVertices];

        // Inicializando a matriz de adjacência com 0 (sem arestas)
        for (int i = 0; i < numVertices; i++) {
            for (int j = 0; j < numVertices; j++) {
                adjacencyMatrix[i][j] = 0;
            }
        }
    }

    public void addEdge(int v, int w) {
        // v = origem, w = destino
        adjacencyMatrix[v][w] = 1;
        adjacencyMatrix[w][v] = 1; // Como é um grafo não direcionado, adicionamos a ligação inversa
    }

    public int getNumVertices() {
        return numVertices;
    }

    public int[][] getAdjacencyMatrix() {
        return adjacencyMatrix;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < numVertices; i++) {
            sb.append("Vértice: ").append(i).append(":\n");
            for (int j = 0; j < numVertices; j++) {
                if (adjacencyMatrix[i][j] == 1) {
                    sb.append(" -> ").append(j).append("\n");
                }
            }
            sb.append("\n");
        }

        return sb.toString();
    }
}
