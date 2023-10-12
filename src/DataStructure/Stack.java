package DataStructure;

public class Stack {
    /*
    * 먼저 들어간 자료가 나중에 나오는 자료구조. 유식한 말로 "후입선출" 구조라고 한다.
    * 자료를 넣는 push 함수와 자료를 빼는 pop 함수를 갖는게 정석이다.
    * empty, full 등 다른 함수들을 가질 수 있다.
    * 본 코드는 배열 자료구조로 스택 클래스를 구현한 것이다.
    * @// TODO: 10/12/23
     * 활용 문제 : stack 자료구조를 활용하여 특정 문자열을 입력받은 뒤, 그 문자열을 거꾸로 뒤집은 것을 출력하는 코드를 작성하시오.
    * */

    int size = 500;
    int[] arr = new int[size];
    int top = 0;

    int push(int n)
    {
        if(top > size)
        {
            return -1;
        }
        arr[top++] = n;
        return 0;
    }

    int pop()
    {
        if(top <= 0)
        {
            return -1;
        }
        return arr[--top];
    }
    public static void main(String[] args)
    {
        Stack stack = new Stack();
        stack.push(1);
        stack.push(2);
        stack.push(3);
        System.out.printf("%d %d %d", stack.pop(),stack.pop(),stack.pop());
    }
}