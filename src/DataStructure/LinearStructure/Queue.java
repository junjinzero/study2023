package DataStructure.LinearStructure;

import java.util.LinkedList;
public class Queue
{

    /*
    * 먼저 들어간 자료가 먼저 나오는 자료구조. "선입선출" 구조라고도 한다.
    * 자료를 넣는 Enqueue 함수와 자료를 빼내는 Dequeue 함수를 가진다.
    * 본 코드는 연결 리스트 자료구조로 큐를 구현한 것이다.
    * @// TODO: 10/12/23
    *   연결 리스트가 뭔지 공부하기
    * */

    java.util.Queue<Integer> queue = new LinkedList<>();

    void enQueue(int n )
    {
        queue.add(n);
    }
    int deQueue()
    {
        return queue.poll();
    }
    public static void main(String[] args)
    {
        Queue qu = new Queue();
        qu.enQueue(30);
        qu.enQueue(40);
        qu.enQueue(50);

        System.out.printf("%d %d %d", qu.deQueue(), qu.deQueue(), qu.deQueue());

    }
}
