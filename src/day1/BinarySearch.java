package day1;

public class BinarySearch {

    /**
     * 데이터가 정렬되 있는 배열에서 특정한 값을 찾아내는 알고리즘,
     * 배열의 중간에 있는 임의의 값을 선택해 찾고자 하는 값 X와 비교하여
     * X가 중간 값보다 작으면 중간 값을 기준으로 좌측의 데이터를 대상 , X가 중간값보다 크면 배열의 우측을 대상으로 탐색
     * 동일한 방법으로 다시 중간의 값을 임의로 선택하고 비교하여 값을 찾을 때 까지 반복한다.
     **/


    //찾고자 하는 값을 배열에서 몇뻔째 위치 했는지 알려준다.
    public int binarySearch(int arr[], int target) {


        int low = 0;
        int mid = 0;
        int high = arr.length - 1;


        while (high >= low) {
            mid = (high + low) / 2;

            if (arr[mid] == target) {
                return mid;
            } else if (arr[mid] > target) {
                high = mid - 1;

            } else {
                low = mid + 1;
            }

        }

        return -1;
    }

    public static void main(String[] args) {

        BinarySearch binarySearch = new BinarySearch();
        int binarySearchIntArray1[] = {5, 10, 15, 20, 25, 30, 35};
        int target1 = 25;
        int result = 0;
        result = binarySearch.binarySearch(binarySearchIntArray1, target1);
        System.out.println("result :" + result);


        int binarySearchIntArray2[] ={5,10,15,20,25,30,35};
        int target2 = 5;

        result = binarySearch.binarySearch(binarySearchIntArray2, target2);
        System.out.println("result :" + result);


        int binarySearchIntArray3[] ={5,10,15,20,25,30,35};
        int target3 = 27;

        result = binarySearch.binarySearch(binarySearchIntArray3, target3);
        System.out.println("result :" + result);




    }
}
