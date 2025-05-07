package loop;

import java.util.Scanner;

public class InputSum {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("n을 입력하세요:");
		int num = sc.nextInt();

		int zak = 0, hol = 0;

		// 시스템의 현재 시각
		long start = System.currentTimeMillis();
		for (int i = 1; i <= num; i++) {
			if (i % 2 == 0) {
				zak += i;
			} else {
				hol += i;
			}
		}
		long end = System.currentTimeMillis();

		System.out.println("1~" + num + "까지의 홀수 합계 : " + hol);
		System.out.println("1~" + num + "까지의 짝수 합계 : " + zak);
		System.out.println("실행시간:" + (end - start));
	}
}
