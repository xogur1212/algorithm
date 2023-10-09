package sort;

/**
 * 최대나 최소 데이터를 데이터가 나열된 순으로 찾아 가며 선택하는 방법
 * r구현 복잡 시간복잡도 n제곱이라 코테에서 잘 사용하지않음
 * <p>
 * 최솟값 or 최댓값 찾고 남ㅈ은 정렬 부분의 가장 앞에 있는 데이터와 swap 함
 * <p>
 * 42 32 24 60 15  -> 15 32 24 60 42
 * 32부터만 남은 정렬임
 * <p>
 * 15 32 24 60 42 -> 15 24 32 60 42
 * 32부터 42까지만 남은 정렬렬
 * <p>
 * 1 남은 정렬 부분에서 최솟값 또는 최댓값 찾음
 * <p>
 * 2 남은 정렬 부분에서 가장 앞에 있는 데이터와 선택한 데이터 swap
 * <p>
 * 3 가장 앞에 있는 데이터의 위치를 변경해 남은 정렬의 범위 축소
 * <p>
 * 4 전체 데이터 크기만큼 index가 커질떄까지 반복
 * <p>
 * 5 시간 복잡도  , T(n) = (n-1)+(n-2)+(n-3)+...+1 = (n-1)*n/2
 * <p>
 * 시간복잡도는 O(n) = n^2 이다.
 * <p>
 * 불안정 정렬 중에 하나로
 * <p>
 * 중복된값 입력순서와 동일하지 않게 정렬됨
 *
 * https://st-lab.tistory.com/168
 */
public class SelectSort {

    public static void main(String[] args) {

    }

    public static void selectedSort(int[] array, int size) {

        for (int i = 0; i < size - 1; i++) {
            int minIndex = i;
            //최소값 찾기
            for (int j = i + 1; j < size; j++) {
                minIndex = j;
            }

            swap(array, minIndex , i);
        }


    }

    public static void swap(int[] array ,int minIndex , int changeIndex) {
        int temp= array[minIndex];
        array[minIndex] = array[changeIndex];
        array[changeIndex] = temp;
    }
}
