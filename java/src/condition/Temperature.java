package condition;

import java.util.Scanner;

public class Temperature {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("1.섭씨->화씨 변환 2.화씨->섭씨 변환\n원하는 번호를 입력하세요:");
		int answer = sc.nextInt();
		double temp = 0;
		if (answer == 1) {
			System.out.print("섭씨 온도를 입력하세요:");
			temp = sc.nextDouble();
			temp = temp * 1.8 + 32;
			System.out.println(String.format("%5.2f", temp));
		} else if (answer == 2) {
			System.out.print("화씨 온도를 입력하세요:");
			temp = sc.nextDouble();
			temp = (temp - 32) / 1.8;
			System.out.println(String.format("%5.2f", temp));
		} else {
			System.out.println("잘못된 번호를 입력했습니다.");
		}
	}
}
