package DataStructure.NonLinearStructure.Graph;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Ex04_DirectedGraph
{
    /**
     * 단방향 그래프
     * 각 간선은 출발 -> 도착 으로 향하는 방향을 가지며, 정보의 흐름이 한 방향으로만 허용된다.
     * 간선에 방향이 있어서 정보가 한 방향으로만 흐른다. ex.웹 페이지 간의 하이퍼링크, sns 상의 팔로우 관계 등
     */

    static class Vertex
    {
        int data; // 정점의 데이터
        List<Vertex> neighbors;  // 인접한 록정점들의 목록

        Vertex(int data)
        {
            this.data = data;
            neighbors = new ArrayList<>();  // 인접한 정점들을 저장하는 리스트 초기화
        }
    }
    // 단방향 그래프를 관리하는 클래스
    static class DirectedGraph
    {
        Map<Integer, Vertex> vertices;  // 정점을 데이터에 매핑하는 맵

        DirectedGraph()
        {
            vertices = new HashMap<>();
        }
        // 새로운 정점 추가
        void addVertex(int data)
        {
            if(!vertices.containsKey(data))
            {
                vertices.put(data, new Vertex(data));   // 새로운 정점 객체 생성
            }
        }
        // 간선 추가
        void addEdge(int src, int dest)
        {
            if(vertices.containsKey(src) && vertices.containsKey(dest))
            {
                Vertex srcVertex = vertices.get(src);
                Vertex destVertex = vertices.get(dest);
                srcVertex.neighbors.add(destVertex);  // 방향 있는 간선 추가
            }
        }
        // 그래프 출력
        void printGraph()
        {
            for (Vertex vertex : vertices.values())
            {
                System.out.print("정점 " + vertex.data + "에서 이동할 수 있는 정점 : ");
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
        DirectedGraph graph = new DirectedGraph();

        // 정점 추가
        graph.addVertex(1);
        graph.addVertex(2);
        graph.addVertex(3);

        // 간선 추가
        graph.addEdge(1, 2);
        graph.addEdge(2, 3);

        System.out.println("단방향 그래프 : ");
        graph.printGraph();
    }


}

