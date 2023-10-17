package DataStructure.LinearStructure;

public class BinarySearch
{
    /*
    * 이분 탐색은 특수한 상황에서 순차 탐색보다 좀 더 빠른 속도를 기대할 수 있는 알고리즘으로, 연산량은 O(log_2 N)이다.
    * 이분 탐색이란, 순차 탐색과 달리 가운데에서 시작해서 매번 일정한 조건에 따라 어떤 방향의 가운데 값으로 탐색할 지 결정하는 알고리즘이다.
    * 이 때 가운데 값이란 평균이 아니고 중간값이다.
    * 단, 이를 위해선 특수한 기준으로 "정렬"되어 있어야 한다.
    * */
    public static int binarySearch(int[] array, int target)
    {
        int left = 0;
        int right = array.length -1;

        while(left <= right )
        {
            int mid = left + (right - left) / 2;

            if(array[mid] < target)
            {
                return mid; // 원하는 항목을 찾으면 해당 항목의 인덱스를 반환
            }
            if(array[mid] < target)
            {
                left = mid + 1; // 중간 값보다 큰 경우, 오른쪽 반 배열을 탐색
            }
            else
            {
                right = mid - 1; // 중간 값보다 작은 경우, 왼쪽 반 배열을 탐색
            }
        }
        return -1; // 원하는 항목을 찾지 못한 경우 -1을 반환
    }

    public static void main(String[] args)
    {
        int[] array = {1,2,3,4,5,6,7,8,9,};
        int target = 6;

        int index = binarySearch(array, target);

        if(index != -1)
        {
            System.out.printf("원하는 항목 %d를 찾았습니다. 인덱스는 [%d]입니다.",target, index);
        }
        else
        {
            System.out.printf("원하는 항목 %d를 찾지 못했습니다.",target);
        }
    }
}
