package graph;

import java.util.ArrayList;
import java.util.List;

public class Vertex {
    private String name;
    private boolean visited;
    private boolean beingVisited;
    private List<Vertex> neighbours;

    public Vertex(String name){
        this.name = name;
        this.neighbours = new ArrayList<>();
    }

    public List<Vertex> getNeighbours(){
        return this.neighbours;
    }

    public String getName(){
        return this.name;
    }

    public boolean isVisited(){
        return visited;
    }

    public void setVisited(boolean visited){
        this.visited = visited;
    }

    public void addNeighbour(Vertex vertex){
        this.neighbours.add(vertex);
    }

    public boolean isBeingVisited() {
        return beingVisited;
    }

    public void setBeingVisited(boolean beingVisited) {
        this.beingVisited = beingVisited;
    }

    public String toString(){
        return this.name;
    }

}