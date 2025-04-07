package array;

public class MinMax {
	public static void main(String[] args) {
		int[] nums = { 77, 88, 99, -15, 50, 85, 3, 250 };
		int sum = 0, max = 0, min = 100;

		for (int a : nums) {
			sum += a;
			if (a >= max)
				max = a;
			if (a < min)
				min = a;
		}
		System.out.println("합계: " + sum + "\n최대값: " + max + "\n최소값: " + min);
	}
}
