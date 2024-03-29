package DataStructure.NonLinearStructure.Tree;

public class Tree
{
    /*
     *** 트리 관련 용어 ***
     * 트리 : 계층적인 구조를 나타내는 비선형 자료구조로, 그래프의 일종이다.
     * 트리에서의 정점을 "노드"라고 하고, 간선을 "가지"라고 한다.
     * 노드(Node) : 그래프의 정점에 해당
     *  - 루트 노드 : 트리의 기준이 되는 노드. 루트 노드 위에 가지가 뻗어있다는 이미지
     *  - 부모 노드 : 어떤 노드에서 자신과 인접한 노드들 중 루트 노드로 향하는 노드
     *  - 자식 노드 : 어떤 노드에서 자신과 인접한 노드들 중 루트 노드의 반대 방향으로 향하는 노드
     *  - 단말 노드 : 자식 노드가 존재하지 않는 노드. 가지의 끝이라고 생각하면 된다.
     *  - 형제 노드 : 부모 노드가 같은 노드
     * 가지(Branch) : 그래프의 간선에 해당하는 것. 트리에서는 양방향 간선만 사용한다.
     * 부트리(Sub Tree) : 부분 그래프와 비슷하게 정의한다.
     * 차수(Degree) : 자식 노드의 개수
     * 길이(Length) : 임의의 두 노드를 시작 노드, 도착 노드로 하는 경로에서 거치게 되는 노드의 수
     *  - 깊이(Depth) : 루트 노드에서 해당 노드까지의 길이
     *  - 레벨(Level) : 깊이가 같은 노드의 집합
     *  - 높이(Height) : 가장 깊이가 깊은 단말 노드까지의 길이
     */
    /*
    *** 트리의 종류 ***
    * 1. 이진 트리 : 모든 노드의 차수가 2 이하인 트리
    * 2. 전 이진 트리 : 모든 노드의 차수가 0 또는 2인 트리
    * 3. 포화 이진 트리 : 모든 단말 노드의 깊이가 같은 이진 트리
    * 4. 완전 이진 트리 : 모든 단말 노드의 깊이의 최댓값과 최솟값의 차이가 0 또는 1인 트리
     */
}
