package DataStructure.NonLinearStructure.Graph.GraphTraversalAlgorithms;

import DataStructure.NonLinearStructure.Graph.Graph;

import java.util.LinkedList;
import java.util.Queue;

public class BfsGraph
{
    /**
     * 너비 우선 탐색(Breadth-First Search)
     * 그래프나 트리를 탐색할 때 너비(수평)방향으로 탐색을 수행하는 알고리즘
     * BFS 는 주로 가까운 정점부터 순서대로 탐색하며, 큐 자료 구조를 사용하여 구현된다.
     *************** BFS 의 작동 방식 **************************************
     * 1. 시작 정점을 큐에 추가하고, 시작 정점을 "방문한 것으로 표시"한다.
     * 2. 큐에서 정점을 하나 꺼내서 해당 정점의 모든 이웃(인접한 정점)을 큐에 추가한다.
     * 3. 큐에서 꺼낸 정점을 방문한 것으로 표시한다.
     * 4. 큐가 빌 때까지 위 과정을 반복한다.
     * BFS 의 특징 - 시작 정점으로부터 먼 정점부터 순차적으로 탐색한다.
     *           - 최단 경로, 최소 비용 경로, 연결 요소 식별 등 다양한 문제에 활용된다.
     *           - 무방향 그래프 및 방향 그래프 모두에 적용할 수 있다.
     */
    private int V;  // 정점의 개수
    private LinkedList<Integer>[] adj;  // 인접 리스트

    public BfsGraph(int vertices)
    {
        V = vertices;
        adj = new LinkedList[vertices];
        for(int i = 0; i < vertices; i++)
        {
            adj[i] = new LinkedList<>();
        }
    }
    // 간선 추가
    public void addEdge(int src, int dest)
    {
        adj[src].add(dest);
    }
    // BFS 탐색 메서드
    public void BFS(int start)
    {
        boolean[] visited = new boolean[V];  // 방문 여부를 저장할 배열
        Queue<Integer> queue = new LinkedList<>();

        visited[start] = true;
        queue.offer(start);

        while (!queue.isEmpty())
        {
            int current = queue.poll();
            System.out.print(current + " ");

            for (int neighbor : adj[current])
            {
                if(!visited[neighbor])
                {
                    visited[neighbor] = true;
                    queue.offer(neighbor);
                }
            }
        }
    }

    public static void main(String[] args)
    {
        BfsGraph bfsGraph = new BfsGraph(7);
        bfsGraph.addEdge(0,1);
        bfsGraph.addEdge(0,2);
        bfsGraph.addEdge(1,5);
        bfsGraph.addEdge(1,3);
        bfsGraph.addEdge(2,4);
        bfsGraph.addEdge(3,6);

        System.out.println("너비 우선 탐색 결과 (시작 정점 : 0) ");
        bfsGraph.BFS(0);

    }

}
