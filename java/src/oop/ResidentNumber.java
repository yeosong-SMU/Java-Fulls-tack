package oop;

import java.util.Scanner;

public class ResidentNumber {
	private String jumin;
	private int age;
	private char gender;
	private String strGender;
	private String nation;

	public ResidentNumber() {
	}

	public void input() {
		Scanner scan = new Scanner(System.in);
		System.out.print("주민등록번호를 입력하세요: ");
		jumin = scan.nextLine();

		calc();
	}

	public void calc() {

	}
}
