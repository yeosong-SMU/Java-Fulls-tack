package array;

import java.util.Random;

public class RandomEx {
	public static void main(String[] args) {
		Random rand = new Random();
		// Random rand = new Random(10); //random seed
		int[] nums = new int[10];
		for (int i = 0; i < nums.length; i++) {
			nums[i] = rand.nextInt(100) + 1;
			System.out.println(nums[i]);
		}
	}
}
