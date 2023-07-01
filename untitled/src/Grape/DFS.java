package Grape;

import java.util.List;

public class DFS {
    int N;
    List<Edge>[] grape;
    private boolean[] visited; // DFS 수행 중 방문한 정점을 true로 만든다
    public DFS(List<Edge>[] adjList){ // 생성자
        N = adjList.length;
        grape = adjList;
        visited = new boolean[N];
        for(int i=0; i<N; i++){
            visited[i] = false; // 배열 초기화
        }
        for (int i=0; i<N; i++){
            if(!visited[i]){
                dfs(i);
            }
        }
    }

    private void dfs(int i){
        visited[i] = true; // 방문한 정점은 상태 변경
        System.out.print(i+" ");
        for (Edge e : grape[i]) { // 각 정점에 인접한 정점을 찾아
            if(!visited[e.adjvertex]){ // 방문안되었으면 재귀호출
                dfs(e.adjvertex);
            }
        }
    }

}
