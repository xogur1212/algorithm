package day3;

import java.util.ArrayList;
import java.util.List;

/**
 * Given an integer array nums, return an integer array counts where counts[i] is the number of smaller elements to the right of nums[i].
 *
 * 시간복잡도를 o(N2)으로 했을때 문제가 있어서
 *
 * bit로 풀어야 된다고한다...
 */
public class Sort1Answer {

    public static void main(String[] args) {
        int nums[] = {5, 2, 6, 1};
        List<Integer> result = countSmaller(nums);
        System.out.println(result);
    }

    public static List<Integer> countSmaller(int[] nums) {
        List<Integer> result = new ArrayList<>();

        for (int i = 0; i < nums.length; i++) {
            int count = insertionSort(nums, i);
            result.add(count);
        }

        return result;
    }

    public static int insertionSort(int[] nums, int index) {
        int count = 0;
        int value = nums[index];

        for (int i = index + 1; i < nums.length; i++) {
            if (nums[i] < value) {
                count++;
            }
        }

        return count;
    }
}