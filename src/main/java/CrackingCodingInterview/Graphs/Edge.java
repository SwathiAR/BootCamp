package CrackingCodingInterview.Graphs;

/**
 * Created by root on 1/30/16.
 */
public class Edge {


    public  VertexwithWeightedEdge destination;
    public int weight;
    public  Edge (VertexwithWeightedEdge destination ){
        this(destination , 1);
    }
    public Edge( VertexwithWeightedEdge destination , int weight){
        this.destination = destination;
        this.weight = weight;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Edge edge = (Edge) o;

        return destination.equals(edge.destination);

    }

    @Override
    public int hashCode() {
        return destination.hashCode();
    }

    public VertexwithWeightedEdge getDestination() {
        return destination;
    }

    public void setDestination(VertexwithWeightedEdge destination) {
        this.destination = destination;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }


}
