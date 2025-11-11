package io;

import java.io.IOException;
import java.io.InputStreamReader;
import java.io.Reader;

public class ReaderEx {
	public static void main(String[] args) {
		int var = 0;
		Reader input = new InputStreamReader(System.in); // InputStream은 1바이트씩 읽으므로 한글이 깨진다. 한글 처리를 위해 Reader를 사용한다.
		System.out.println("input: ");
		try {
			while (true) {
				var = input.read(); // 1개의 문자를 읽는다.
				if (var == 13)
					break;
				System.out.println(var + "==>" + (char) var);
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
