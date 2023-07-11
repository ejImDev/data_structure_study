package Grape;

public class GreedyEdge {
    public int vertex, adjvertex; // 간선의 양 끝 정점들
    public int weight; // 간선의 가중치
    public GreedyEdge(int u, int v, int wt){
        vertex = u;
        adjvertex = v;
        weight = wt;
    }
}
