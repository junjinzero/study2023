package DataStructure;

import java.util.ArrayDeque;

public class Deque
{
    /*
    * 데크는 양쪽 끝에서 요소를 추가하거나 제거할 수 있는 자료 구조이다.
    * 자바에서는 java.util.Deque 인터페이스를 사용하여 데크를 구현할 수 있다.
    * 보통 입력이나 출력 중 하나를 한 쪽 입구만 가능하게 제한하는 형태가 많이 쓰인다.
    * */
    public static void main(String[] args)
    {
        java.util.Deque<Integer> deque = new ArrayDeque<>();

        // 앞과 뒤에서 요소 추가
        deque.addFirst(1);
        deque.addLast(2);
        deque.addFirst(3);
        deque.addLast(4);

        System.out.println("deque contents : " + deque);

        // 앞과 뒤에서 요소 제거
        int removedFirst = deque.removeFirst();
        int removedLast = deque.removeLast();

        System.out.println("앞에서 제거한 요소 : " + removedFirst);
        System.out.println("뒤에서 제거한 요소 : " + removedLast);
        System.out.println("deque contents : " + deque);

    }
}

