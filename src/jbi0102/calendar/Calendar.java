package jbi0102.calendar;

import java.util.Scanner;

public class Calendar {

	public static void main(String[] args) {
		System.out.println("Hello, Calendar");
		System.out.println("일 월 화 수 목 금 토");
		System.out.println("-----------------");
		System.out.println("1 2 3 4 5 6 7");
		System.out.println("8 9 10 11 12 13 14");
		System.out.println("15 16 17 18 19 20 21");
		System.out.println("22 23 24 25 26 27 28");
		
		//숫자를 입력받아 해당하는 최대 일수를 출력하는 프로그램
		Scanner sc = new Scanner(System.in);
		System.out.print("알고 싶은 달을 입력 : ");
		int month = Integer.parseInt(sc.next());
		int[] lastDay = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
		System.out.println("입력하신 달" + month + "의 마지막 일은 " + lastDay[month - 1]);
	}

}
