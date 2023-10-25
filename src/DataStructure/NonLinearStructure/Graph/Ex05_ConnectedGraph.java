package DataStructure.NonLinearStructure.Graph;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Ex05_ConnectedGraph
{
    /**
     * 연결 그래프
     * 모든 정점들이 적어도 하나의 경로를 통해 연결된 그래프. 모든 정점들이 연결되어 있다.
     * 분리된 부분 그래프가 없다.
     * 간선의 방향성은 중요하지 않다. 양방향 그래프와 단방향 그래프 모두를 포함할 수 있다.
     */

    // 정점을 나타내는 클래스
    static class Vertex
    {
        int data;  // 정점의 데이터
        List<Vertex> neighbors;  // 인접한 정점들의 목록

        Vertex(int data)
        {
            this.data = data;
            neighbors = new ArrayList<>();  // 인접한 정점들을 저장하는 리스트 초기화
        }
    }

    // 연결 그래프를 관리하는 클래스
    static class ConnectedGraph
    {
        Map<Integer, Vertex> vertices;  // 정점을 데이터에 매핑하는 맵

        ConnectedGraph()
        {
            vertices = new HashMap<>();
        }

        // 새로운 정점 추가
        void addVertex(int data)
        {
            if(!vertices.containsKey(data))
            {
                vertices.put(data, new Vertex(data));  // 새로운 정점 객체 생성
            }
        }

        // 간선 추가
        void addEdge(int src, int dest)
        {
            if(vertices.containsKey(src) && vertices.containsKey(dest))
            {
                Vertex srcVertex = vertices.get(src);
                Vertex destVertex = vertices.get(dest);
                srcVertex.neighbors.add(destVertex);   // 간선 추가
                destVertex.neighbors.add(srcVertex);   // 양방향 연결을 위해 역방향도 추가
            }
        }

        // 그래프 출력
        void printGraph()
        {
            for (Vertex vertex : vertices.values())
            {
                System.out.print("정점 " + vertex.data + "와 연결된 정점 : ");
                for (Vertex neighbor : vertex.neighbors)
                {
                    System.out.print(neighbor.data + " ");
                }
                System.out.println();
            }
        }
    }

    public static void main(String[] args)
    {
        ConnectedGraph graph = new ConnectedGraph();

        // 정점 추가
        graph.addVertex(1);
        graph.addVertex(2);
        graph.addVertex(3);

        // 간선 추가
        graph.addEdge(1, 2);
        graph.addEdge(2, 3);

        System.out.println("연결 그래프 : ");
        graph.printGraph();
    }
}

