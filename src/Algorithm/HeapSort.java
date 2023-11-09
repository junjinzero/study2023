package Algorithm;

public class HeapSort
{
    /**
     * 힙 정렬 : 효율적인 정렬 알고리즘 중 하나로, 힙(Heap) 자료 구조를 사용하여 정렬을 수행한다.
     * 힙은 부모 노드와 자식 노드 간의 특정한 순서를 만족하는 이진 트리의 한 형태로, 최대 힙(Max heap) 또는 최소 힙(Min heap) 으로 나눌 수 있다.
     * 힙 정렬은 주로 최대 힙을 사용하여 정렬을 수행한다.
     *
     * 힙 정렬의 주요 단계
     *  1. 힙 구성(Build Heap) : 주어진 배열을 최대 힙 구조로 만든다. 이 단계에서는 배열을 힙 구조로 조정한다.
     *  2. 힙에서 최댓값 추출(Extract Maximum) : 힙에서 루트 노드(최댓값)를 추출하고 배열의 끝으로 이동한다. 이로써 배열의 가장 큰 값이 정렬된 위치로 오게 된다.
     *  3. 힙 크기 감소(Decrease Heap Size) : 힙의 크기를 줄여나간다.
     *  4. 반복(Repeat) : 2단계와 3단계를 반복하여 힙을 계속 추출하고 배열의 다음 위치로 이동한다.
     * 시간복잡도 : O(n*log(n))
     *  - 힙을 구성하는 단계에서 O(n*log(n)) 의 시간 소요
     *  - 최댓값을 추출하고 힙 크기를 감소시키는 단계를 n번 반복
     */
    public static void main(String[] args)
    {
        int[] arr = {64, 34, 25, 12, 22, 11, 90};

        System.out.println("정렬 전 배열 : ");
        printArray(arr);

        heapSort(arr);

        System.out.println("\n정렬 후 배열 : ");
        printArray(arr);
    }

    // 힙 정렬 함수
    private static void heapSort(int[] arr)
    {
        int n = arr.length;

        // 최대 힙 구성
        for(int i = n/2 - 1; i >= 0; i--)
        {
            heapify(arr, n ,i);
        }

        // 최댓값을 반복적으로 추출
        for (int i = n -1; i > 0; i--)
        {
            int temp = arr[0];
            arr[0] = arr[i];
            arr[i] = temp;

            // 힙 구성을 다시 수행
            heapify(arr, i, 0);
        }

    }

    private static void heapify(int[] arr, int n, int i)
    {
        int largest = i;
        int left = 2 * i + 1;
        int right = 2 * i + 2;

        if(left < n && arr[left] > arr[largest])
        {
            largest = left;
        }
        if(right < n && arr[right] > arr[largest])
        {
            largest = right;
        }
        if(largest != i)
        {
            int swap = arr[i];
            arr[i] = arr[largest];
            arr[largest] = swap;

            heapify(arr, n, largest);
        }

    }


    // 배열 출력 함수
    private static void printArray(int[] arr)
    {
        for (int i = 0; i < arr.length; i++)
        {
            System.out.print(arr[i] + " ");
        }
    }

}
