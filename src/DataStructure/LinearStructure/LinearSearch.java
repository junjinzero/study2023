package DataStructure.LinearStructure;

public class LinearSearch
{
    /*
    * 선형 구조 자료에서는 주로 배열, 리스트 또는 연결 리스트를 사용한다.
    * 선형구조로 된 자료를 탐색하는 방법. 보통 어떤 값이 어디에 있는지 알아내는 게 목적이다.
    * */
    public static int linearSearched(int[] arr, int target)
    {
        for (int i = 0; i< arr.length; i++)
        {
            if(arr[i] == target)
            {
                return i; // 요소를 찾았을 때 인덱스 반환
            }
        }
        return -1; // 요소를 찾지 못했을 때 -1 반환
    }

    public static void main(String[] args)
    {
        int[] arr = {2,5,8,12,16,24,38,46,56,72};
        int target = 24;

        int result = linearSearched(arr, target);

        if(result != -1)
        {
            System.out.printf("찾는 요소 %d는 배열의 인덱스 %d에 있습니다.", target, result);
        }
        else
        {
            System.out.printf("찾는 요소 %d를 배열에서 찾을 수 없습니다.");
        }

    }
}
