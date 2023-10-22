package DataStructure.NonLinearStructure.Graph;

import java.util.LinkedList;

public class Ex01_SimpleGraph
{
    /*
    * 단순 그래프는 무방향 그래프로, 정점 간의 간선이 방향을 가지지 않는 그래프이다.
    * 간선이 정점 사이를 양방향으로 연결한다.
    * */

    private int V; // 그래프의 정점 수
    private LinkedList<Integer> adjListArray[]; // 인접 리스트 배열

    // 그래프 생성자
    Ex01_SimpleGraph(int v)
    {
        V = v;
        adjListArray = new LinkedList[v];
        for (int i = 0 ; i< v ; i++)
        {
            adjListArray[i] = new LinkedList<>();
        }
    }

    // 그래프에 간선 추가
    void addEdge(int src, int dest)
    {
        adjListArray[src].add(dest);
        adjListArray[dest].add(src);  // 무방향 그래프이므로 양방향으로 추가
    }

    // 그래프의 정점과 간선 출력
    void printGraph()
    {
        for (int v = 0 ; v < V ; v++)
        {
            System.out.print("정점 " + v + "에 인접한 정점 : ");
            for (Integer neighbor : adjListArray[v])
            {
                System.out.printf("neighbor %d, ", neighbor);
            }
            System.out.println();
        }
    }

    public static void main(String[] args)
    {
        int V = 5; // 정점 수
        Ex01_SimpleGraph graph = new Ex01_SimpleGraph(V);

        graph.addEdge(0,1);
        graph.addEdge(0,4);
        graph.addEdge(1,2);
        graph.addEdge(1,3);
        graph.addEdge(1,4);
        graph.addEdge(2,3);
        graph.addEdge(3,4);

        System.out.println("단순 그래프의 정점과 간선 : ");
        graph.printGraph();
    }

}
