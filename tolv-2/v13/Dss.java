import edu.princeton.cs.algs4.*;

// Source-sink shortest paths. Develop an API and implementation that uses
// a version of Dijkstra’s algorithm to 
// solve the source-sink shortest path problem on edge- weighted digraphs.
public class Dss {
    private EdgeWeightedDigraph graph;
    private int src;
    private int sink;

    public Dss(EdgeWeightedDigraph G, int src, int sink) {
        this.graph = G;
        this.src = src;
        this.sink = sink;
    }

    public double distToSink() {
        double totalLength = 0;
        DijkstraSP dSp = new DijkstraSP(this.graph, this.src);
        for (DirectedEdge DE : dSp.pathTo(this.sink)) {
            totalLength += DE.weight();
        }
        return totalLength;
    }
}