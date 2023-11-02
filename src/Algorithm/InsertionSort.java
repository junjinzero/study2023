package Algorithm;

public class InsertionSort
{
    /**
     * 삽입 정렬 : 배열을 정렬된 부분과 정렬되지 않은 부분으로 나누어 작업한다.
     * 정렬되지 않은 부분의 원소를 하나씩 가져와 이미 정렬된 부분의 올바른 위치에 삽입하는 방식으로 동작한다.
     * 배열을 두 부분으로 나누고, 정렬되지 않은 부분에서 원소를 선택하여 정렬된 부분의 올바른 위치에 삽입하는 것.
     * 이것을 반복하여 전체 배열이 정렬될 때까지 수행한다.
     * 시간복잡도 : O(n^2)
     *  - 평균적으로 n/2 번의 비교 연산과 n/2번의 이동(또는 교환) 연산을 수행한다.
     *  - 이미 정렬된 배열이나 정렬된 부분이 큰 배열에 대해서는 비교적 빠르게 동작할 수 있지만, 역순으로 정렬된 배열 등에서는 성능이 나빠질 수 있다.
     *  - 그러므로 작은 배열이나 거의 정렬된 배열에 대해 사용할 때 가장 효과적이다.렬
     * @param args
     */
    public static void main(String[] args)
    {
        int[] arr = {64, 34, 25, 12, 22, 11, 90};

        System.out.println("정렬 전 배열 : ");
        printArray(arr);

        insertionSort(arr);

        System.out.println("\n정렬 후 배열 : ");
        printArray(arr);
    }
    // 삽입 정렬 함수
    public static void insertionSort(int[] arr)
    {
        int n = arr.length;

        for (int i = 1; i < n; i++)
        {
            int key = arr[i];
            int j = i - 1;

            // key를 올바른 위치에 삽입
            while(j >= 0 && arr[j] > key)
            {
                arr[j + 1] = arr[j];
                j = j -1;
            }
            arr[j + 1] = key;
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
