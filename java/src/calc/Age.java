package calc;

import java.util.Scanner;

public class Age {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("이름을 입력해주세요: ");
		String name = sc.next();
		System.out.print("출생연도를 입력해주세요: ");
		int birth = sc.nextInt();

		int age = 2025 - birth;
		System.out.println(name + "님의 나이는 " + age + "세입니다.");
		System.out.print("올해 건강검진 ");
		System.out.println(birth % 2 == 0 ? "대상입니다." : "비대상입니다.");

//		String result = birth % 2 == 0? "대상" : "비대상";
//		System.out.println("올해 건강검진 " + result + "입니다.");
	}
}
