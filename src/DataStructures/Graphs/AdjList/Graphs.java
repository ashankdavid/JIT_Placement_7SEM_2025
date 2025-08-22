package DataStructures.Graphs.AdjList;

import java.util.ArrayList;

public class Graphs {
    ArrayList<ArrayList<Integer>> AdjList;

    Graphs(int size){
        AdjList = new ArrayList<>();
        for(int i=0; i<size; i++){
            AdjList.add(new ArrayList<>());
        }
    }

    void addEdge(int u, int v){
        AdjList.get(u).add(v);
        AdjList.get(v).add(u);
    }

    void printAdjList(){
        for(int i=0; i<AdjList.size(); i++){
            System.out.print(i + "->");
            for(int j : AdjList.get(i)){
                System.out.print(j+", ");
            }
            System.out.println();
        }
    }
}

class DriverCode{
    public static void main(String[] args) {
        Graphs g = new Graphs(6);
        g.addEdge(5,0 );
        g.addEdge(5,4);
        g.addEdge(0,4);
        g.addEdge(0,1);
        g.addEdge(4,1);
        g.addEdge(4,3);
        g.addEdge(1,3);
        g.addEdge(1,2);
        g.addEdge(2,3);
        g.printAdjList();
    }
}
