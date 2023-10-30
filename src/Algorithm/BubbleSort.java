package Algorithm;

public class BubbleSort
{
    /**
     * 버블 정렬 : 인접한 두 원소를 비교하여 정렬하는 방식
     * 배열을 처음부터 끝까지 순회하면서 인접한 두 원소를 비교하며, 만약 두 원소가 정렬 순서와 반대라면 서로 위치를 교환한다.
     * 이 과정을 배열의 끝까지 반복하며 정렬을 완료한다.
     * 간단하지만 비효율적인 정렬 알고리즘 중 하나로, 대규모 데이터에 대해서 사용하기에는 적합하지 않다.
     * 시간복잡도 : O(n^2)
     *   - 외부 루프 : n-1번 반복 (n은 배열의 크기)
     *   - 내부 루프 : 각 외부 루프 반복마다 n-1, n-2, n-3..., 2, 1 번 반복
     */
    public static void main(String[] args)
    {
        int[] arr = {64, 34, 25, 12, 22, 11, 90};

        System.out.println("정렬 전 배열 : ");
        printArray(arr);

        bubbleSort(arr);

        System.out.println("\n정렬 후 배열 : ");
        printArray(arr);
    }

    // 버블 정렬 함수
    private static void bubbleSort(int[] arr)
    {
        int n = arr.length;
        boolean swapped;

        for (int i = 0; i < n-1; i++)
        {
            swapped = false;
            for (int j = 0; j < n-1; j++)
            {
                if(arr[j] > arr[j+1])
                {
                    // 두 원소 위치 교환
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                    swapped = true;
                }
            }
            // 만약 내부 루프에서 교환이 일어나지 않았다면 배열은 이미 정렬되어 있는 것
            if(!swapped)
            {
                break;
            }
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
