package DataStructure;

public class LinkedList
{
    /*
    * 연결 리스트라고도 불린다. 각 요소가 다음 요소에 대한 참조(링크)를 가지고 있어 선형적인 데이터 구조를 형성한다.
    * 값과 다음 노드를 가지고 있다. 옵션으로 이전 노드를 가지게 할 수도 있으며, 맨 뒤 노드가 앞 노드를 다음 노드로 가지게 할 수도 있다.
    * 또한, 중간에서 삽입과 삭제를 할 수 있다. 가장 간단하게 구현한 것은 Queue.
    * 링크드 리스트는 원소들이 이곳저곳에 흩어져 있어서 구현체의 속도가 느리기 때문에, 잘 사용되지 않는 편이다.
    * */
    public static void main(String[] args)
    {
        java.util.LinkedList<String> lkList = new java.util.LinkedList<>();

        // 요소 추가
        lkList.add("사과");
        lkList.add("바나나");
        lkList.add("딸기");
        lkList.add("포도");

        // 요소 순회 및 출력
        System.out.println("LinkedList 요소 : ");
        for (String fruit : lkList)
        {
            System.out.println(fruit);
        }

        // 요소 제거
        lkList.remove("바나나");

        // 수정된 LinkedList 출력
        System.out.println("바나나 제거 후 : ");
        for (String fruit : lkList)
        {
            System.out.println(fruit);
        }

    }
}
