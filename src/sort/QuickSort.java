package sort;

/**
 * 퀵 정렬
 * 기존값 (pivot)을 선정해 해당값보다 작은 데이터와 큰 데이터로 분류하는것을 반복해 정렬하는 알고리즘
 * 시간 복잡도 nlogn -> 평균 최악 -> n제곱
 * <p>
 * pivot 을 중심으로 계속 데이터를 2개의 집합으로 나누면서 정렬하는것이 핵심
 * <p>
 * 퀵 정렬 과정
 * 1. 데이터를 분할하는 pivot 설정
 * 2. pivot을 기준으로 a~e 과정을 거쳐 데이터를 2개의 집합으로 분리
 * 2-a start 가 가르키는 데이터가 pivot이 가르키는 데이터보다 작으면 start를 오른쪽을 이동
 * 2-b end가 가리키는 데이터가 pivot이 가리키는 데이터 보다 크면 end를 왼쪽으로 1칸 이동
 * 2-c start가 가리키는 데이터가 pivot이 가리키는 데이터보다 크고 end가 가리키는 데이터가 pivot 이 가리키는 데이터보다 작으면
 * start ,end 를 swap 연산 start 는 오른쪽 ,end는 왼쪽으로 1칸 이동
 * 2-d start와 end가 만날떄까지 2-a~ 2-c 반복
 * 2-e start 와 end가 만나면 만난 지점에서 가리킨느 데이터와 pivot이 가리키는 데이터 비교하여
 * pivot이 가리키는 데이터가 크면 만난 지점의 오른쪽 , 작으면 만난 지점에 왼쪽에 pivot이 가리키는 데이터 삽입
 * <p>
 * 3 분리 집합에서 각각 다시 pivot 선정
 * 4 분리 집합이 1개 이하가 될떄까지 1~3 반복복
 * <p>
 * <p>
 * a b c d e f g h 가 있을때 h 가 피벗일떄
 * 2번을 반복하면 h보다 작은 부분과 큰 지점이나오고
 * h 보다 작은 부분 반복 h 보다 큰부분 반복하다보면 정렬완료
 * <p>
 * https://www.notion.so/4-a50a4c6ad23a477498d8ae5561d1b92f?pvs=4#2b66c3c51caf4eb69f78cf208ee83d23
 * 테스트
 */

public class QuickSort {

    public static void main(String[] args) {

        int [] array = {1,5,3,230,24,8};
        leftPivotSort(array, 0, array.length - 1);


        for (int i = 0; i < array.length; i++) {
            System.out.println(array[i]);
        }
    }


    public static void leftPivotSort(int[] array, int low, int high) {

        /*
         *  low가 high보다 크거나 같다면 정렬 할 원소가
         *  1개 이하이므로 정렬하지 않고 return한다.
         */
        if (low >= high) {
            return;
        }

        /*
         * 피벗을 기준으로 요소들이 왼쪽과 오른쪽으로 약하게 정렬 된 상태로
         * 만들어 준 뒤, 최종적으로 pivot의 위치를 얻는다.
         *
         * 그리고나서 해당 피벗을 기준으로 왼쪽 부분리스트와 오른쪽 부분리스트로 나누어
         * 분할 정복을 해준다.
         *
         * [과정]
         *
         * Partitioning:
         *
         *   a[left]          left part              right part
         * +---------------------------------------------------------+
         * |  pivot  |    element <= pivot    |    element > pivot   |
         * +---------------------------------------------------------+
         *
         *
         *  result After Partitioning:
         *
         *         left part          a[low]          right part
         * +---------------------------------------------------------+
         * |   element <= pivot    |  pivot  |    element > pivot    |
         * +---------------------------------------------------------+
         *
         *
         *  result : pivot = low
         *
         *
         *  Recursion:
         *
         * leftPivotSort(a, low, pivot - 1)     leftPivotSort(a, pivot + 1, high)
         *
         *         left part                           right part
         * +-----------------------+             +-----------------------+
         * |   element <= pivot    |    pivot    |    element > pivot    |
         * +-----------------------+             +-----------------------+
         * low                pivot - 1        pivot + 1                 high
         *
         */
        int pivot = partition(array, low, high);

        leftPivotSort(array, low, pivot - 1);
        leftPivotSort(array, pivot + 1, high);
    }

    public static int partition(int[] a, int left, int right) {

        int low = left;
        int high = right;
        int pivot = a[left];        // 부분리스트의 왼쪽 요소를 피벗으로 설정

        // low가 high보다 작을 때 까지만 반복한다.
        while (low < high) {

            /*
             * high가 low보다 크면서, high의 요소가 pivot보다 작거나 같은 원소를
             * 찾을 떄 까지 high를 감소시킨다.
             */
            while (a[high] > pivot && low < high) {
                high--;
            }

            /*
             * high가 low보다 크면서, low의 요소가 pivot보다 큰 원소를
             * 찾을 떄 까지 low를 증가시킨다.
             */
            while (a[low] <= pivot && low < high) {
                low++;
            }

            // 교환 될 두 요소를 찾았으면 두 요소를 바꾼다.
            swap(a, low, high);
        }
        /*
         *  마지막으로 맨 처음 pivot으로 설정했던 위치(a[left])의 원소와
         *  low가 가리키는 원소를 바꾼다.
         */
        swap(a, left, low);

        // 두 요소가 교환되었다면 피벗이었던 요소는 low에 위치하므로 low를 반환한다.
        return low;

    }

    public static void swap(int[] array, int i, int j) {
        int temp = array[i];
        array[i] = array[j];
        array[j] = temp;
    }
}
