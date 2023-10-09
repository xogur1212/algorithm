package sort;

/**
 * 시간 복잡도 o(n제곱) 느리지만 구현이 쉬움
 *
 * 현재 정렬된 데이터 범위내에서 적절한 위치에 삽입하는 방법
 *
 *  1. 현재 인덱스에 있는 데이터 값 선택
 *  2. 현재 선택한 데이터가 정렬된 데이터 범위에 삽입될 위치에 탐색
 *  3. 삽입 위치부터 index에 있는 위치까지 shift 연산
 *  4. 삽입 위치에 현재 선택한 데이터 삽입하고 index++ 연산
 *  5. 전체 데이터의 크기만큼 index가 커질 떄까지 , 선태할 데이터가 없을떄까지 반복
 */

public class InsertSort {


    private static void insertionSort(int[] array, int size) {


        for(int i = 1; i < size; i++) {
            // 타겟 넘버
            int target = array[i];

            int j = i - 1;

            // 타겟이 이전 원소보다 크기 전 까지 반복
            while(j >= 0 && target < array[j]) {
                array[j + 1] = array[j];	// 이전 원소를 한 칸씩 뒤로 미룬다.
                j--;
            }

            /*
             * 위 반복문에서 탈출 하는 경우 앞의 원소가 타겟보다 작다는 의미이므로
             * 타겟 원소는 j번째 원소 뒤에 와야한다.
             * 그러므로 타겟은 j + 1 에 위치하게 된다.
             */
            array[j + 1] = target;
        }

    }


}
