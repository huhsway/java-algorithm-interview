package ch07;

import java.util.Arrays;

// 내 생각에 수학적 센스 약간 필요 사고 해야함
public class P11_1 {

    public static int[] productExceptSelf(int[] nums) {
        int[] result = new int[nums.length];
        // 왼쪽 곱셈
        int p = 1;
        for (int i = 0; i < nums.length; i++) {
            result[i] = p;
            // 왼쪽 곱셈 결과
            p *= nums[i];
        }
        // 오른쪽 곱셈, 왼쪽 곱셈 결과에 차례대로 곱하기
        p = 1;
        for (int i = nums.length - 1; i >= 0; i--) {
            result[i] *= p;
            // 오른쪽 곱셈 결과
            p *= nums[i];
        }
        return result;
    }

    public static void main(String[] args) {
        int[] nums = {1, 3, 5, 7};
        System.out.println(Arrays.toString(productExceptSelf(nums)));
    }
}
