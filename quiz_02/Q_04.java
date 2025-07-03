package quiz_02;
// i와 j의 값이 어떻게 바뀌는지 규칙을 찾아라
public class Q_04 {
    public static void main(String[] args) {
        int[] nums = {9, 8, 2, 4, 3};
        System.out.println(nums);
        int sum = 0;
        for (int i = 1; i < nums.length; i++) {
        // i는 회전수
            for (int j = 0; j < nums.length - i; j++) {
            // 1회전 일때는 j의 끝값이 4
                if (nums[j] > nums[j+1]) {
                    sum = nums[j];
                    nums[j] = nums[j + 1];
                    nums[j + 1] = sum;
                }
                System.out.println(sum);
            }
        }
    }
}
