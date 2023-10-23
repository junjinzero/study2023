package DataStructure.NonLinearStructure.Graph;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Ex03_PseudoGraph
{
    /**
     * 의사 그래프
     * 방향 그래프의 일종으로, 동일한 두 정점 사이에 여러 간선이 존재할 수 있다.
     * 즉, 간선이 한 방향으로만 향하면서 루프(loop) 또한 가능하다.
     */

    static class Vertex
    {
        int data;
        List<Vertex> edges;

        Vertex(int data)
        {
            this.data = data;
            edges = new ArrayList<>();
        }
    }

    // 의사 그래프를 관리하는 클래스
    static class PsuedoGraph
    {
        Map<Integer, Vertex> vertices;

        PsuedoGraph()
        {
            vertices = new HashMap<>();
        }

        // 정점 추가
        void addVertex(int data)
        {
            if(!vertices.containsKey(data))
            {
                vertices.put(data, new Vertex(data));
            }
        }

        // 간선 추가
        void addEdge(int src, int dest)
        {
            if(vertices.containsKey(src) && vertices.containsKey(dest))
            {
                Vertex srcVertex = vertices.get(src);
                Vertex destVertex = vertices.get(dest);
                srcVertex.edges.add(destVertex);
            }
        }

        // 그래프 출력
        void printGraph()
        {
            for (Vertex vertex : vertices.values())
            {
                System.out.print("정점 " + vertex.data + "에 인접한 정점 : ");
                for (Vertex neighbor : vertex.edges)
                {
                    System.out.print(neighbor.data + " ");
                }
                System.out.println();
            }
        }
    }
    public static void main(String[] args)
    {
        PsuedoGraph graph = new PsuedoGraph();

        graph.addVertex(1);
        graph.addVertex(2);
        graph.addVertex(3);

        graph.addEdge(1,2);
        graph.addEdge(2,3);
        graph.addEdge(1,2); // 중복 간선 추가
        graph.addEdge(2,2); // 루프

        System.out.println("의사 그래프 : ");
        graph.printGraph();

//        ==== 출력 결과 ====
//        의사 그래프 :
//        정점 1에 인접한 정점 : 2 2
//        정점 2에 인접한 정점 : 3 2
//        정점 3에 인접한 정점 :
//        ==== ==== ==== ====
//        정점 1은 정점 2와 중복 간선을 가지며, 정점 2는 정점3과 정점2(루프)와 연결되어 있다.
//        정점 3은 다른 정점과 연결된 간선이 없으므로 빈 리스트가 출력된다.
    }
}

