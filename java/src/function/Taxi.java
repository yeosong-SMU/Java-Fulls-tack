package function;

import java.util.Scanner;

public class Taxi {
	static int taxi(int km) {
		int cost = 0;
		int m = km * 1000;
		if (m <= 2000) {
			cost = 4800; // 기본요금
		} else {
			int temp = m - 2000;
			cost = 4800 + (int) ((temp / 140.0) * 150);
		}
		return cost;
	}

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		while (true) {
			System.out.print("운행거리를 입력하세요:");
			int km = scan.nextInt();
			if (km == 0)
				break;
			int result = taxi(km);
			System.out.println("운행거리: " + km + "km, 요금: " + String.format("%,d", result) + "원");
		}
		System.out.println("프로그램을 종료합니다.");
	}
}
