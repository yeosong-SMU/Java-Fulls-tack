package io;

import java.io.IOException;

public class InputStreamEx {
	public static void main(String[] args) {
		int a = 0;
		try {
			System.out.println("Input: ");
			a = System.in.read(); // 키보드로 1개의 문자를 입력받는다.
			while (a != 13) {
				System.out.println(a + "==>" + (char) a);
				a = System.in.read();
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
