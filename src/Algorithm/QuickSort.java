package Algorithm;

public class QuickSort
{
    /**
     * 퀵 정렬 : 효율적인 정렬 알고리즘 중 하나로, 분할 정복 (Divide and Conquer) 방법을 기반으로 동작한다.
     * 배열을 분할하고, 각 분할된 부분을 재귀적으로 정렬한 후 합병하는 과정을 통해 정렬을 수행한다.
     * 퀵 정렬의 주요 단계
     *  1. 분할(Divide) : 배열에서 하나의 요소(pivot)를 선택하고, 피벗을 기준으로 작은 요소는 왼쪽으로, 큰 요소는 오른쪽으로 분할한다.
     *  2. 정복(Conquer) : 분할된 두 부분을 재귀적으로 퀵 정렬을 적용하여 각각 정렬한다.
     *  3. 합병(Merge) : 정렬된 부분 배열을 합병하여 최종 정렬된 배열을 생성한다.
     * 시간복잡도 : O(n*log(n))
     *  - 피벗을 기준으로 분할하고 병합하는 과정이 O(log(n)) 번 반복
     *  - 각 분할과 병합 단계에서 O(n) 번의 비교 및 이동 연산 수행
     * 다른 정렬 알고리즘보다 빠른 성능을 보이며, 대부분의 경우 효율적으로 동작한다.
     * 그러나 최악의 경우에는 시간복잡도가 O(n^2)가 될 수 있으므로, 피벗의 선택과 피벗 주변의 데이터 분포가 성능에 큰 영향을 미친다.
     */
    public static void main(String[] args)
    {
        int[] arr = {38, 27, 43, 3, 9, 82, 10};

        System.out.println("정렬 전 배열 : ");
        printArray(arr);

        quickSort(arr, 0, arr.length - 1);

        System.out.println("\n정렬 후 배열 : ");
        printArray(arr);
    }

    private static int quickSort(int[] arr, int low, int high)
    {
        int pivot = arr[high];
        int i = low - 1;

        for (int j = low; j < high; j++)
        {
            if(arr[j] < pivot)
            {
                i++;
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            }
        }

        int temp = arr[i + 1];
        arr[i + 1] = arr[high];
        arr[high] = temp;

        return i + 1;
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
