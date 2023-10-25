package DataStructure.NonLinearStructure.Graph.GraphTraversalAlgorithms;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class DfsGraph
{
    /**
     * 깊이 우선 탐색(Depth-First Search)
     * 그래프나 트리의 모든 정점을 방문하면서 가능한 깊숙히 들어가서 탐색하는 알고리즘이다.
     * 스택 또는 재귀 함수를 사용하여 구현할 수 있다.
     * 주로 그래프의 탐색, 연결 요소 찾기, 사이클 검출 등에 사용된다.
     *************** DFS 의 작동 방식 **************************************
     * 1. 시작 정점을 방문하고 방문한 정점을 "방문한 것으로 표시" 한다.
     * 2. 현재 정점과 연결된 정점(인접한 정점) 중에서 방문하지 않은 정점이 있다면, 하나를 선택하고 그 정점으로 이동한다.
     * 3. 선택한 정점에서 다시 DFS 를 재귀적으로 수행한다.
     * 4. 더 이상 방문하지 않은 정점이 없을 때까지 이 과정을 반복한다.
     */
    private int V;  // 정점의 개수
    private List<List<Integer>> adj;  // 인접 리스트

    public DfsGraph(int vertices)
    {
        V = vertices;
        adj = new ArrayList<>(vertices);
        for (int i = 0 ; i < vertices; i++)
        {
            adj.add(new ArrayList<>());
        }
    }
    // 간선 추가
    public void addEdge(int src, int dest)
    {
        adj.get(src).add(dest);
    }
    // 깊이 우선 탐색 메서드
    public void DFS(int start)
    {
        boolean[] visited = new boolean[V];  // 방문 여부를 저장할 배열
        Stack<Integer> stack = new Stack<>();

        visited[start] = true;
        stack.push(start);

        while(!stack.isEmpty())
        {
            int current = stack.pop();
            System.out.print(current + " ");

            List<Integer> neighbors = adj.get(current);
            for (int neighbor : neighbors)
            {
                if(!visited[neighbor])
                {
                    visited[neighbor] = true;
                    stack.push(neighbor);
                }
            }
        }
    }

    public static void main(String[] args)
    {
        DfsGraph dfsGraph = new DfsGraph(7);
        dfsGraph.addEdge(0, 1);
        dfsGraph.addEdge(0, 2);
        dfsGraph.addEdge(1, 3);
        dfsGraph.addEdge(1, 4);
        dfsGraph.addEdge(2, 5);
        dfsGraph.addEdge(2, 6);

        System.out.println("깊이 우선 탐색 결과 ( 시작 정점은 0이다. ) ");
        dfsGraph.DFS(0);
    }

}
