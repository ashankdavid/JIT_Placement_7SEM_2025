package DataStructures.Graphs.AdjMatrix;

public class Graph {
    int V;
    int[][] adjMatrix;

    Graph(int vertices){
        this.V = vertices;
        adjMatrix = new int[V][V];
    }

    void addEdge(int u, int v, int weight){
        adjMatrix[u][v] = weight;
        adjMatrix[v][u] = weight;
    }

    void printMatrix(){
        for(int i=0; i<V; i++){
            for(int j=0; j<V; j++){
                System.out.print(adjMatrix[i][j] + " ");
            }
            System.out.println();
        }
    }
}

class DriverCode{
    public static void main(String[] args) {
        Graph g = new Graph(6);
        g.addEdge(5,0, 1);
        g.addEdge(5,4,1);
        g.addEdge(0,4,1);
        g.addEdge(0,1, 1);
        g.addEdge(4,1, 1);
        g.addEdge(4,3, 1);
        g.addEdge(1,3, 1);
        g.addEdge(1,2, 1);
        g.addEdge(2,3, 1);
        g.printMatrix();
    }
}
