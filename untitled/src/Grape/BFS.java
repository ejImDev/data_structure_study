package Grape;

import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class BFS {
    int N;
    List<Edge>[] graph;
    private boolean[] visited;
    public BFS(List<Edge>[] adjList){
        N = adjList.length;
        graph = adjList;
        visited = new boolean[N];
        for(int i=0; i<N; i++) visited[i] = false;
        for(int i=0; i<N; i++) if (!visited[i]) bfs(i);
    }
    private void bfs(int i){
        Queue<Integer> q = new LinkedList<Integer>(); // 큐 선언
        visited[i] = true;
        q.add(i); // 큐에 정점 s를 삽입
        while(!q.isEmpty()){
            int j = q.remove(); // 큐에서 정점 j를 가져옴
            System.out.print(j+" ");
            for(Edge e:graph[j]){ // 정점 j에 인접한 정점들중 방문안된 정점 하나씩 방문
                if(!visited[e.adjvertex]){
                    visited[e.adjvertex] = true;
                    q.add(e.adjvertex); // 새로 방문된 정점은 큐에 삽입
                }
            }
        }
    }
}
