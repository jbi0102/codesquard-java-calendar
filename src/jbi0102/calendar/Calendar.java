package jbi0102.calendar;

import java.util.Scanner;

public class Calendar {

	private static final int[] MAX_DAYS = { 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31 };

	public int getMaxDaysOfMonth(int month) {
		return MAX_DAYS[month - 1];
	}

	public void printMoth() {
		System.out.println("Hello, Calendar");
		System.out.println("일 월 화 수 목 금 토");
		System.out.println("-----------------");
		System.out.println("1 2 3 4 5 6 7");
		System.out.println("8 9 10 11 12 13 14");
		System.out.println("15 16 17 18 19 20 21");
		System.out.println("22 23 24 25 26 27 28");
	}

	public static void main(String[] args) {

		// 숫자를 입력받아 해당하는 최대 일수를 출력하는 프로그램
		String prompt = "cal>";
		
		Scanner sc = new Scanner(System.in);
		Calendar cal = new Calendar();
		System.out.print("반복 횟수를 입력하세요 : ");
		int loopNum = sc.nextInt();


//		for (int i = 0; i < loopNum; i++) {
//			System.out.println("알고 싶은 달을 입력 ");
//			System.out.print(prompt);
//			int month = Integer.parseInt(sc.next());
//			System.out.println("입력하신 달 " + month + "월의 마지막 일은 " + cal.getMaxDaysOfMonth(month));
//		}
		
		
		sc.close();
	}

}
