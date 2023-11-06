package Algorithm;

public class SelectionSort
{
    /**
     * 선택 정렬 : 간단하며 비효율적인 정렬 알고리즘
     * 배열을 반복 순회하면서 가장 작은(또는 가장 큰) 원소를 선택하여 정렬되지 않은 부분의 처음으로 이동시키는 방식으로 동작한다.
     * 배열을 정렬된 부분과 정렬되지 않은 부분으로 나누고, 정렬되지 않은 부분에서 가장 작은(또는 가장 큰) 원소를 선택하여 정렬된 부분의 마지막으로 이동시킨다.
     * 이 과정을 반복하여 정렬을 완료한다.
     * 시간복잡도 : O(n^2)
     *  - 배열을 반복 순회하면서 비교 및 교환을 수행하는데, 비교 횟수와 교환 횟수가 배열의 크기 n의 제곱에 비례한다.
     *  - 따라서 대규모 데이터에 대해 비효율적인 정렬법이다.
     *
     * ** 불안정 정렬 : 비교한 값이 같을 때 서로 바뀌는 정렬법
     */
    public static void main(String[] args)
    {
        int[] arr = {38, 27, 43, 3, 9, 82, 10};

        System.out.println("정렬 전 배열 : ");
        printArray(arr);

        selectionSort(arr);

        System.out.println("\n정렬 후 배열 : ");
        printArray(arr);
    }

    // 선택 정렬 함수
    private static void selectionSort(int[] arr)
    {
        int n = arr.length;

        for (int i = 0; i < n-1; i++)
        {
            int minIndex = i;
            for (int j = i+1; j < n; j++)
            {
                if(arr[j] < arr[minIndex])
                {
                    minIndex = j;
                }
            }

            // 최솟값과 현재 위치의 원소 교환
            int temp = arr[i];
            arr[i] = arr[minIndex];
            arr[minIndex] = temp;
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
