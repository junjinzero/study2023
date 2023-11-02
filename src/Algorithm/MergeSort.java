package Algorithm;

public class MergeSort
{
    /**
     * 병합 정렬 : 분할 정복(Divide and Conquer) 의 원리를 기반으로 동작한다.
     * 이 알고리즘은 배열을 반으로 분할하고, 각 반을 정렬한 다음 병합하는 과정을 반복하여 전체 배열을 정렬한다.
     * 병합 정렬의 주요 단계
     *    1. 분할(Divide) : 배열을 반으로 분할한다. 배열을 가운데 요소를 중심으로 두 개의 하위 배열로 나누는 과정
     *    2. 정복(Conquer) : 각 하위 배열을 재귀적으로 정렬한다. 병합 정렬을 반복적으로 적용하는 과정
     *    3. 병합(Merge) : 정렬된 하위 배열을 병합하여 최종 정렬된 배열을 생성한다. 두 하위 배열을 비교하면서 원소를 적절한 위치에 배치한다.
     * 시간 복잡도 : O(n*log(n))
     *  - 배열을 분할하고 병합할 때 O(log(n)) 번의 단계가 필요
     *  - 각 단계에서 배열을 전체 스캔하는 데 O(n) 시간이 걸린다.
     *  병합 정렬은 배열의 크기에 상관 없이 항상 일정한 시간 복잡도를 가지므로, 매우 효율적인 알고리즘 중 하나이다.
     */
    public static void main(String[] args)
    {
        int[] arr = {38, 27, 43, 3, 9, 82, 10};

        System.out.println("정렬 전 배열 : ");
        printArray(arr);

        mergeSort(arr);

        System.out.println("\n정렬 후 배열 : ");
        printArray(arr);
    }
    // 병합 정렬 함수
    public static void mergeSort(int[] arr)
    {
        if(arr.length > 1)
        {
            int mid = arr.length / 2;
            int[] left = new int[mid];
            int[] right = new int[arr.length - mid];

            //arraycopy(원본 배열, 복사를 시작할 위치, 대상 배열(복사된 데이터가 저장될 배열), 대상 배열에서 데이터가 복사될 위치, 복사할 요소의 개수)
            System.arraycopy(arr, 0, left, 0, mid);
            System.arraycopy(arr, mid, right, 0, arr.length-mid);

            mergeSort(left);
            mergeSort(right);

            int i = 0, j = 0, k = 0;

            while(i < left.length && j < right.length)
            {
                if(left[i]  < right[i])
                {
                    arr[k++] = left[i++];
                }
                else
                {
                    arr[k++] = right[j++];
                }
            }

            while(i < left.length)
            {
                arr[k++] = left[i++];
            }
            while(j < right.length)
            {
                arr[k++] = right[j++];
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
