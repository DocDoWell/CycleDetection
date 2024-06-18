package algorithm;

import graph.Vertex;

import java.util.List;

public class CycleDetection {

    public void detectCycles(List<Vertex> graph){
        for(Vertex vertex : graph){
            if(!vertex.isVisited()){
                depthFirstSearch(vertex);
            }
        }
    }

    private void depthFirstSearch(Vertex vertex){
        vertex.setBeingVisited(true);
        for(Vertex neighbour : vertex.getNeighbours()){
            if(neighbour.isBeingVisited()){
                System.out.println("Backward Edge involving vertex " + neighbour + " there is a cycle.");
                return;
            }
            if(!neighbour.isVisited()){
                neighbour.setVisited(true);
                depthFirstSearch(neighbour);
            }
        }
        vertex.setBeingVisited(true);
        vertex.setVisited(true);
    }
}
