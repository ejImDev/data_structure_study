package Grape;

import java.util.Comparator;
import java.util.List;
import java.util.PriorityQueue;

public class KruskalMST {
    int N, M;
    List<GreedyEdge>[] grape;
    UnionFind uf;
    GreedyEdge[] tree;

    static class Weight_Comparison implements Comparator<GreedyEdge>{// 가중치를 기준으로 우선순위큐를 사용하기 위해
        public int compare(GreedyEdge e, GreedyEdge f){
            if (e.weight > f.weight) return 1;
            else if(e.weight < f.weight) return -1;
            return 0;
        }
    }

    public KruskalMST(List<GreedyEdge>[] adjList, int numOfEdges){
        N = adjList.length;
        M = numOfEdges;
        grape = adjList;
        uf = new UnionFind(N);
        tree = new GreedyEdge[N-1];
    }

    public GreedyEdge[] mst() {
        Weight_Comparison BY_WEIGHT = new Weight_Comparison(); // 우선순위큐를 가중치 기준으로 구성하기 위해
        PriorityQueue<GreedyEdge> pq = new PriorityQueue<GreedyEdge>(M, BY_WEIGHT); // 자바 라이브러리의 우선순위 큐 사용
        //우선순위큐의 크기로 M(간선의 수)을 지정, BY_WEIGHT는 line 30의 comparator

        for (int i=0; i<N; i++){
            for(GreedyEdge e : grape[i]){
                pq.add(e); // edgeArray의 간선 객체들을 pq에 삽입
            }
        }
        int count = 0;
        while (!pq.isEmpty() && count < N-1){
            GreedyEdge e = pq.poll(); // 최소 가중치를 가진 간선을 pq에서 제거하고 가져옴
            int u = e.vertex;
            int v = e.adjvertex;
            if(!uf.isConnected(u, v)){
                uf.union(u, v);
                tree[count++] = e;
            }
        }
        return tree;
    }
}


