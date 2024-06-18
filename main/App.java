package main;

import algorithm.CycleDetection;
import graph.Vertex;

import java.util.ArrayList;
import java.util.List;

public class App {
    public static void main(String[] args){

        Vertex a = new Vertex("A");
        Vertex b = new Vertex("B");
        Vertex c = new Vertex("C");
        Vertex d = new Vertex("D");
        Vertex e = new Vertex("E");
        Vertex f = new Vertex("F");

        //edges
        a.addNeighbour(c);
        a.addNeighbour(e);
        c.addNeighbour(b);
        c.addNeighbour(d);
        e.addNeighbour(f);
        f.addNeighbour(a);

        List<Vertex> graph = new ArrayList<>();
        graph.add(a);
        graph.add(b);
        graph.add(c);
        graph.add(d);
        graph.add(e);
        graph.add(f);

        CycleDetection algorithm = new CycleDetection();
        algorithm.detectCycles(graph);


    }
}
