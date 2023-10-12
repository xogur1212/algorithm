package day1;

/**
 *
 * 병합정렬
 *
 * 분할 정복 방식을 사용해 데이터 분할 , 분할한 집합을 정렬하며 합치는 알고리즘
 *  시간 복잡도 O(nlogn)
 *
 *  예를 들어 42 32 24 60 15 5 90 45 라는 배열이 있을떄
 *  하나씩 set로 나누고
 *  하나씩을 두개로 만들면서 정렬하고
 *  두개를 4개로 만들면서 정렬하고
 *  4개를 8개로 다시 만들면 정렬하는 과정을 가짐짐
 *
 *  n번에 데이터 access를 하는데 이걸 logn먼 진행하기떄문에
 *
 *  시간복잡도 o(nlogn)
 *
 *  2개의 그룹을 병합하는 원리는 자주 문제에 나옴
 *
 *  투포인터 개념을 이용해 왼쪽 오른쪽 그룹을 병합함
 *  왼쪽 포인터와 오른쪽 포인터의 갑을 비교해 작은 값을 결봐 배열에 추가하고 포인터를 오른쪽으로 1칸 이동
 *
 *  24 32 42 60 5 15 45 90 이라면면
 *
 *  24에 포인터1이 있고 5에 포인터 2가 있다면
 *
 *  24와 5를 비교해여 5를 배열에 저장하고
 *
 * 넣은애에 인덱스 증가
 *
 * 24와 15를 비교 15를 넣고
 *
 * 24와 45를 비교 24를 넣고
 * 32와 45를 비교하는 방식으로 진행됨됨
*
*/
public class MergedSort {

    public static void main(String[] args) {

        int[] array = {24,32,42,60,5,15,45,90};
         mergeSort(array,0, array.length -1);

    }


    private static void mergeSort(int[] array, int left, int right) {

        //더이상 쪼갤수 없다면
        if(left == right) return;

        int mid = (left + right) / 2;	// 절반 위치

        mergeSort(array, left, mid);		// 절반 중 왼쪽 부분리스트(left ~ mid)
        mergeSort(array, mid + 1, right);	// 절반 중 오른쪽 부분리스트(mid+1 ~ right)

        merge(array, left, mid, right);		// 병합작업

    }

    private static void merge(int [] array, int left, int mid ,int right){

        int leftPoint = left;
        int rightPoint = mid +1;
        int index = left;
        int [] sortedArray =new int[array.length];

        while (leftPoint <= mid && rightPoint <= right) {

            //왼쪽 부분리스트에 1번째 원소가 오른쪽 부분 리스트 r 번쨰 원소보다 작거나 같을 경우
            //왼쪽부터 1번째 원소를 새 배열에 넣고 leftValue 와 idx 1 증가
            if(array[leftPoint] <= array[rightPoint]){

                sortedArray[index] = array[leftPoint];
                index++;
                leftPoint++;
            }
            // 오른쪽 부분리스트 rightPoint 번째 원소가 왼쪽 부분리스트 1번째 원소보다 작건 ㅏ같을경우
            // 오른쪽에 rightPoint 번째 원소에 새배열 넣고 r , idx 증가

            else{
                sortedArray[index] = array[rightPoint];
                index++;
                rightPoint++;
            }


        }

        // 왼쪽 다 찾는데 오른쪽 아직 덜찼으면

        if(leftPoint > mid) {
            while(rightPoint <= right) {
                sortedArray[index] = array[rightPoint];
                index++;
                rightPoint++;
            }
        }

        //오른쪽 먼저 다 찼으면

        else{
            while(leftPoint <= mid) {
                sortedArray[index] = array[leftPoint];
                index++;
                leftPoint++;
            }
        }

        // 다시 기존 배열 복사

        for(int i = left ; i<= right ; i++){
            array[i] = sortedArray[i];
        }
    }
}
