class Solution {
    public int minimumSum(int num) {

        // 4개 짜르기
        int[] array = new int[4];
        int temp =0;
        for(int i = 0; i < 4 ; i++){
            array[i] = num % 10 ;
            num = num /10 ;
        }
        
    
  
        // 버블 정렬
      bubble_sort(array, 4);

        // 0이 있을경우와 없는 경우 나누기

        // 없는경우 작은수부터 10의 자리만듬
       return array[0] * 10 + array[1] * 10  + array[2] + array[3];
        
        // 0이 한개 두자리 한자리

        // 0이 두개 한자리 한자리

        // 0 이 3개 0아닌게 정답
    }

            private static void bubble_sort(int[] a, int size) {
		
		// round는 배열 크기 - 1 만큼 진행됨 
		for(int i = 1; i < size; i++) {
			
			// 각 라운드별 비교횟수는 배열 크기의 현재 라운드를 뺀 만큼 비교함
			for(int j = 0; j < size - i; j++) {
				
				/*
				 *  현재 원소가 다음 원소보다 클 경우
				 *  서로 원소의 위치를 교환한다. 
				 */
				if(a[j] > a [j + 1]) {
					swap(a, j, j + 1);
				}
			}
		}
	}
	
	private static void swap(int[] a, int i, int j) {
		int temp = a[i];
		a[i] = a[j];
		a[j] = temp;
	}
}