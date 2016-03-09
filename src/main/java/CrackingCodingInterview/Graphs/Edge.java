package CrackingCodingInterview.Graphs;

/**
 * Created by root on 1/30/16.
 */
public class Edge implements Comparable {

    public int weight;
    public VertexwithWeightedEdge source;
    public  VertexwithWeightedEdge destination;




    public  Edge (VertexwithWeightedEdge source ,VertexwithWeightedEdge destination ){
        this(source , destination  , 1);
    }
    public Edge( VertexwithWeightedEdge source ,VertexwithWeightedEdge destination , int weight){
        this.destination = destination;
        this.source = source;
        this.weight = weight;
    }

    public VertexwithWeightedEdge getSource() {
        return source;
    }
    public void setSource(VertexwithWeightedEdge source) {
        this.source = source;
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

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Edge edge = (Edge) o;

        if (source != null ? !source.equals(edge.source) : edge.source != null) return false;
        return !(destination != null ? !destination.equals(edge.destination) : edge.destination != null);

    }

    @Override
    public int hashCode() {
        int result = source != null ? source.hashCode() : 0;
        result = 31 * result + (destination != null ? destination.hashCode() : 0);
        return result;
    }




    public int compareTo(Object o) {
        Edge e = (Edge)o;
        if(this.getWeight() > e.getWeight()){
            return 1;
        }
        else if(this.getWeight() == e.getWeight()){
            return 0;
        }
        else

            return -1;

    }
}
