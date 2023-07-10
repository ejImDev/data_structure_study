package Grape;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class TopologicalSort {
    int N;
    boolean[] visited;
    List<Integer>[] adjList;
    List<Integer> sequence;

    public TopologicalSort(List<Integer>[] grape){
        N = grape.length;
        visited = new boolean[N];
        adjList = grape;
        sequence = new ArrayList<>();
    }
    public List<Integer> tsort(){
        for(int i=0; i<N; i++){
            if(!visited[i]){
                dfs(i);
            }
        }
        Collections.reverse(sequence);
        return sequence;
    }
    public void dfs(int i){
        visited[i] = true;
        for (int v : adjList[i]){
            if (!visited[v]){
                dfs(v);
            }
        }
        sequence.add(i);
    }

}
