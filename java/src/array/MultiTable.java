package array;

public class MultiTable {
	public static void main(String[] args) {
		if (args.length == 0) { // 명령행 매개변수가 없으면 안내문을 출력하고 프로그램을 종료한다.
			System.out.println("단을 입력하세요.");
			System.exit(0); // 프로그램을 종료한다.
		}
		int dan = Integer.parseInt(args[0]); // 첫번째 매개변수값을 숫자로 바꾼다.
		for (int i = 1; i <= 9; i++) {
			System.out.println(dan + "x" + i + "=" + dan * i);
		}
	}
}
