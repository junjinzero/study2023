package DataStructure.NonLinearStructure.Graph;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class Ex02_MultiGraph
{
    /**
     * 다중 그래프
     * 무방향 그래프와는 다르게 동일한 두 정점 간에 복수의 간선(중복 간선)을 가질 수 있는 그래프
     */

    private int V; // 그래프의 정점 수
    private List<Edge> edges; // 간선 리스트

    // 간선을 나타내는 클래스
    class Edge
    {
        int src, dest;

        Edge(int  src, int dest)
        {
            this.src = src;
            this.dest = dest;
        }
    }
    // 그래프 생성자
    Ex02_MultiGraph(int v)
    {
        V = v;
        edges = new ArrayList<>();
    }

    // 그래프에 간선 추가
    void addEdge(int src, int dest)
    {
        edges.add(new Edge(src, dest));
    }

    // 그래프의 정점과 간선 출력
    void printGraph()
    {
        for (Edge edge : edges)
        {
            System.out.printf("간선 %d - %d\n",edge.src, edge.dest);
        }
    }

    public static void main(String[] args)
    {
        int V = 5; // 정점 수
        Ex02_MultiGraph graph = new Ex02_MultiGraph(V);

        graph.addEdge(0 ,1);
        graph.addEdge(0 ,1);  // 중복 간선
        graph.addEdge(0 ,2);
        graph.addEdge(1 ,3);
        graph.addEdge(2 ,3);
        graph.addEdge(3 ,4);
        graph.addEdge(3 ,4);  // 중복 간선

        System.out.println("다중 그래프의 정점과 간선 : " );
        graph.printGraph();
    }
}

