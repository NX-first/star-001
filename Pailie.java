import java.util.Arrays;
public class Pailie {
	public static void main(String[] args) {
	int max = 100;
	int[] nums = new int[100];
	for (int i = 0; i < 100; i++) {
	int num = (int) (Math.random() * (max + 1));
	nums[i] = num;
	}
	for (int a : nums) {
		System.out.print(a + ",");
	}
	System.out.println();
	for (int i = 1; i < nums.length; i++) {
		for (int j = 0; j < i - 1; j++) {
			if (nums[j] > nums[i]) {
				int temp = nums[j];
				nums[j] = nums[i];
				nums[i] = temp;
			}
		}
	}
	System.out.println(Arrays.toString(nums));
	}
}
 

